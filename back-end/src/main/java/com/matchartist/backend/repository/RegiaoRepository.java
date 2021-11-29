package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Regiao;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

}
