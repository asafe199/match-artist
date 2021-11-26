package com.matchartist.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_evento")
public class StatusEvento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "nome_status_evento")
	private String nameStatusEvento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameStatusEvento() {
		return nameStatusEvento;
	}

	public void setNameStatusEvento(String nameStatusEvento) {
		this.nameStatusEvento = nameStatusEvento;
	}
	

}
