import { AtualizarEventoComponent } from './components/evento/atualizar-evento/atualizar-evento.component';
import { CadastrarEventoComponent } from './components/evento/cadastrar-evento/cadastrar-evento.component';
import { ListarEventoComponent } from './components/evento/listar-evento/listar-evento.component';
import { FullCalendarComponent } from './components/evento/full-calendar/full-calendar.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EventoRoutingModule } from './evento-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
import { FullCalendarModule} from '@fullcalendar/angular';
import { CarouselComponent } from './components/evento/carousel/carousel.component';
import { CarouselModule } from 'primeng';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    CarouselComponent,
    ListarEventoComponent,
    AtualizarEventoComponent,
    CadastrarEventoComponent,
    FullCalendarComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule, 
    ReactiveFormsModule,
    CommonModule,
    EventoRoutingModule,
    SharedModule,
    FullCalendarModule,
    CarouselModule,
    
  ],
  providers: [],
})
export class EventoModule { }
