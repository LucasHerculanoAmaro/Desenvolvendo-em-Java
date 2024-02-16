import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { FuncionarioListaComponent } from "./funcionario-lista/funcionario-lista.component";
import { HttpClientModule } from '@angular/common/http';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, FuncionarioListaComponent]
})
export class AppComponent {
  title = 'Funcionarios';
}
