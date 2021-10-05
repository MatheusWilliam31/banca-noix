import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
import { ListarEventoComponent } from '../components/evento/listar-evento/listar-evento.component';



@NgModule({
  declarations: [
    ListarEventoComponentent
  ],
  imports: [
    CommonModule,
    EventoRoutingModule,
    SharedModule
    
  ]
})
export class EventoModule { }
