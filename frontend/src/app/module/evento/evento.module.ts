import { FullCalendarComponent } from './components/evento/full-calendar/full-calendar.component';
import  interactionPlugin  from '@fullcalendar/interaction';
import  dayGridPlugin  from '@fullcalendar/daygrid';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
import { FullCalendarModule } from '@fullcalendar/angular';

FullCalendarModule.registerPlugins([ // register FullCalendar plugins
  dayGridPlugin,
  interactionPlugin
]);

@NgModule({
  declarations: [
    FullCalendarComponent,
  ],
  imports: [
    CommonModule,
    EventoRoutingModule,
    SharedModule,
    FullCalendarModule
    
  ],
  providers: []
})
export class EventoModule { }
