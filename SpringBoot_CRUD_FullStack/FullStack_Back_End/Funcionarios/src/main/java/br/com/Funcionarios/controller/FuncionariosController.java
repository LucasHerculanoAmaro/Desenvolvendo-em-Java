package br.com.Funcionarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Funcionarios.exception.ResourceNotFoundException;
import br.com.Funcionarios.model.Funcionario;
import br.com.Funcionarios.repository.FuncionarioRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") //Permite que qualquer requisição solicitada seja atendida.
@RequestMapping("/api/v1/")

public class FuncionariosController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	//Pegando todos os Funcionários
	@GetMapping("/Funcionarios")
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
	
	//Criando Funcionários rest api
	@PostMapping("/Funcionarios")
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	// Pegando Funcionários do ID rest api
	@GetMapping("/Funcionarios/{id}")
	public ResponseEntity<Funcionario> getFuncionarioByID(@PathVariable Long id) {
		Funcionario funcionario = funcionarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Funcionario não existe com o id: " + id));
		return ResponseEntity.ok(funcionario);
	}
	
}
