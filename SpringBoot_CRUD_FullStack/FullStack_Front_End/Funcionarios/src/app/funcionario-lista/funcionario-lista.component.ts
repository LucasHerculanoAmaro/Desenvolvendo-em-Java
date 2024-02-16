import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-funcionario-lista',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './funcionario-lista.component.html',
  styleUrl: './funcionario-lista.component.css'
})
export class FuncionarioListaComponent implements OnInit {

  funcionarios: Funcionario[] = [];

  constructor(private funcionarioService: FuncionarioService) {}

  ngOnInit(): void {

    this.getFuncionarios();

    /* Este código foi usado para testar se os métodos e rotas estavam devidamente configurados

    this.funcionarios = [
      {  "id": 1,  "nome": "Lucas",  "sobrenome": "Herculano", "email": "lucash.96@hotmail.com"  },
      { "id": 2,  "nome": "Juliana",  "sobrenome": "Araújo",  "email": "ju.s.araujo@hotmail.com"}
    ];
    */
  }

  private getFuncionarios() {
    this.funcionarioService.getFuncionarioLista().subscribe(data => {
      this.funcionarios = data;
    })
  }
  
}
