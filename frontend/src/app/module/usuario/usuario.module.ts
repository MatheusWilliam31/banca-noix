import { ListarUsuariosComponent } from './components/listar-usuarios/listar-usuarios.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioRoutingModule } from './usuario-routing.module';

@NgModule({
  declarations: [
    ListarUsuariosComponent
  ],
  imports: [
    CommonModule,
    UsuarioRoutingModule,
    SharedModule,
  ]
})
export class UsuarioModule { }