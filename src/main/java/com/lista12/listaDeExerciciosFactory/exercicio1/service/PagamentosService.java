package com.lista12.listaDeExerciciosFactory.exercicio1.service;

import com.lista12.listaDeExerciciosFactory.exercicio1.model.PagamentosModel;
import com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento.CalculoPagamento;
import com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento.PagamentoFactory;
import com.lista12.listaDeExerciciosFactory.exercicio1.repository.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentosService {

    @Autowired
    private PagamentosRepository pagamentosRepository;

    public List<PagamentosModel> buscarTodos() {
        return pagamentosRepository.findAll();
    }

    public Optional<PagamentosModel> buscarPorId(Long codigo) {
        return pagamentosRepository.findById(codigo);
    }

    public PagamentosModel cadastrar(PagamentosModel pagamentosModel, PagamentoFactory pagamentoFactory) {

        BigDecimal resultado = pagamentoFactory.getStatusPagamento(pagamentosModel.getStatus()).calcular(pagamentosModel.getValorAPagar(), pagamentosModel.getDiferencaValor());
        pagamentosModel.getCodigo();
        pagamentosModel.getValorAPagar();
        pagamentosModel.getDiferencaValor();
        pagamentosModel.getStatus();
        pagamentosModel.setValorPago(resultado);
        return pagamentosRepository.save(pagamentosModel);
    }


    public void deletar(Long codigo) {
        pagamentosRepository.deleteById(codigo);
    }
}
