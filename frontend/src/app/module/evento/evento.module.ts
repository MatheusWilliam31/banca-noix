import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListarEventoComponent } from '../components/evento/listar-evento/listar-evento.component';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [
    ListarEventoComponent,
  ],
  imports: [
    CommonModule,
    EventoRoutingModule,
    SharedModule
    
  ]
})
export class EventoModule { }
