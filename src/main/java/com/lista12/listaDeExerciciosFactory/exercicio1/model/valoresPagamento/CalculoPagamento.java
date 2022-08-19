package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

import java.math.BigDecimal;

public interface CalculoPagamento {
    public BigDecimal calcular(BigDecimal valorAPagar, BigDecimal diferenca);
}
