package com.javanauta.credit_card_operator.adaptor.out;

import com.javanauta.credit_card_operator.adaptor.mapper.ClientMapper;
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
    private final ClientMapper clientMapper;

    @Override
    public ClientDomain saveUser(ClientDomain clientDomain) {
        return clientMapper.toDomain(
                clientJpaRepository.save(
                        clientMapper.toEntity(clientDomain)
                )
        );
    }

    @Override
    public Boolean findUserByEmail(String email) {
        return clientJpaRepository.existsByEmail(email);
    }

    @Override
    public Optional<ClientDomain> findUserByCpf(String cpf) {
        return clientJpaRepository.findByCpf(cpf)
                .map(clientMapper::toDomain);
    }
}
