package com.matchartist.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tipo_usuario")
public class TipoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column (name = "name_tipo_usuario")
	private String nameTipoUsuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameTipoUsuario() {
		return nameTipoUsuario;
	}

	public void setNameTipoUsuario(String nameTipoUsuario) {
		this.nameTipoUsuario = nameTipoUsuario;
	}
	
	
	
	

}
