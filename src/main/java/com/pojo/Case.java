package com.pojo;



public class Case {

    private Integer caseId;
    private String caseName;
    private String caseType;
    private String caseColor;
    private Integer casePrice;

    @Override
    public String toString() {
        return "Case{" +
                "caseId=" + caseId +
                ", caseName='" + caseName + '\'' +
                ", caseType='" + caseType + '\'' +
                ", caseColor='" + caseColor + '\'' +
                ", casePrice=" + casePrice +
                '}';
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public Integer getCasePrice() {
        return casePrice;
    }

    public void setCasePrice(Integer casePrice) {
        this.casePrice = casePrice;
    }
}
