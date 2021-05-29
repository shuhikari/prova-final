package br.com.ViniciusAlvesCandido.dao;

import org.springframework.stereotype.Repository;

import br.com.ViniciusAlvesCandido.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements funcionarioDao{

}
