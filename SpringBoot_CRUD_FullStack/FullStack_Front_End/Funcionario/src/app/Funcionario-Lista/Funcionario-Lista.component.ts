import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-Funcionario-Lista',
  templateUrl: './Funcionario-Lista.component.html',
  styleUrls: ['./Funcionario-Lista.component.css']
})
export class FuncionarioListaComponent implements OnInit {

  funcionarios: Funcionario[] = [];

  constructor(private funcionarioService: FuncionarioService) {}

  ngOnInit(): void {

    this.getFuncionarios();

    /* Este código foi usado para testar se os métodos e rotas estavam devidamente configurados

    this.funcionarios = [
      {  "id": 1,  "nome": "Lucas",  "sobrenome": "Herculano", "email": "lucash.96@hotmail.com"  },
      {  "id": 2,  "nome": "Juliana",  "sobrenome": "Araújo",  "email": "ju.s.araujo@hotmail.com"}
    ];
    */
  }

  private getFuncionarios() {
    this.funcionarioService.getFuncionarioLista().subscribe(data => {
      this.funcionarios = data;
    })
  }
  

}
