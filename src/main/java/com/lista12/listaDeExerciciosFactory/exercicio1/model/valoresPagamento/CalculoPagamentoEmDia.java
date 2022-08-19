package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

import java.math.BigDecimal;

public class CalculoPagamentoEmDia implements CalculoPagamento {
    @Override
    public BigDecimal calcular(BigDecimal valorAPagar, BigDecimal diferenca) {
        BigDecimal resultado;
        resultado = valorAPagar.subtract(diferenca);
        return resultado;
    }
}
