import { FullCalendarComponent } from './components/evento/full-calendar/full-calendar.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

const routes: Routes = [
    { path: 'calendario', component: FullCalendarComponent, data: { breadcrumb: 'Calendario'}},   
];
@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class EventoRoutingModule {}
