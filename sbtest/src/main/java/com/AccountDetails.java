package com;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountDetails {

    @Id
    private String accountNumber;
    private String accountName;
    private String date;
    private String currency;
    private String debitAmount;
    private String creditAmount;
    private String creditOrDebit;
    private String narration;

    public AccountDetails(){

    }

    public AccountDetails(String accountNumber, String accountName, String date, String currency, String debitAmount, String creditAmount, String creditOrDebit, String narration) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.date = date;
        this.currency = currency;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
        this.creditOrDebit = creditOrDebit;
        this.narration = narration;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditOrDebit() {
        return creditOrDebit;
    }

    public void setCreditOrDebit(String creditOrDebit) {
        this.creditOrDebit = creditOrDebit;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
