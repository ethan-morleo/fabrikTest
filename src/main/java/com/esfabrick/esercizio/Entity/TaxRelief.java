package com.esfabrick.esercizio.Entity;

public class TaxRelief {
    private String taxReliefId;
    private Boolean isCondoUpgrade;
    private String creditorFiscalCode;
    private String beneficiaryType;
    private NaturalPerson naturalPersonBeneficiary;
    private LegalPerson legalPersonBeneficiary;
    
    public TaxRelief(){};

    public TaxRelief(String taxReliefId, Boolean isCondoUpgrade, String creditorFiscalCode, String beneficiaryType,
            NaturalPerson naturalPersonBeneficiary, LegalPerson legalPersonBeneficiary) {
        this.taxReliefId = taxReliefId;
        this.isCondoUpgrade = isCondoUpgrade;
        this.creditorFiscalCode = creditorFiscalCode;
        this.beneficiaryType = beneficiaryType;
        this.naturalPersonBeneficiary = naturalPersonBeneficiary;
        this.legalPersonBeneficiary = legalPersonBeneficiary;
    }

    //getter-setter

    public String getTaxReliefId() {
        return taxReliefId;
    }
    public void setTaxReliefId(String taxReliefId) {
        this.taxReliefId = taxReliefId;
    }
    public Boolean getIsCondoUpgrade() {
        return isCondoUpgrade;
    }
    public void setIsCondoUpgrade(Boolean isCondoUpgrade) {
        this.isCondoUpgrade = isCondoUpgrade;
    }
    public String getCreditorFiscalCode() {
        return creditorFiscalCode;
    }
    public void setCreditorFiscalCode(String creditorFiscalCode) {
        this.creditorFiscalCode = creditorFiscalCode;
    }
    public String getBeneficiaryType() {
        return beneficiaryType;
    }
    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }
    public NaturalPerson getNaturalPersonBeneficiary() {
        return naturalPersonBeneficiary;
    }
    public void setNaturalPersonBeneficiary(NaturalPerson naturalPersonBeneficiary) {
        this.naturalPersonBeneficiary = naturalPersonBeneficiary;
    }
    public LegalPerson getLegalPersonBeneficiary() {
        return legalPersonBeneficiary;
    }
    public void setLegalPersonBeneficiary(LegalPerson legalPersonBeneficiary) {
        this.legalPersonBeneficiary = legalPersonBeneficiary;
    }

}
