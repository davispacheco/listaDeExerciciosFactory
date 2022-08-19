package com.lista12.listaDeExerciciosFactory.exercicio1.controller;

import com.lista12.listaDeExerciciosFactory.exercicio1.model.PagamentosModel;
import com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento.CalculoPagamento;
import com.lista12.listaDeExerciciosFactory.exercicio1.model.valoresPagamento.PagamentoFactory;
import com.lista12.listaDeExerciciosFactory.exercicio1.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentosController {

    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping(path = "/pagamentos")
    public List<PagamentosModel> buscarTodosPagamentos() {
        return pagamentosService.buscarTodos();
    }

    @GetMapping(path = "/pagamentos/{codigo}")
    public Optional<PagamentosModel> buscarPagamentoPorId(@PathVariable Long codigo) {
        return pagamentosService.buscarPorId(codigo);
    }

    @PostMapping(path = "/pagamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentosModel cadastrarPagamento(@RequestBody PagamentosModel pagamentosModel, PagamentoFactory pagamentoFactory) {
        return pagamentosService.cadastrar(pagamentosModel, pagamentoFactory);
    }

    @DeleteMapping(path = "/pagamentos/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo) {
        pagamentosService.deletar(codigo);
    }
}
