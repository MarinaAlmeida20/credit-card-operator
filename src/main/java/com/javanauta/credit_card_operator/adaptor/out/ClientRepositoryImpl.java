package com.javanauta.credit_card_operator.adaptor.out;

import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import com.javanauta.credit_card_operator.ports.out.IClientRepository;

import java.util.Optional;

public class ClientRepositoryImpl implements IClientRepository {
    @Override
    public ClientDomain save(ClientDomain clientDomain) {
        return null;
    }

    @Override
    public Boolean findUserByEmail(String email) {
        return null;
    }

    @Override
    public Optional<ClientDomain> findUserByCpf(String cpf) {
        return Optional.empty();
    }
}
