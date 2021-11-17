package com.matchartist.matchartist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.matchartist.model.TipoUsuario;


public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Long>{
	
}
