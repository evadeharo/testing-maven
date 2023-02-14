package org.example;

import java.math.BigDecimal;

public class Account {
    private  String name;
    private  String adress;
    private BigDecimal balance;
    private  String accountNumber;

    public Account(String name, String adress, BigDecimal balance, String accountNumber) {
        setName(name);
        setAdress(adress);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
