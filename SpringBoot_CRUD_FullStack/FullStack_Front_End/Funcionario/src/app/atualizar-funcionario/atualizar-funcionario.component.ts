import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Funcionario } from '../Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-atualizar-funcionario',
  templateUrl: './atualizar-funcionario.component.html',
  styleUrls: ['./atualizar-funcionario.component.css']
})
export class AtualizarFuncionarioComponent implements OnInit {

  id!: number;
  funcionario: Funcionario = new Funcionario();
  constructor(
    private funcionarioService: FuncionarioService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.funcionarioService.getFuncionarioById(this.id).subscribe(data => {
      this.funcionario = data;
    }, error => console.log(error));
  }
  
  // updateFuncionario(id: number) {
  //   this.route.navigate(['atualizar-funcionario', id]);
  // }

  onSubmit() {
    this.funcionarioService.updateFuncionario(this.id, this.funcionario).subscribe(data =>{
      this.goToFuncionarioLista();
    }, error => console.log(error));
  }

  goToFuncionarioLista(){
    this.router.navigate(['/funcionarios']);
  }



 


}
