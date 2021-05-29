package br.com.ViniciusAlvesCandido.dao;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Empresa;

public interface EmpresaDao {
	
	void save (Empresa empresa);
	
	void update (Empresa empresa);
	
	void delete (Long id);

	Empresa findById(Long id);
	
	List<Empresa> findAll();

}
