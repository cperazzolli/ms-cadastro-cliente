package br.com.cadastro.cliente.service;

import br.com.cadastro.cliente.dto.ClienteDto;
import br.com.cadastro.cliente.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ProcessaClienteService {

    public ClienteDto gravaCliente(Cliente cliente) {
        final var cli = Cliente.with(1L,cliente.nome(),cliente.nomeDaMae(), cliente.profissao(), cliente.dataNascimento());
        return ClienteDto.whit(cli.nome(),cli.nomeDaMae(),cliente.profissao(),cli.dataNascimento());
    }
}
