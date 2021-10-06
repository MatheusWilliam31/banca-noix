import { ListarUsuariosComponent } from './components/listar-usuarios/listar-usuarios.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { CriarUsuariosComponent } from './components/criar-usuarios/criar-usuarios.component';

const routes: Routes = [
  { path: 'usuario', component: ListarUsuariosComponent, data: { breadcrumb: 'Usuário'}},
  { path: 'cadastrar', component: CriarUsuariosComponent } 

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
