package com.javanauta.credit_card_operator.adaptor.in.dto.request;

public record CardResponseDto(String cardNumber,
                              String expirationDate,
                              String cvv,
                              double cardLimit) {
}
