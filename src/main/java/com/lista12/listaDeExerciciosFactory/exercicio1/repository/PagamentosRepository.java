package com.lista12.listaDeExerciciosFactory.exercicio1.repository;

import org.springframework.stereotype.Repository;

import com.lista12.listaDeExerciciosFactory.exercicio1.model.PagamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface PagamentosRepository extends JpaRepository<PagamentosModel, Long> {
}
