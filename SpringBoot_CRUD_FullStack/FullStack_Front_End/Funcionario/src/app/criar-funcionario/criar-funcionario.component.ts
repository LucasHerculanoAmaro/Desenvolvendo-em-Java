import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../Funcionario';

@Component({
  selector: 'app-criar-funcionario',
  templateUrl: './criar-funcionario.component.html',
  styleUrls: ['./criar-funcionario.component.css']
})
export class CriarFuncionarioComponent implements OnInit {

  funcionario: Funcionario = new Funcionario();
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.funcionario)
  }

}
