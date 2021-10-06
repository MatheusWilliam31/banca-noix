<<<<<<< HEAD
import { FullCalendarComponent } from './components/full-calendar/full-calendar.component';
=======
>>>>>>> e76ddb4e09dff90aa37a2359890b0a3288993afe
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { ListarEventoComponent } from '../components/evento/listar-evento/listar-evento.component';
import { CadastrarEventoComponent } from '../components/evento/cadastrar-evento/cadastrar-evento.component';
import { AtualizarEventoComponent } from '../components/evento/atualizar-evento/atualizar-evento.component';

const routes: Routes = [
<<<<<<< HEAD
    { path: 'calendario', component: FullCalendarComponent, data: { breadcrumb: 'Calendario'}},   
=======
    {path: 'cadastrar-evento', component: CadastrarEventoComponent, data: { breadcrumb: 'Evento'} },
    {path: 'listar-evento', component: ListarEventoComponent, data: { breadcrumb: 'Evento' } },
    {path: 'atualizar-evento', component: AtualizarEventoComponent, data: { breadcrumb: 'Evento'} }
   
>>>>>>> e76ddb4e09dff90aa37a2359890b0a3288993afe
];
@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class EventoRoutingModule {}
