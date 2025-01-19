package com.javanauta.credit_card_operator.adaptor.out;

import com.javanauta.credit_card_operator.adaptor.out.repository.IClientJpaRepository;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import com.javanauta.credit_card_operator.ports.out.IClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClientRepositoryImpl implements IClientRepository {

    private final IClientJpaRepository clientJpaRepository;

    @Override
    public ClientDomain save(ClientDomain clientDomain) {
        return clientJpaRepository.save();
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
