package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Departamento;



public interface DepartamentoService {
	
	void salvar (Departamento departamento);
	
	void editar (Departamento departamento);
	
	void excluir (Long id);

	Departamento buscaPorId(Long id);
	
	List<Departamento> buscarTodos();

}
