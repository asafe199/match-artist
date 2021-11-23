package com.matchartist.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estabelecimento")
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "nome_estabelecimento")
	private String nomeEstabelecimento;
	
	@Column(name = "uuid")
	private String uuid;
	
	@Column(name = "urlAvatar")
	private String urlAvatar;
	
	@Column(name = "contato")
	private int contato;
	
	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private Usuario fkUsuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_status_conta")
	private Usuario fkStatusConta;
	
	@ManyToOne
	@JoinColumn(name = "fk_endereco")
	private Usuario fkEndereco;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUrlAvatar() {
		return urlAvatar;
	}

	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	public Usuario getFkStatusConta() {
		return fkStatusConta;
	}

	public void setFkStatusConta(Usuario fkStatusConta) {
		this.fkStatusConta = fkStatusConta;
	}

	public Usuario getFkEndereco() {
		return fkEndereco;
	}

	public void setFkEndereco(Usuario fkEndereco) {
		this.fkEndereco = fkEndereco;
	}

	
	
	
	
	
	

}
