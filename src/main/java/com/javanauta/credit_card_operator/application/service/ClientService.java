package com.javanauta.credit_card_operator.application.service;

import com.javanauta.credit_card_operator.application.domain.CardDomain;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import com.javanauta.credit_card_operator.ports.out.IClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final IClientRepository clientRepository;
    private final GenerateCardDataService generateCard;

    public ClientDomain requestCard(ClientDomain client){
        if(clientRepository.findUserByEmail(client.getEmail())){
            throw new IllegalArgumentException("User already have an email");
        }

        CardDomain card = generateCard.generateToClient(client);
        client.setCardDomain(card);
        return clientRepository.save(client);
    }

    public ClientDomain findByCpf(String cpf){
        return clientRepository.findUserByCpf(cpf)
                .orElseThrow(() -> new IllegalArgumentException("Client Not found"));
    }
}
