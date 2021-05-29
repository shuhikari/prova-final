package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Cliente;



public interface ClienteService {

	void salvar (Cliente cliente);
	
	void editar (Cliente cliente);
	
	void excluir (Long id);

	Cliente buscaPorId(Long id);
	
	List<Cliente> buscarTodos();
	
}
