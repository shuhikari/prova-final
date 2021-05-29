package br.com.ViniciusAlvesCandido.domain;

import javax.persistence.Column;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMPRESAS")
public class Empresa extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "empresa")
	private List<Profissao> profissaos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Profissao> getCargos() {
		return profissaos;
	}

	public void setCargos(List<Profissao> profissaos) {
		this.profissaos = profissaos;
	} 
	
	
	
}
