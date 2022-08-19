package com.lista12.listaDeExerciciosFactory.exercicio2.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "recebimentos")
public class RecebimentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 10, nullable = false)
    private BigDecimal valorAReceber;
    @Column(length = 20, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorDescontado;
    @Column(length = 10, nullable = false)
    private BigDecimal valorFinal;
}
