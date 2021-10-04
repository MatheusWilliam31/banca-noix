import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Evento } from 'src/app/model/Evento';

@Injectable({
  providedIn: 'root'
})
export class EventoService {
  constructor( private http: HttpClient ) { }
    public listarEvento(): Observable <any> {
      return this.http.get('http://localhost:4200/listar-evento');

    }
  


}
