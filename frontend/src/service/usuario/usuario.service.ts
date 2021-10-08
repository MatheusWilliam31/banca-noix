import { Injectable } from '@angular/core';
import { Usuario } from '../../app/model/usuario';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
 providedIn: 'root',
})

export class UsuarioService {

  private readonly BASE_URL: string = '/usuarios/filter';

  constructor(private http: HttpClient) {}
   
    public listar(): Observable<Usuario[]> {
      return this.http.get<Usuario[]>(`${environment.apiUrl}${this.BASE_URL}`);
    }

    public criar(usuario: Usuario): Observable<Usuario> {
      return this.http.post<Usuario>(`${environment.apiUrl}${this.BASE_URL}`, usuario);
    }


  }