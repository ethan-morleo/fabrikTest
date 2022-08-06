package com.esfabrick.esercizio.Entity;

public class Creditor{
    private String name;
    private Account account;

    public Creditor(){};

    public Creditor(String name, Account account) {
        this.name = name;
        this.account=account;
    }

    //getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
