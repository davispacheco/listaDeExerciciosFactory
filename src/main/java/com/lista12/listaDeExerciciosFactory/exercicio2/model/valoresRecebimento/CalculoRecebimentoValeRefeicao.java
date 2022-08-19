package com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento;

import java.math.BigDecimal;

public class CalculoRecebimentoValeRefeicao implements CalculoRecebimento {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        BigDecimal resultado = valorAReceber.multiply(new BigDecimal("0.042"));
        return resultado;
    }
}
