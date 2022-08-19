package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

import java.math.BigDecimal;

public class CalculoPagamentoAtrasado implements CalculoPagamento {
    @Override
    public BigDecimal calcular(BigDecimal valorAPagar, BigDecimal diferenca) {
        BigDecimal resultado;

        resultado = valorAPagar.add(diferenca);
        return resultado;
    }
}
