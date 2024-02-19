import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Funcionario } from './Funcionario';

@Injectable({
  providedIn: 'root'
})

export class FuncionarioService {

  private baseURL = "http://localhost:8080/api/v1/Funcionarios";

  constructor(private httpClient: HttpClient) { }

  getFuncionarioLista(): Observable<Funcionario[]> {
    return this.httpClient.get<Funcionario[]>(this.baseURL);
  }
}
