package com.lista12.listaDeExerciciosFactory.exercicio2.service;

import com.lista12.listaDeExerciciosFactory.exercicio2.model.RecebimentosModel;
import com.lista12.listaDeExerciciosFactory.exercicio2.model.valoresRecebimento.RecebimentoFactory;
import com.lista12.listaDeExerciciosFactory.exercicio2.repository.RecebimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentosService {
    @Autowired
    private RecebimentosRepository recebimentosRepository;

    public List<RecebimentosModel> buscarTodos() {
        return recebimentosRepository.findAll();
    }

    public Optional<RecebimentosModel> buscarPorId(Long codigo) {
        return recebimentosRepository.findById(codigo);
    }

    public RecebimentosModel cadastrar(RecebimentosModel recebimentosModel, RecebimentoFactory recebimentoFactory) {
        BigDecimal resultado = recebimentoFactory.getStatusRecebimento(recebimentosModel.getStatus()).calcular(recebimentosModel.getValorAReceber());
        BigDecimal resultadoFinal = recebimentosModel.getValorAReceber().subtract(resultado);
        recebimentosModel.getCodigo();
        recebimentosModel.getValorAReceber();
        recebimentosModel.getStatus();
        recebimentosModel.setValorDescontado(resultado);
        recebimentosModel.setValorFinal(resultadoFinal);
        return recebimentosRepository.save(recebimentosModel);
    }

    public void deletar(Long codigo) {
        recebimentosRepository.deleteById(codigo);
    }
}
