package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Funcionario;



public interface FuncionarioService {

	void salvar (Funcionario funcionario);
	
	void editar (Funcionario funcionario);
	
	void excluir (Long id);

	Funcionario buscaPorId(Long id);
	
	List<Funcionario> buscarTodos();
	
}
