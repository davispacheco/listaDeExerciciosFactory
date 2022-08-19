package com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento;

import java.math.BigDecimal;

public class CalculoRecebimentoCartaoCredito implements CalculoRecebimento {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        BigDecimal resultado = valorAReceber.multiply(new BigDecimal("0.037"));
        return resultado;
    }
}
