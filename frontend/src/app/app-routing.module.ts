import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginSuccessComponent } from '@nuvem/angular-base';
import { UsuarioComponent } from './components/usuario/usuario.component';

const routes: Routes = [
  { path: 'diario-erros', component: DiarioErrosComponent, data: { breadcrumb: 'Diário de Erros' } },
  { path: 'login-success', component: LoginSuccessComponent },
  { path: '', component: UsuarioComponent },
  { path: '', loadChildren: './module/usuario/UsuarioRoutingModule'}

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
