package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Cargo;

public interface CargoService {

	void salvar (Cargo cargo);
	
	void editar (Cargo cargo);
	
	void excluir (Long id);

	Cargo buscaPorId(Long id);
	
	List<Cargo> buscarTodos();
}
