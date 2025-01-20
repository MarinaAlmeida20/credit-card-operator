package com.javanauta.credit_card_operator.adaptor.in;

import com.javanauta.credit_card_operator.application.domain.ClientDomain;

public interface IClientService {

    ClientDomain requestCard(ClientDomain client);

    ClientDomain findByCpf(String cpf);
}
