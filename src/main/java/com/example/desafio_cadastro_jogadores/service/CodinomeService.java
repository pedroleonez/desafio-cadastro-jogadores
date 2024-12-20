package com.example.desafio_cadastro_jogadores.service;

import com.example.desafio_cadastro_jogadores.model.GrupoCodinome;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodinomeService {

    public String gerarCodinome(GrupoCodinome grupoCodinome, List<String> codinomesEmUso) {
        var codinomesDisponiveis = listarCodinomesDisponiveis(grupoCodinome, codinomesEmUso);
        if (codinomesDisponiveis.isEmpty())
            throw new Exception("Não há codinomes disponíveis para o grupo " + grupoCodinome.getNome());

        var codinomeSorteado = sortearCodinome(codinomesDisponiveis);
        return codinomeSorteado;
    }
}
