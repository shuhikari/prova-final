package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import br.com.ViniciusAlvesCandido.domain.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ViniciusAlvesCandido.dao.EmpresaDao;


@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Empresa empresa) {
		dao.save(empresa);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void editar(Empresa empresa) {
		dao.update(empresa);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly = true)
	@Override
	public Empresa buscaPorId(Long id) {
		
		return dao.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Empresa> buscarTodos() {
		
		return dao.findAll();
	}

}
