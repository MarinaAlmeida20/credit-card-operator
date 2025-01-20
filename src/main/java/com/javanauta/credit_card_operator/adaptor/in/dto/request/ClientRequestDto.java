package com.javanauta.credit_card_operator.adaptor.in.dto.request;

public record ClientRequestDto(String name,
                               String email,
                               Integer age,
                               String cpf,
                               AddressRequestDto addressRequestDto,
                               double monthlyIncome,
                               String invoiceDueDate) {
}
