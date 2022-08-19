package com.lista12.listaDeExerciciosFactory.exercicio2.controller;

import com.lista12.listaDeExerciciosFactory.exercicio2.model.RecebimentosModel;
import com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento.RecebimentoFactory;
import com.lista12.listaDeExerciciosFactory.exercicio2.service.RecebimentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentosController {
    @Autowired
    private RecebimentosService recebimentosService;

    @GetMapping(path = "/recebimentos")
    public List<RecebimentosModel> buscarTodosRecebimentos() {
        return recebimentosService.buscarTodos();
    }

    @GetMapping(path = "/recebimentos/{codigo}")
    public Optional<RecebimentosModel> buscarRecebimentoPorId(@PathVariable Long codigo) {
        return recebimentosService.buscarPorId(codigo);
    }

    @PostMapping(path = "/recebimentos")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentosModel cadastrarRecebimento(@RequestBody RecebimentosModel recebimentosModel, RecebimentoFactory recebimentoFactory) {
        return recebimentosService.cadastrar(recebimentosModel, recebimentoFactory);
    }

    @DeleteMapping(path = "/recebimentos/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo) {
        recebimentosService.deletar(codigo);
    }
}
