package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Account {

    @Id
    private String accountNumber;
    private String accountName;
    private String accountType;
    private String balanceDate;
    private String currency;
    private long openingAvailableBalance;

    public Account(){

    }

    public Account(String accountNumber, String accountName, String accountType, String balanceDate, String currency, long openingAvailableBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currency = currency;
        this.openingAvailableBalance = openingAvailableBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getOpeningAvailableBalance() {
        return openingAvailableBalance;
    }

    public void setOpeningAvailableBalance(long openingAvailableBalance) {
        this.openingAvailableBalance = openingAvailableBalance;
    }
}
