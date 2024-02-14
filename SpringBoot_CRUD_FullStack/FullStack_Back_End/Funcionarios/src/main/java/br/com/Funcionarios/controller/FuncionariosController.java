package br.com.Funcionarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Funcionarios.model.Funcionario;
import br.com.Funcionarios.repository.FuncionarioRepository;

@RestController
@RequestMapping("/api/v1/")
public class FuncionariosController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	//Pegando todos os Funcionários
	@GetMapping("/Funcionarios")
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
	
	
}
