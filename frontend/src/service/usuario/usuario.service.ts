import { Injectable } from '@angular/core';
import { Usuario } from './../../app/model/usuario/usuario';
import { HttpClient } from '@angular/common/http';

@Injectable({

 providedIn: 'root',

})
export class UsuarioService {
  private usuario: Usuario[] = [];
  

  constructor(
    private HttpClient:HttpClient,
    private Usuario : Usuario ) {}
   

    getUsuario() {
      return this.usuario;
    }
    postUsuario() {
      return this.usuario;
    }
  }