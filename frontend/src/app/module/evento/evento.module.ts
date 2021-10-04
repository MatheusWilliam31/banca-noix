import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
import { CadastrarEventoComponent } from './components/cadastrar-evento/cadastrar-evento.component';


@NgModule({
  declarations: [
    CadastrarEventoComponent,
  ],
  imports: [
    CommonModule,
    EventoRoutingModule,
    SharedModule
    
  ]
})
export class EventoModule { }
