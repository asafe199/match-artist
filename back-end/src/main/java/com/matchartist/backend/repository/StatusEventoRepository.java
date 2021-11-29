package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.StatusEvento;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusEventoRepository extends JpaRepository<StatusEvento, Integer> {

}
