package com.javanauta.credit_card_operator.application.domain;

public class ClientDomain {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String cpf;
    private double monthlyIncome;
    private AddressDomain addressDomain;
    private CardDomain cardDomain;

    public ClientDomain() {
    }

    public ClientDomain(Long id, String name,
                        String email, Integer age,
                        String cpf, double monthlyIncome,
                        AddressDomain addressDomain,
                        CardDomain cardDomain) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.cpf = cpf;
        this.monthlyIncome = monthlyIncome;
        this.addressDomain = addressDomain;
        this.cardDomain = cardDomain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public AddressDomain getAddressDomain() {
        return addressDomain;
    }

    public void setAddressDomain(AddressDomain addressDomain) {
        this.addressDomain = addressDomain;
    }

    public CardDomain getCardDomain() {
        return cardDomain;
    }

    public void setCardDomain(CardDomain cardDomain) {
        this.cardDomain = cardDomain;
    }
}
