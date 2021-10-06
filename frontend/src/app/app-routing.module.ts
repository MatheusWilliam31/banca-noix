import { DiarioErrosComponent } from './components/diario-erros/diario-erros.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginSuccessComponent } from '@nuvem/angular-base';

const routes: Routes = [
  { path: 'diario-erros', component: DiarioErrosComponent },
  { path: 'login-success', component: LoginSuccessComponent },
  { path: '', loadChildren: './module/usuario/usuario.module#UsuarioModule'},
  { path: '', loadChildren: './module/evento/evento.module#EventoModule'}
  

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
