package com.javanauta.credit_card_operator.ports.out;

import com.javanauta.credit_card_operator.application.domain.ClientDomain;

import java.util.Optional;

// Abstraction
public interface IClientRepository {

    ClientDomain saveUser(ClientDomain clientDomain);

    Boolean findUserByEmail(String email);

    Optional<ClientDomain> findUserByCpf(String cpf);
}
