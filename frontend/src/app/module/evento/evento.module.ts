import { SharedModule } from './../../shared/shared.module';
import { EventoRoutingModule } from './evento-routing.module';
import { ListarEventosComponent } from './components/listar-eventos/listar-eventos.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



@NgModule({
  declarations: [
    ListarEventosComponent
  ],
  imports: [
    CommonModule,
    EventoRoutingModule,
    SharedModule
  ]
})
export class EventoModule { }
