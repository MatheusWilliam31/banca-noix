import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@import { Post } from ''

@Injectable({
  providedIn: 'root'
})
export class CalendarioService { 
  constructor(private http: HttpClient) { }

  getEvento() {
    return this.http.get('http://localhost:4200/calendario')
  }

  postEvento() {
    return this.http.get('http://localhost:4200/novo-evento')
  }
};
