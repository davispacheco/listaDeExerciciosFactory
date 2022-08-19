package com.lista12.listaDeExerciciosFactory.exercicio2.repository;

import com.lista12.listaDeExerciciosFactory.exercicio2.model.RecebimentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentosRepository extends JpaRepository<RecebimentosModel, Long> {
}
