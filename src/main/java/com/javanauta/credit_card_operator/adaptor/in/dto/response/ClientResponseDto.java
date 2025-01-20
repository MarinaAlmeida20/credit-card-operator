package com.javanauta.credit_card_operator.adaptor.in.dto.response;

public record ClientResponseDto(String name,
                                String email,
                                String age,
                                CardResponseDto card) {
}
