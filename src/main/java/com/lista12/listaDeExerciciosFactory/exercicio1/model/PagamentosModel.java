package com.lista12.listaDeExerciciosFactory.exercicio1.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamento")
public class PagamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;
    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;
    @Column(length = 20, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorPago;
}
