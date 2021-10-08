import { ListarUsuariosComponent } from './components/usuario/listar-usuarios/listar-usuarios.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule, Component } from '@angular/core';

import { UsuarioRootComponent } from './usuario-root.component';
import { CadastrarUsuarioComponent } from './components/usuario/cadastrar-usuario/cadastrar-usuario.component';

const routes: Routes = [
  { path: '', component: UsuarioRootComponent, data: { breadcrumb: 'Usuário' }, 
  children: [
    { path: '', component: ListarUsuariosComponent, data: { breadcrumb: 'Usuário' }},
    { path: 'cadastrar' , component: CadastrarUsuarioComponent, data: {breadcrumb: 'Cadastrar'}},
    { path: 'editar/:id' , component: CadastrarUsuarioComponent, data: {breadcrumb: 'Editar'}},
  ]}
  
// TODO: reavaliar alocação de rotas
//   { path: '', component: UsuarioComponent, pathMatch: 'full', children: [
//     { path: '', redirectTo: 'listar'},
//     { path: 'listar', component: ListarUsuariosComponent}
//   ]}
// ];

];
@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class UsuarioRoutingModule { }
