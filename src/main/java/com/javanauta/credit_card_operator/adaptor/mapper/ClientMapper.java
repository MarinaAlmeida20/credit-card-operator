package com.javanauta.credit_card_operator.adaptor.mapper;

import com.javanauta.credit_card_operator.adaptor.out.entity.ClientEntity;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {


    ClientEntity toEntity(ClientDomain clientDomain){

    }
}
