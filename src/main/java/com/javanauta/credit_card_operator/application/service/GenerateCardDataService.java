package com.javanauta.credit_card_operator.application.service;

import com.javanauta.credit_card_operator.application.domain.CardDomain;
import com.javanauta.credit_card_operator.application.domain.ClientDomain;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
public class GenerateCardDataService {

    private static final String PREFIX_NUMBER_CARD = "4000";
    private static final int SIZE_NUMBER_CARD = 16;

    public CardDomain generateToClient(ClientDomain client){
        String cardNumber = generateCardNumber();
        LocalDate expireDate = generateDataExpire();
        String cvv = generateCVV();
        double creditLimit = determineCreditLimit(client);

        return new CardDomain(
                cardNumber,
                expireDate,
                creditLimit,
                cvv,
                client.getCardDomain().getLastUpdateLimit(),
                client.getCardDomain().getInvoiceDueDate());
    }

    private String generateCardNumber(){
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder(PREFIX_NUMBER_CARD);
        for(int i = 0; i < SIZE_NUMBER_CARD - PREFIX_NUMBER_CARD.length(); i++){
            cardNumber.append(random.nextInt(10));
        }
        return cardNumber.toString();
    }

    private LocalDate generateDataExpire(){
        Random random = new Random();
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(5) + 2025;
        return LocalDate.of(year, month, 1);
    }

    private String generateCVV(){
        Random random = new Random();
        return String.format("%03d", random.nextInt(1000));
    }

    private double determineCreditLimit(ClientDomain client){
        int age = client.getAge();
        double salary = client.getMonthlyIncome();

        if(age >= 18 && age <= 25){
            if (salary < 3000) {
                return 1000.00;
            } else if (salary < 6000) {
                return 3000.00;
            } else {
                return 5000.00;
            }
        } else if (age >= 26 && age <= 40) {
            if (salary < 4000) {
                return 2000.00;
            } else if (salary < 8000) {
                return 5000.00;
            } else {
                return 10000.00;
            }
        } else {
            if (salary < 5000) {
                return 3000.00;
            } else if (salary < 10000) {
                return 8000.00;
            } else {
                return 15000.00;
            }
        }
    }
}
