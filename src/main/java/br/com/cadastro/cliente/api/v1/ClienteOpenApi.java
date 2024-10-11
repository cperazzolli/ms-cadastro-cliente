package br.com.cadastro.cliente.api.v1;

import br.com.cadastro.cliente.api.DataOutput;
import br.com.cadastro.cliente.dto.ClienteDto;
import br.com.cadastro.cliente.entity.Cliente;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name="Cadastro")
@RequestMapping("/v1/cliente")
public interface ClienteOpenApi {

    @Operation(summary = "Central do Cliente")
    @ApiResponses(value = {
              @ApiResponse(responseCode = "201",
                           description = "Created Sucessful",
                       content =
              @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                       schema =
              @Schema(implementation = DataOutput.class))),
            @ApiResponse(responseCode = "400",
                    description = "Created Sucessful",
                    content =
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema =
                            @Schema(implementation = DataOutput.class))),
            @ApiResponse(responseCode = "422",
                    description = "Created Sucessful",
                    content =
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema =
                            @Schema(implementation = DataOutput.class))),
            @ApiResponse(responseCode = "500",
                    description = "Created Sucessful",
                    content =
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema =
                            @Schema(implementation = DataOutput.class)))
    })
    @PostMapping(value = "/cliente", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<DataOutput<ClienteDto>> gravaCliente(@RequestBody Cliente cliente);
}
