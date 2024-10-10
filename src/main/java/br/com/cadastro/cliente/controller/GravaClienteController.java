package br.com.cadastro.cliente.controller;

import br.com.cadastro.cliente.dto.ClienteDto;
import br.com.cadastro.cliente.entity.Cliente;
import br.com.cadastro.cliente.service.ProcessaClienteService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GravaClienteController {

    private final ProcessaClienteService clienteService;

    public GravaClienteController(ProcessaClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping(value = "/cliente", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDto> gravaCliente(@RequestBody Cliente cliente) {

        final var cli = clienteService.gravaCliente(cliente);

        return ResponseEntity.ok(cli);
    }
}
