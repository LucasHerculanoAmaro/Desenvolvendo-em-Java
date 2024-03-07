import { Component, OnInit } from '@angular/core';
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
    private route ActivatedRoute,
    private funcionarioService: FuncionarioService
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.funcionario = new Funcionario();
    this.funcionarioService.getFuncionarioById(this.id).subscribe( data => {
      this.funcionario = data;
    })
  }

}
