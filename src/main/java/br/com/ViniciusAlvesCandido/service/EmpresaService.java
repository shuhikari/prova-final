package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Empresa;


public interface EmpresaService {
	
	void salvar (Empresa empresa);
	
	void editar (Empresa empresa);
	
	void excluir (Long id);

	Empresa buscaPorId(Long id);
	
	List<Empresa> buscarTodos();

}
