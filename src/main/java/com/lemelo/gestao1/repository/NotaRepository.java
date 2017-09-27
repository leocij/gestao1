package com.lemelo.gestao1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemelo.gestao1.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

}
