package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

import com.lista12.listaDeExerciciosFactory.exercicio1.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel);
}
