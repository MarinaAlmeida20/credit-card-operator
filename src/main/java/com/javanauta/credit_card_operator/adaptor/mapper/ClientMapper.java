package com.javanauta.credit_card_operator.adaptor.mapper;

import com.javanauta.credit_card_operator.adaptor.in.dto.request.ClientRequestDto;
import com.javanauta.credit_card_operator.adaptor.in.dto.response.ClientResponseDto;
import com.javanauta.credit_card_operator.adaptor.out.entity.CardEntity;
import com.javanauta.credit_card_operator.adaptor.out.entity.ClientEntity;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {


    ClientEntity toEntity(ClientDomain clientDomain);

    ClientDomain toDomain(ClientEntity clientEntity);

    @Mapping(target = "card", expression = "java(toCardDomain(client))")
    ClientDomain toDomain(ClientRequestDto client);

    ClientResponseDto toResponse(ClientDomain client);

    @Mapping(source = "invoiceDueDate", target = "invoiceDueDate")
    ClientDomain toCardDomain(ClientRequestDto clientRequestDto);
}
