import { Usuario } from 'src/app/model/usuario';
import { Component, OnInit } from '@angular/core';
import { UsuarioService } from 'src/service/usuario/usuario.service';

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
