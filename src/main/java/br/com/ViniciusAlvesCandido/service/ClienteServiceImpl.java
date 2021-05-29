package br.com.ViniciusAlvesCandido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ViniciusAlvesCandido.dao.ClienteDao;
import br.com.ViniciusAlvesCandido.domain.Cliente;


@Service
@Transactional(readOnly = true)
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Cliente cliente) {
		dao.save(cliente);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Cliente cliente) {
		dao.update(cliente);
		
	}

	
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly = true)
	@Override
	public Cliente buscaPorId(Long id) {
		
		return dao.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> buscarTodos() {
		
		return dao.findAll();
	}

}
