package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.TipoUsuario;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {

}
