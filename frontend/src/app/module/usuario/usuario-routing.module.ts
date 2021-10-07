import { ListarUsuariosComponent } from './components/usuario/listar-usuarios/listar-usuarios.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule, Component } from '@angular/core';
import { CadastroUsuarioComponent } from './components/usuario/cadastro-usuario/cadastro-usuario.component';

const routes: Routes = [
  { path: '', component: ListarUsuariosComponent, data: { breadcrumb: 'Usuário' }},
  { path: 'cadastrar' , component: CadastroUsuarioComponent, data: {breadcrumb: 'Cadastrar'}}
  
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
