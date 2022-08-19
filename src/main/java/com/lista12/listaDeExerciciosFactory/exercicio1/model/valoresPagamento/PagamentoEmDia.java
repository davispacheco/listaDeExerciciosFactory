package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

import com.lista12.listaDeExerciciosFactory.exercicio1.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoPagamento {
    @Override
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
        BigDecimal resultado;
        resultado.equals(pagamentoModel.getValorAPagar());
        resultado.subtract(pagamentoModel.getDiferencaValor());
        return resultado;
    }
}
