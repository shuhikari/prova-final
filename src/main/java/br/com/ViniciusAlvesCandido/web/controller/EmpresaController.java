package br.com.ViniciusAlvesCandido.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {

	@GetMapping ("/cadastrar")
	public String cadastrar() {
		return "/empresa/cadastro";
	}

	@GetMapping ("/listar")
	public String listar() {
		return "/empresa/lista";
	}

}
