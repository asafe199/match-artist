package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
