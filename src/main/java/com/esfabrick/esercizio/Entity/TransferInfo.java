package com.esfabrick.esercizio.Entity;

public class TransferInfo {
    private Creditor creditor;
    private String executionDate;
    private String description;
    private Number amount;
    private String currency;
    private TaxRelief taxRelief;

    public TransferInfo(){};

    public TransferInfo(Creditor creditor,String executionDate, String desc, Number amount, String curr, TaxRelief tax){
        this.creditor=creditor;
        this.executionDate=executionDate;
        this.description=desc;
        this.amount=amount;
        this.currency=curr;
        this.taxRelief=tax;
    }

    //getter-setter

    public Creditor getCreditor() {
        return creditor;
    }
    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    public String getExecutionDate() {
        return executionDate;
    }
    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Number getAmount() {
        return amount;
    }
    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TaxRelief getTaxRelief() {
        return taxRelief;
    }
    public void setTaxRelief(TaxRelief taxRelief) {
        this.taxRelief = taxRelief;
    }
}
