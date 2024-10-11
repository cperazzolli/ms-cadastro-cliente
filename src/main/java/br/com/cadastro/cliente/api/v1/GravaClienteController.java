package br.com.cadastro.cliente.api.v1;

import br.com.cadastro.cliente.api.DataOutput;
import br.com.cadastro.cliente.dto.ClienteDto;
import br.com.cadastro.cliente.entity.Cliente;
import br.com.cadastro.cliente.service.ProcessaClienteService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GravaClienteController implements ClienteOpenApi{

    private final ProcessaClienteService clienteService;

    public GravaClienteController(ProcessaClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @Override
    public ResponseEntity<DataOutput<ClienteDto>> gravaCliente(Cliente cliente) {
        final var cli = clienteService.gravaCliente(cliente);

        return null;
    }
}
