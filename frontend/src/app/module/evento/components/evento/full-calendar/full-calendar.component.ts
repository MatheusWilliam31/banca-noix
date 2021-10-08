import { ChangeDetectionStrategy, SimpleChanges, OnChanges, Component, OnInit, ViewChild, ElementRef, AfterViewInit, OnDestroy, Input, EventEmitter, Output } from '@angular/core';
import 'fullcalendar';
import { $ } from 'protractor';
import { Evento } from 'src/app/model/Evento';

@Component({
  selector: 'app-calendar',
  template: `
  <div #calendar></div>
  `,
  styleUrls: ['./full-calendar.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class FullCalendarComponent implements AfterViewInit, OnDestroy, OnChanges {
  @Input() viewModes = ['Mês', 'agendaSemana', 'agendaDia'];
  @Input() navButtons = ['prev', 'next', 'today'];
  @Input() appointments: Evento[] = [];
  @Output() requestNewAppointment = new EventEmitter<Evento>();
  @Output() requestUpdateAppointment = new EventEmitter<Evento>();
  @Output() appointmentUpdated = new EventEmitter<Evento>();
  @ViewChild('calendar') calendar: ElementRef;
  constructor() { }

  get $Instance(): any {
    return $(this.calendar.nativeElement);
  }

  ngOnDestroy(): void {
    this.$Instance.fullCalendar('destroy');
  }

  ngOnChanges(simpleChanges: SimpleChanges): void {
    if (simpleChanges.appointments && simpleChanges.appointments.currentValue) {
      this.updateAppointments();
    }
  }

  ngAfterViewInit(): void {
    this.$Instance.fullCalendar({
      selectable: true,
      editable: true,
      eventSources: [{
        events: this.appointments || [],
      }],
      header: {
        left: this.navButtons.join(','),
        center: 'title',
        right: this.viewModes.join(',')
      },
      eventClick: (event: Evento) => {
        this.requestUpdateAppointment.emit(this.neutralize(event));
      },
      eventDrop: (event: Evento, delta, revert) => {
        this.appointmentUpdated.emit(this.neutralize(event));
      }
    });
  }

  private updateAppointments(): void {
    // we have to do it this way, because other wise the plugin is dependent on the 
    // reference of the event source. So we have to remove all event sources and add a new one
    this.$Instance.fullCalendar('removeEventoSources', this.$Instance.fullCalendar('getEventSources'));
    this.$Instance.fullCalendar('addEventoSource', { events: this.appointments });
  }

  private neutralize(event: Evento): Evento {
    // the widget mutates the appointment in many ways. We can keep it consistent with this function
    const { id, nome, data, situacao, valor } = event;
    return { id, nome, data, situacao, valor };
  }
}