package com.javanauta.credit_card_operator.application.domain;

public class AddressDomain {

    private Long id;
    private String street;
    private Long number;
    private String complement;
    private String city;
    private String state;
    private String cep;
    private ClientDomain clientDomain;

    public AddressDomain() {
    }

    public AddressDomain(Long id, String street,
                         ClientDomain clientDomain, String cep,
                         String state, String city,
                         String complement, Long number) {
        this.id = id;
        this.street = street;
        this.clientDomain = clientDomain;
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.complement = complement;
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public ClientDomain getClient() {
        return clientDomain;
    }

    public void setClient(ClientDomain clientDomain) {
        this.clientDomain = clientDomain;
    }
}
