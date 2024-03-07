import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AtualizarFuncionarioComponent } from './atualizar-funcionario/atualizar-funcionario.component';
import { CriarFuncionarioComponent } from './criar-funcionario/criar-funcionario.component';
import { DetalhesFuncionarioComponent } from './detalhes-funcionario/detalhes-funcionario.component';
import { FuncionarioListaComponent } from './Funcionario-Lista/Funcionario-Lista.component';

const routes: Routes = [
  { path: '', redirectTo: 'funcionarios', pathMatch: 'full'},
  { path: 'funcionarios', component: FuncionarioListaComponent},
  { path: 'criar-funcionario', component: CriarFuncionarioComponent},
  { path: 'atualizar-funcionario/:id', component: AtualizarFuncionarioComponent},
  { path: 'detalhes-funcionario/:id', component: DetalhesFuncionarioComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
