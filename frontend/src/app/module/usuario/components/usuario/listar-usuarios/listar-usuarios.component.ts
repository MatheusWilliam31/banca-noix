import { UsuarioService } from '../../../../../../service/usuario/usuario.service';
import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/model/usuario';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-listar-usuarios',
  templateUrl: './listar-usuarios.component.html',
  styleUrls: ['./listar-usuarios.component.css'],
  providers: [UsuarioService]
})
export class ListarUsuariosComponent implements OnInit {

  public usuarios: Usuario[];

  constructor(
    private usuarioService: UsuarioService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.listarUsuario();
  }

  public listarUsuario(): void{
    this.usuarioService.listar().subscribe((usuarios: Usuario[]) => {
      this.usuarios = usuarios;
    }, () => console.log("ERRO"));
  }

  public editar(id) {
    this.router.navigate(['editar', id], { relativeTo: this.route});
  }
}
