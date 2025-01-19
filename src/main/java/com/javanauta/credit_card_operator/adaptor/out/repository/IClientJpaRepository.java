package com.javanauta.credit_card_operator.adaptor.out.repository;

import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IClientJpaRepository extends JpaRepository<Long, ClientDomain> {

    boolean existsByEmail(String email);

    Optional<ClientDomain> findByCpf(String cpf);
}
