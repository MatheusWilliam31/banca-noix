import { UsuarioService } from '../../../../../../service/usuario/usuario.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-listar-usuarios',
  templateUrl: './listar-usuarios.component.html',
  styleUrls: ['./listar-usuarios.component.css'],
  providers: [UsuarioService]
})
export class ListarUsuariosComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    
  }

}
