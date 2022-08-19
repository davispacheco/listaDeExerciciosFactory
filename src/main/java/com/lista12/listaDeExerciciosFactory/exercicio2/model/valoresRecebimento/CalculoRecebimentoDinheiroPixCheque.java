package com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento;

import java.math.BigDecimal;

public class CalculoRecebimentoDinheiroPixCheque implements CalculoRecebimento {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return new BigDecimal("0");
    }
}
