import { Component, OnInit } from '@angular/core';
import { Evento } from 'src/app/model/Evento';
import { EventoService } from 'src/service/evento/evento.service';

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.css']
})
export class CarouselComponent implements OnInit {

  evento: Evento[];

  responsiveOptions;
  constructor(private eventoService: EventoService) { 
      this.responsiveOptions = [
          {
              breakpoint: '1024px',
              numVisible: 3,
              numScroll: 3
          },
          {
              breakpoint: '768px',
              numVisible: 2,
              numScroll: 2
          },
          {
              breakpoint: '560px',
              numVisible: 1,
              numScroll: 1
          }
      ];
  }

  ngOnInit() {
      this.eventoService.listarEvento().subscribe(evento => {
          this.evento = evento
      });
  }
}