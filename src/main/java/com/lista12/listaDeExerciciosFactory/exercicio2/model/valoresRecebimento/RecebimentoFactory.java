package com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento;

public class RecebimentoFactory {
    public CalculoRecebimento getStatusRecebimento(String status) {
        if (status.equalsIgnoreCase("din_pix_cheque")) {
            return new CalculoRecebimentoDinheiroPixCheque();
        } else if (status.equalsIgnoreCase("cartao_de_debito")) {
            return new CalculoRecebimentoCartaoDebito();
        } else if (status.equalsIgnoreCase("cartao_de_credito")) {
            return new CalculoRecebimentoCartaoCredito();
        } else if (status.equalsIgnoreCase("vale_refeicao")) {
            return new CalculoRecebimentoValeRefeicao();
        } else {
            return null;
        }
    }
}
