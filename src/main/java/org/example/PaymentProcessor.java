package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentProcessor {
    BigDecimal taxes = new BigDecimal("1.14");
    public void processTaxExemptPurchase(Account buyer, Account seller, BigDecimal purchaseAmount) {
        BigDecimal buyerBalance = buyer.getBalance().subtract(purchaseAmount);
        buyer.setBalance(buyerBalance);
        BigDecimal sellerBalance = seller.getBalance().add(purchaseAmount);
        seller.setBalance(sellerBalance);
    }

    public void processTaxedPurchase (Account buyer, Account seller, BigDecimal purchaseAmount) {
        BigDecimal newTax = purchaseAmount.multiply(taxes);
        BigDecimal buyerBalance = buyer.getBalance().subtract(newTax);
        buyer.setBalance(buyerBalance);
        BigDecimal sellerBalance = seller.getBalance().add(newTax);
        seller.setBalance(sellerBalance);
    }

    /* public void  issueRefund (Account buyer, Account seller, BigDecimal purchaseAmount, Integer percent) {
        BigDecimal convertInt = new BigDecimal(percent / 100);
        BigDecimal divideNum = new BigDecimal(100);

        purchaseAmount.multiply(convertInt).divide(divideNum);
        seller.getBalance().subtract(purchaseAmount);
        buyer.getBalance().add(purchaseAmount);
    }*/
}
