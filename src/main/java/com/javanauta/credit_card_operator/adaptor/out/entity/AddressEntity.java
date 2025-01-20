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
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private Long number;
    @Column(name = "complement", length = 10)
    private String complement;
    @Column(name = "city", length = 150)
    private String city;
    @Column(name = "state", length = 2)
    private String state;
    @Column(name = "cep", length = 9)
    private String cep;
    @OneToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
