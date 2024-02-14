import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario';

@Component({
  selector: 'app-funcionario-lista',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './funcionario-lista.component.html',
  styleUrl: './funcionario-lista.component.css'
})
export class FuncionarioListaComponent implements OnInit {

  funcionarios: Funcionario[] = [];

  constructor() {}

  ngOnInit(): void {
    
    this.funcionarios = [{
      "id": 1,
      "nome": "Lucas",
      "sobrenome": "Herculano",
      "email": "lucash.96@hotmail.com"
    },
    {
      "id": 2,
      "nome": "Juliana",
      "sobrenome": "Araújo",
      "email": "ju.s.araujo@hotmail.com"
    }];

  }

}
