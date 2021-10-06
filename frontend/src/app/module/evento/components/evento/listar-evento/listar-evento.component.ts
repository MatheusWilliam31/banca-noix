import { Component, OnInit } from '@angular/core';
import { Evento } from 'src/app/model/Evento';
import { EventoService } from 'src/app/service/evento/evento.service';

@Component({
  selector: 'app-listar-evento',
  templateUrl: './listar-evento.component.html',
  styleUrls: ['./listar-evento.component.css']
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
      this.service.listarEvento().subscribe(
        (data: Evento[]) => {
        this.eventos = data;
    },
           (error: any) => {
          this.error = error;
      });
    }

}
