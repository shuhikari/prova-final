package br.com.ViniciusAlvesCandido.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")

public class Cargo extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa_fk")
	private Empresa empresa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
