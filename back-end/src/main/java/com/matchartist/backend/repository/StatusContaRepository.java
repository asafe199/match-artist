package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.StatusConta;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusContaRepository extends JpaRepository<StatusConta, Integer> {

}
