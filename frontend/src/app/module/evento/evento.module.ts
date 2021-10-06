import { FullCalendarComponent } from './components/full-calendar/full-calendar.component';
import  interactionPlugin  from '@fullcalendar/interaction';
import  dayGridPlugin  from '@fullcalendar/daygrid';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
<<<<<<< HEAD
import { FullCalendarModule } from '@fullcalendar/angular';
=======
import { ListarEventoComponent } from '../components/evento/listar-evento/listar-evento.component';

>>>>>>> e76ddb4e09dff90aa37a2359890b0a3288993afe

FullCalendarModule.registerPlugins([ // register FullCalendar plugins
  dayGridPlugin,
  interactionPlugin
]);

@NgModule({
  declarations: [
<<<<<<< HEAD
    FullCalendarComponent,
=======
    ListarEventoComponentent
>>>>>>> e76ddb4e09dff90aa37a2359890b0a3288993afe
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
