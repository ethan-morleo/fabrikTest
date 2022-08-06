package com.esfabrick.esercizio.Entity;

public class NaturalPerson{
    private String fiscalCode1;
    
    public NaturalPerson(){};

    public NaturalPerson(String fiscalCode1) {
        this.fiscalCode1 = fiscalCode1;
    }

    //getter-setter

    public String getFiscalCode1() {
        return fiscalCode1;
    }
    public void setFiscalCode1(String fiscalCode1) {
        this.fiscalCode1 = fiscalCode1;
    }
}
