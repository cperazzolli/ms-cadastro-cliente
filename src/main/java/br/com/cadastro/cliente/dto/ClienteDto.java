package br.com.cadastro.cliente.dto;

import java.time.LocalDate;

public record ClienteDto(
        String nome,
        String nomeDaMae,
        String profissao,
        LocalDate dataNascimento
) {
    public static ClienteDto whit(
            final String nome,
            final String nomeDaMae,
            final String profissao,
            final LocalDate dataNascimento
    ){
        return new ClienteDto(nome,nomeDaMae,profissao,dataNascimento);
    }
}
