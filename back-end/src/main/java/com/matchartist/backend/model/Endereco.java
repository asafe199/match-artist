package com.matchartist.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name= "logradouro")
	private String logradouro;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name ="cep")
	private String cep;
	
	@Column(name ="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name= "fk_cidade")
	private Cidade fkCidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cidade getFkCidade() {
		return fkCidade;
	}

	public void setFkCidade(Cidade fkCidade) {
		this.fkCidade = fkCidade;
	}
	
	
	
	
	
	

}
