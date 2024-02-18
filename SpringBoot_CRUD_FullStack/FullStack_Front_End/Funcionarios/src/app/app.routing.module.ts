import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FuncionarioListaComponent } from './funcionario-lista/funcionario-lista.component';


const routes: Routes = [

{path: '', redirectTo: 'funcionario-lista', pathMatch: 'full'},
{path: 'funcionario-lista', component: FuncionarioListaComponent}

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports:[RouterModule]
})

export class AppRoutingModule{}