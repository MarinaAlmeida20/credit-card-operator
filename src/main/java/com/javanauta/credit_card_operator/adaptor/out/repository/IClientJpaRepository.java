package com.javanauta.credit_card_operator.adaptor.out.repository;

import com.javanauta.credit_card_operator.adaptor.out.entity.ClientEntity;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IClientJpaRepository extends JpaRepository<Long, ClientEntity> {

    ClientDomain save(ClientDomain clientDomain);
    
    Boolean existsByEmail(String email);

    Optional<ClientEntity> findByCpf(String cpf);

    ClientEntity save(ClientEntity entity);
}
