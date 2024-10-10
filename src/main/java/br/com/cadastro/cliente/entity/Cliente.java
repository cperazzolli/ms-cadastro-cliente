package br.com.cadastro.cliente.entity;

import java.time.LocalDate;

public record Cliente(
        Long id,
        String nome,
        String nomeDaMae,
        String profissao,
        LocalDate dataNascimento
) {
    public static Cliente with(
            final Long id,
            final String nome,
            final String nomeDaMae,
            final String profissao,
            final LocalDate dataNascimento
    ) {
        return new Cliente(id,nome,nomeDaMae,profissao,dataNascimento);
    }
}
