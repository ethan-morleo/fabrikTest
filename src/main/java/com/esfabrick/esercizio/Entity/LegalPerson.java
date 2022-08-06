package com.esfabrick.esercizio.Entity;

public class LegalPerson {
    private String fiscalCode;
    
    public LegalPerson(){};

    public LegalPerson(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    //getter-setter

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

}
