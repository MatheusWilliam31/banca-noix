import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { ListarEventoComponent } from '../components/evento/listar-evento/listar-evento.component';
import { CadastrarEventoComponent } from '../components/evento/cadastrar-evento/cadastrar-evento.component';
import { AtualizarEventoComponent } from '../components/evento/atualizar-evento/atualizar-evento.component';

const routes: Routes = [
    {path: 'cadastrar-evento', component: CadastrarEventoComponent, data: { breadcrumb: 'Evento'} },
    {path: 'listar-evento', component: ListarEventoComponent, data: { breadcrumb: 'Evento' } },
    {path: 'atualizar-evento', component: AtualizarEventoComponent, data: { breadcrumb: 'Evento'} }
   
];
@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class EventoRoutingModule {}
