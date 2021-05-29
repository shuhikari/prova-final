package br.com.ViniciusAlvesCandido.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name = "CLIENTE")

public class Cliente extends AbstractEntity<Long> {

	
	@Column(nullable = false,unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name = "data_cadastro", nullable = false, columnDefinition = "DATE")
	private LocalDate dataCadastro;
	
	@OneToOne
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "profissao_id_fk")
	private Profissao profissao;
	
	
	
}
