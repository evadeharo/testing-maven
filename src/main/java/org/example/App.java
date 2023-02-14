package org.example;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        BigDecimal count = new BigDecimal("19029392.12");
        BigDecimal operationValue = new BigDecimal("392.12");

        Account buyer = new Account("Eva", "En mi casa", count, "ABC123");
        Account seller = new Account("Eva", "En mi casa", count, "ABC123");

        //TEST 1 -> processTaxExemptPurchase
        // System.out.println(buyer.getBalance());
        // new PaymentProcessor().processTaxExemptPurchase(buyer, seller, operationValue );
        // System.out.println(buyer.getBalance());

        //TEST 2 -> processTaxedPurchase
        // System.out.println(buyer.getBalance());
        // new PaymentProcessor().processTaxedPurchase(buyer, seller, operationValue );
        // System.out.println(buyer.getBalance());
    }
}
