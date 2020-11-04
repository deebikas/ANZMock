package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountsRepository accountsRepository;

    public Iterable<Account> viewAllAccounts(){
        /*This return statement would fetch the accounts list from the database
        but it is commented out since I am going to hard code the values for the sake
        of the mock project*/
        return accountsRepository.findAll();

        //List<Account> accountsList = new ArrayList<Account>();
        //addAccountsList(accountsList);
        //return accountsList;
    }

    public void addAccountsList(List<Account> acctList){
        acctList.add(new Account("27684", "Savings Account", "3", "30-Oct-2020", "INR", 1000));
        acctList.add(new Account("33002", "Fixed Deposit", "3", "30-Oct-2020", "INR", 1000));
        acctList.add(new Account("13159", "PPF Account", "3", "30-Oct-2020", "INR", 1000));
        acctList.add(new Account("32459", "FD Account", "3", "30-Oct-2020", "INR", 1000));
        acctList.add(new Account("23765", "Loan Account", "3", "30-Oct-2020", "INR", 1000));
        acctList.add(new Account("10098", "Jewel Account", "3", "30-Oct-2020", "INR", 1000));
    }

    public Iterable<AccountDetails> viewAccountDetails(){
        /*Hard coding again*/
        List<AccountDetails> accountDetails = new ArrayList<AccountDetails>();
        addAccountDetails(accountDetails);
        return accountDetails;
    }

    public void addAccountDetails(List<AccountDetails> acctDetails){
        acctDetails.add(new AccountDetails("27684", "Savings Account", "30-oct-2020", "INR", "", "600", "Credit", "Test1"));
        acctDetails.add(new AccountDetails("27684", "Savings Account", "30-oct-2020", "INR", "50", "", "Debit", "Test2"));
        acctDetails.add(new AccountDetails("27684", "Savings Account", "30-oct-2020", "INR", "33", "", "Debit", "Test3"));
        acctDetails.add(new AccountDetails("27684", "Savings Account", "30-oct-2020", "INR", "", "99", "Credit", "Test4"));
    }

}
