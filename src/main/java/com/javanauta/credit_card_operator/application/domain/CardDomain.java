package com.javanauta.credit_card_operator.application.domain;

import java.time.LocalDate;

public class CardDomain {

    private Long id;
    private String cardNumber;
    private LocalDate expireDate;
    private String cvv;
    private double limit;
    private LocalDate lastUpdateLimit;
    private Integer invoiceDueDate;
    private ClientDomain clientDomain;

    public CardDomain() {
    }

    public CardDomain(String cardNumber,
                      LocalDate expireDate,
                      double limit, String cvv,
                      LocalDate lastUpdateLimit,
                      Integer invoiceDueDate,
                      ClientDomain clientDomain) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.limit = limit;
        this.cvv = cvv;
        this.lastUpdateLimit = lastUpdateLimit;
        this.invoiceDueDate = invoiceDueDate;
        this.clientDomain = clientDomain;
    }

    public CardDomain(String cardNumber, LocalDate expireDate, double limit, String cvv, LocalDate lastUpdateLimit, Integer invoiceDueDate) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.limit = limit;
        this.cvv = cvv;
        this.lastUpdateLimit = lastUpdateLimit;
        this.invoiceDueDate = invoiceDueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public LocalDate getLastUpdateLimit() {
        return lastUpdateLimit;
    }

    public void setLastUpdateLimit(LocalDate lastUpdateLimit) {
        this.lastUpdateLimit = lastUpdateLimit;
    }

    public Integer getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Integer invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public ClientDomain getClient() {
        return clientDomain;
    }

    public void setClient(ClientDomain clientDomain) {
        this.clientDomain = clientDomain;
    }
}
