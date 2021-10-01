import { ListarUsuariosComponent } from './components/listar-usuarios/listar-usuarios.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

const routes: Routes = [
  { path: 'usuario', component: ListarUsuariosComponent, data: { breadcrumb: 'Usuário' } }
  
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
