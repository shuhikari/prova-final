package br.com.ViniciusAlvesCandido.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profissoes")

public class ProfissaoController {
	
	@GetMapping ("/cadastrar")
	public String cadastrar() {
		return "/profissao/cadastro";
	}
	
	@GetMapping ("/listar")
	public String listar() {
		return "/profissao/lista";
	}
	

}
