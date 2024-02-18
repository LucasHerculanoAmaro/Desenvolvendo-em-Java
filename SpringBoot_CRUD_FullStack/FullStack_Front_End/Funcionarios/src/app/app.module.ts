import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FuncionarioListaComponent } from './funcionario-lista/funcionario-lista.component';
import { TesteComponent } from './teste/teste.component';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app.routing.module';

@NgModule({
  declarations: [	
    FuncionarioListaComponent,
    TesteComponent,
 ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
  ],
  providers: [AppComponent],
})
export class AppModule { }