package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Estabelecimento;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {

}
