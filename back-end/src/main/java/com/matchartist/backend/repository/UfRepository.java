package com.matchartist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matchartist.backend.model.Uf;
import org.springframework.stereotype.Repository;

@Repository
public interface UfRepository extends JpaRepository<Uf, Integer>{

}
