import { ListarUsuariosComponent } from './components/listar-usuarios/listar-usuarios.component';
import { SharedModule } from '../../shared/shared.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioRoutingModule } from './usuario-routing.module';
import { CriarUsuariosComponent } from './components/criar-usuarios/criar-usuarios.component';
@NgModule({
  declarations: [
    ListarUsuariosComponent,
    CriarUsuariosComponent
  ],
  imports: [
    CommonModule,
    UsuarioRoutingModule,
    SharedModule
  ]
})
export class UsuarioModule { }
