package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
