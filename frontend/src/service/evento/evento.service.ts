import { environment } from './../../environments/environment';
import { SelectItem } from 'primeng';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EventoService {
  
  private readonly BASE_URL: string = '/evento';

  
  constructor( private http: HttpClient ) { }

    public listarEvento(): Observable <SelectItem[]> {
      return this.http.get<SelectItem[]>(`${environment.apiUrl}${this.BASE_URL}`);

    }
  


}