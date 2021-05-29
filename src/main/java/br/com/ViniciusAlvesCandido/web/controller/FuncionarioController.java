package br.com.ViniciusAlvesCandido.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@GetMapping ("/cadastrar")
	public String cadastrar() {
		return "/funcionarios/cadastro";
	}
	
	@GetMapping ("/listar")
	public String listar() {
		return "/funcionarios/lista";
	}
	

}
