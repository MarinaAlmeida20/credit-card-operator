package com.javanauta.credit_card_operator.adaptor.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "card")
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private LocalDate expiryDate;
    private String cvv;
    private double creditLimit;
    private double availableLimit;
    private LocalDate lastUpdateLimit;
    private Integer invoiceDueDate;

    @OneToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    public CardEntity(String cardNumber,
                      LocalDate expiryDate,
                      String cvv,
                      double creditLimit,
                      ClientEntity cliente,
                      LocalDate lastUpdateLimit,
                      Integer invoiceDueDate) {
    }
}
