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
@Table(name = "cidade")
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "name_cidade")
	private String nameCidade;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCidade() {
		return nameCidade;
	}

	public void setNameCidade(String nameCidade) {
		this.nameCidade = nameCidade;
	}

	public Uf getFkUf() {
		return fkUf;
	}

	public void setFkUf(Uf fkUf) {
		this.fkUf = fkUf;
	}

	@ManyToOne
	@JoinColumn(name = "fk_uf")
	private Uf fkUf;

}
