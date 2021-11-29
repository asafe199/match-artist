package com.matchartist.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

//	public Optional<Usuario> findByEmail(String email);
}
