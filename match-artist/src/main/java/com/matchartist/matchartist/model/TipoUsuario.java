package com.matchartist.matchartist.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoUsuario")

public class TipoUsuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nameTipoUsuario")
	private String nameTipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameTipoUsuario() {
		return nameTipoUsuario;
	}

	public void setNameTipoUsuario(String nameTipoUsuario) {
		this.nameTipoUsuario = nameTipoUsuario;
	}

	


}
