import { UsuarioService } from './../../../../../service/usuario/usuario.service';
import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/model/usuario/usuario';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit{

  selectedUsuario?: Usuario;

  usuario: Usuario[] = [];
  getUsuario: any;

  constructor ( private usuarioservice: UsuarioService ) { }

  ngOnInit ( ) {
    this.getUsuario ( );
    }
    
  }
