package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ViniciusAlvesCandido.dao.funcionarioDao;
import br.com.ViniciusAlvesCandido.domain.Funcionario;


@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private funcionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly = true)
	@Override
	public Funcionario buscaPorId(Long id) {
		
		return dao.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Funcionario> buscarTodos() {
		
		return dao.findAll();
	}

}
