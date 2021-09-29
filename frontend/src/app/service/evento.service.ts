import { Http, Response } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable()

export class EventoService {

  private id: number[];
  private nome: string[];
  private valor: number[];
  private situacao: any[];
  private patrocinador: string[];


  constructor(private http: Http) {}
  this.baseUrl = ''
}
