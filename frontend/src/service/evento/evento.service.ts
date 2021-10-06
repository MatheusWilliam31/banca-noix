import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Evento } from 'src/app/model/Evento';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EventoService {
  private static readonly URL = environment.apiUrl;

  constructor( private http: HttpClient ) { }  

    public listarEvento(): Observable <Evento[]> {
      return this.http.get<Evento[]>('${URL}/eventos/filtros');
    }
}
