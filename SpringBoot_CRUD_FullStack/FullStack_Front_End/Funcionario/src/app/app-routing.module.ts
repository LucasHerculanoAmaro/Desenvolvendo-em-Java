import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CriarFuncionarioComponent } from './criar-funcionario/criar-funcionario.component';
import { FuncionarioListaComponent } from './Funcionario-Lista/Funcionario-Lista.component';

const routes: Routes = [
  { path: '', redirectTo: 'funcionarios', pathMatch: 'full'},
  { path: 'funcionarios', component: FuncionarioListaComponent},
  { path: 'criar-funcionario', component: CriarFuncionarioComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
