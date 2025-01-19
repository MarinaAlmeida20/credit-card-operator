package com.javanauta.credit_card_operator.application.domain;

import java.time.LocalDate;

public class Card {

    private Long id;
    private String number;
    private LocalDate expireDate;
    private String cvv;
    private double limit;
    private LocalDate lastUpdateLimit;
    private Integer invoiceDueDate;
    private Client client;

    public Card() {
    }

    public Card(Long id, String number,
                LocalDate expireDate,
                double limit, String cvv,
                LocalDate lastUpdateLimit,
                Integer invoiceDueDate,
                Client client) {
        this.id = id;
        this.number = number;
        this.expireDate = expireDate;
        this.limit = limit;
        this.cvv = cvv;
        this.lastUpdateLimit = lastUpdateLimit;
        this.invoiceDueDate = invoiceDueDate;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
