package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Profissao;

public interface ProfissaoService {

	void salvar (Profissao profissao);
	
	void editar (Profissao profissao);
	
	void excluir (Long id);

	Profissao buscaPorId(Long id);
	
	List<Profissao> buscarTodos();
}
