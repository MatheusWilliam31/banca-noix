<<<<<<< HEAD
import { ListarUsuariosComponent } from './components/listar-usuarios/listar-usuarios.component';
=======
import { ListarUsuariosComponent } from '../components/usuario/listar-usuarios/listar-usuarios.component';
>>>>>>> e76ddb4e09dff90aa37a2359890b0a3288993afe
import { RouterModule, Routes } from '@angular/router';
import { NgModule, Component } from '@angular/core';

const routes: Routes = [
  { path: 'usuario', component: ListarUsuariosComponent, data: { breadcrumb: 'Usuário' }}
  
//   { path: '', component: UsuarioComponent, pathMatch: 'full', children: [
//     { path: '', redirectTo: 'listar'},
//     { path: 'listar', component: ListarUsuariosComponent}
//   ]}
// ];
];
@NgModule({
  imports:[
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class UsuarioRoutingModule {}
