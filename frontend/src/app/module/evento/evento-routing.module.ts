import { RouterModule, Routes } from '@angular/router';
import { ListarEventosComponent } from './components/listar-eventos/listar-eventos.component';
import { NgModule } from '@angular/core';


const routes: Routes = [
  { path: 'evento', component: ListarEventosComponent, data: {breadcrumb: 'Evento'} }
];

@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})

export class EventoRoutingModule { }
