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
@Table( name ="artista")
public class Artista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "uuid")
	private String uuid;
	
	@Column(name = "nome_artista")
	private String nomeArtista;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "url_avatar")
	private String urlAvatar;
	
	@Column(name = "contato")
	private int contato;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private Usuario fkUsuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_status_conta")
	private StatusConta fkStatusConta;
	
	@ManyToOne
	@JoinColumn(name = "fk_endereco")
	private Endereco fkEndereco;
	
	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	public StatusConta getFkStatusConta() {
		return fkStatusConta;
	}

	public void setFkStatusConta(StatusConta fkStatusConta) {
		this.fkStatusConta = fkStatusConta;
	}

	public Endereco getFkEndereco() {
		return fkEndereco;
	}

	public void setFkEndereco(Endereco fkEndereco) {
		this.fkEndereco = fkEndereco;
	}
	
	
}
