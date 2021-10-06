import { FullCalendarComponent } from './components/full-calendar/full-calendar.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { CadastrarEventoComponent } from './components/cadastrar-evento/cadastrar-evento.component';

const routes: Routes = [
    { path: 'calendario', component: FullCalendarComponent, data: { breadcrumb: 'Calendario'}},
    {path: 'cadastrar-evento', component: CadastrarEventoComponent, data: { breadcrumb: 'Evento'} },
   
];
@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class EventoRoutingModule {}
