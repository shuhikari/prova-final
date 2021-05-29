package br.com.ViniciusAlvesCandido.dao;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Funcionario;

public interface funcionarioDao {

void save (Funcionario funcionario);
	
	void update (Funcionario funcionario);
	
	void delete (Long id);

	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
}
