package com.javanauta.credit_card_operator.adaptor.in.controller;

import com.javanauta.credit_card_operator.adaptor.in.IClientService;
import com.javanauta.credit_card_operator.adaptor.in.dto.request.ClientRequestDto;
import com.javanauta.credit_card_operator.adaptor.in.dto.response.ClientResponseDto;
import com.javanauta.credit_card_operator.adaptor.mapper.ClientMapper;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final IClientService clientService;
    private final ClientMapper mapper;

    @PostMapping
    public ResponseEntity<ClientResponseDto> requestCard(@RequestBody ClientRequestDto clientRequestDTO) {
        mapper.toResponse(clientService.requestCard(mapper.toDomain(clientRequestDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClientResponseDto> findClientByCpf(@RequestParam String cpf) {
        ClientDomain client = clientService.findByCpf(cpf);
        return ResponseEntity.ok(mapper.toResponse(client));
    }
}
