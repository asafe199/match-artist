package com.matchartistback.matchartistback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartistback.matchartistback.model.TipoUsuario;
import com.matchartistback.matchartistback.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
