package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
