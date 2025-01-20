package com.javanauta.credit_card_operator.adaptor.in.controller;

import com.javanauta.credit_card_operator.adaptor.in.dto.response.ClientResponseDto;
import com.javanauta.credit_card_operator.adaptor.mapper.ClientMapper;
import com.javanauta.credit_card_operator.adaptor.out.entity.ClientEntity;
import com.javanauta.credit_card_operator.application.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientServicePort;
    private final ClientMapper mapper;

    @PostMapping
    public ResponseEntity<ClientResponseDto> requestCard(@RequestBody ClientRequestDto clientRequestDTO) {
        mapper.toResponse(clienteServicePort.solicitarCartao(mapper.toEntity(clientRequestDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClientReponseDto> findClientByCpf(@RequestParam String cpf) {
        ClientEntity client = clientServicePort.findByCpf(cpf);
        return ResponseEntity.ok(mapper.toResponse(client));
    }
}
