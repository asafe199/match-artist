package com.matchartist.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "uuid")
	private String uuid;
	
	@Column(name = "data_criacao")
	private Date dataCriacao;
	
	@Column(name = "data_evento")
	private Date dataEvento;
	
	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "fk_status_evento")
	private Endereco fkStatusEvento;
	
	@ManyToOne
	@JoinColumn(name = "fk_endereco")
	private Endereco fkEndereco;
	
	@ManyToOne
	@JoinColumn(name = "fk_estabelecimento")
	private Endereco fkEstabelecimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getFkStatusEvento() {
		return fkStatusEvento;
	}

	public void setFkStatusEvento(Endereco fkStatusEvento) {
		this.fkStatusEvento = fkStatusEvento;
	}

	public Endereco getFkEndereco() {
		return fkEndereco;
	}

	public void setFkEndereco(Endereco fkEndereco) {
		this.fkEndereco = fkEndereco;
	}

	public Endereco getFkEstabelecimento() {
		return fkEstabelecimento;
	}

	public void setFkEstabelecimento(Endereco fkEstabelecimento) {
		this.fkEstabelecimento = fkEstabelecimento;
	}
	

}
