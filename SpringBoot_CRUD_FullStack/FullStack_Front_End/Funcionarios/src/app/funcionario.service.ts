import { HttpClient, HttpHandler } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from './funcionario';

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


