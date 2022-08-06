package com.esfabrick.esercizio.Entity;

public class Account{
    private String accountCode;

    public Account(){};

    public Account(String accountCode){
        this.accountCode=accountCode;
    }

    //getter-setter

    public String getAccountCode() {
        return accountCode;
    }
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

}
