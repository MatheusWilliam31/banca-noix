import { EventoService } from '../../../../../../service/evento/evento.service';
import { Component, OnInit } from '@angular/core';
import { Evento } from 'src/app/model/Evento';

@Component({
  selector: 'app-listar-evento',
  templateUrl: './listar-evento.component.html',

})
export class ListarEventoComponent implements OnInit {

  eventos: Evento[] = [];
  error: any;

  constructor(private service: EventoService) {
    
  }

  ngOnInit() {
    this.getter();
  }
    
  public getter(): void {
    this.service.listarEvento().subscribe((res: Evento[]) => {this.eventos = res} , (erro: any) => {this.error = erro});  
    }

}
