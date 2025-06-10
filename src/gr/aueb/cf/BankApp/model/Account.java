package gr.aueb.cf.BankApp.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Account {
    private String iban;
    private BigDecimal balance;

    public Account(){

    }

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
