package com.javanauta.credit_card_operator.adaptor.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Integer age;
    private String cpf;
    private double monthlyIncome;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private AddressEntity addressEntity;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private CardEntity cardEntity;
}
