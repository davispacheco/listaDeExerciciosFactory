package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

public class PagamentoFactory {
    public CalculoPagamento getStatusPagamento(String statusPagamento) {
        if (statusPagamento.equalsIgnoreCase("pagamento_em_dia")) {
            return new PagamentoEmDia();
        } else if (statusPagamento.equalsIgnoreCase("pagamento_atrasado")) {
            return new PagamentoAtrasado();
        } else {
            return null;
        }
    }
}
