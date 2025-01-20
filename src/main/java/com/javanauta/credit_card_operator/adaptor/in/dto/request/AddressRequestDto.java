package com.javanauta.credit_card_operator.adaptor.in.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequestDto {
    private Long id;
    private String street;
    private Long number;
    private String complement;
    private String city;
    private String state;
    private String cep;
}
