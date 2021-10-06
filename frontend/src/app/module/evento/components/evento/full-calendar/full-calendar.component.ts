import { CalendarOptions } from '@fullcalendar/angular';

import { Component } from '@angular/core';

@Component({
  selector: 'app-full-calendar',
  templateUrl: './full-calendar.component.html',
  styleUrls: ['./full-calendar.component.css']
})
export class FullCalendarComponent {
  [x: string]: any;

  calendarOptions: CalendarOptions = {
    initialView: 'dayGridMonth',
    dateClick: this.handleDateClick.bind(this), // bind is important!
    events: [
      { title: 'evento 1', date: '01-04-2021' },
      { title: 'evento 2', date: '01-04-2021' }
    ],
    weekends: false
    
  };
  toggleWeekends() {
    this.calendarOptions.weekends = !this.calendarOptions.weekends
  
  }
  handleDateClick(arg) {
    alert('Evento: ' + arg.dateStr)
  }
  getEvento() {
    let eventoApi = this.fullCalendarComponent.getApi();
    eventoApi.next();
  }

};
// document.addEventListener('evento', function() {
//   let calendarEl = document.getElementById('evento');

//   let calendar = new Calendar(calendarEl, {
//     plugins: [ dayGridPlugin, momentPlugin ],

//     // because the plugin is present, you can now use formatting strings.
//     // will produce something like "Tuesday, September 18, 2018"
//     titleFormat: 'dddd, MMMM, YYYY'
//   });

//   calendar.render();
// });