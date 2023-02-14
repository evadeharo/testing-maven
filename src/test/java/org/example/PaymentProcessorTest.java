package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentProcessorTest {
    private Account buyer;
    private Account seller;
    private PaymentProcessor paymentProcessor;

    @BeforeEach
    void setUp() {
         buyer = new Account("Eva", "En mi casa", new BigDecimal(1000), "ABC123");
         seller = new Account("Eva", "En mi casa", new BigDecimal(1000), "ABC123");

        paymentProcessor = new PaymentProcessor();
    }
    @Test
    void processTaxExemptPurchase() {
        paymentProcessor.processTaxExemptPurchase(seller, buyer, new BigDecimal(100));

        assertEquals(new BigDecimal(1100), buyer.getBalance());
        assertEquals(new BigDecimal(900), seller.getBalance());
    }

    @Test
    void processTaxedPurchase() {
        paymentProcessor.processTaxedPurchase(seller, buyer, new BigDecimal(100));

        assertEquals(new BigDecimal(1114).setScale(2 , RoundingMode.HALF_EVEN), buyer.getBalance());
        assertEquals(new BigDecimal(900).setScale(2 ,RoundingMode.HALF_EVEN), seller.getBalance());
    }
}