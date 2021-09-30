import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
 
  constructor(private http: HttpClient){ }

private readonly API =  "htttps://localhost:4200/list"


  list(){
    return this.http.get<>(this.API);
  }


}
