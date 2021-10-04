import { CadastrarEventoComponent } from './components/cadastrar-evento/cadastrar-evento.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

const routes: Routes = [
    {path: 'cadastrar', component: CadastrarEventoComponent, data: { breadcrumb: 'Evento'} }
];

@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class EventoRoutingModule {}
    