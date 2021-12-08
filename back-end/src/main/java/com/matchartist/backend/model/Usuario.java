package com.matchartist.backend.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name= "email")
	private String email;
	
	@Column (name ="data_criacao")
	private Date dataCriacao;
	
	
	@Column(name = "data_alteracao")
	private Date dataAlteracao;
	
	@Column(name= "token_password")
	private String tokenPassword;
	
	@Column(name ="recover_password_token")
	private String recoverPassword;
	
	@ManyToOne
	@JoinColumn(name = "fk_tipo_usuario")
	private TipoUsuario tipoUsuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getTokenPassword() {
		return tokenPassword;
	}

	public void setTokenPassword(String tokenPassword) {
		this.tokenPassword = tokenPassword;
	}

	public String getRecoverPassword() {
		return recoverPassword;
	}

	public void setRecoverPassword(String recoverPassword) {
		this.recoverPassword = recoverPassword;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.emptyList();
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
