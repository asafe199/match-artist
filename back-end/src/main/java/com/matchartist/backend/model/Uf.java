package com.matchartist.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="uf")
public class Uf {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "name_uf")
	private String nameUf;
	
	@Column(name = "uf")
	private String uf;
	
	@ManyToOne
	@JoinColumn(name = "fk_regiao")
	private Regiao fkRegiao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameUf() {
		return nameUf;
	}

	public void setNameUf(String nameUf) {
		this.nameUf = nameUf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Regiao getFkRegiao() {
		return fkRegiao;
	}

	public void setFkRegiao(Regiao fkRegiao) {
		this.fkRegiao = fkRegiao;
	}

}
