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

  createFuncionario( funcionario : Funcionario): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, funcionario);
  }

  getFuncionarioById(id: number): Observable<Funcionario> {
    return this.httpClient.get<Funcionario>(`${this.baseURL}/${id}`);
  }

  updateFuncionario(id: number, funcionario: Funcionario): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, funcionario);
  }
}
