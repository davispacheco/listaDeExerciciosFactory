package com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento;

public class PagamentoFactory {
    public CalculoPagamento getStatusPagamento(String statusPagamento) {
        if (statusPagamento.equalsIgnoreCase("pagamento_em_dia")) {
            return new CalculoPagamentoEmDia();
        } else if (statusPagamento.equalsIgnoreCase("pagamento_atrasado")) {
            return new CalculoPagamentoAtrasado();
        } else {
            return null;
        }
    }
}
