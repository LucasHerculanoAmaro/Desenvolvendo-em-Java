import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Funcionario } from '../Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-detalhes-funcionario',
  templateUrl: './detalhes-funcionario.component.html',
  styleUrls: ['./detalhes-funcionario.component.css']
})
export class DetalhesFuncionarioComponent implements OnInit {

  id!: number;
  funcionario!: Funcionario;

  constructor(
    private funcionarioService: FuncionarioService,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.funcionario = new Funcionario();
    this.funcionarioService.getFuncionarioById(this.id).subscribe( data => {
      this.funcionario = data;
    })
  }

}
