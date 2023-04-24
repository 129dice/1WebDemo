package com.pojo;

public class Ram {
    private Integer ramId;
    private String ramName;
    private Integer ramCap;
    private String ramCompany;
    private String ramFreq;
    private Integer ramPrice;

    @Override
    public String toString() {
        return "Ram{" +
                "ramId=" + ramId +
                ", ramName='" + ramName + '\'' +
                ", ramCap=" + ramCap +
                ", ramCompany='" + ramCompany + '\'' +
                ", ramFreq='" + ramFreq + '\'' +
                ", ramPrice=" + ramPrice +
                '}';
    }

    public Integer getRamId() {
        return ramId;
    }

    public void setRamId(Integer ramId) {
        this.ramId = ramId;
    }

    public String getRamName() {
        return ramName;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }

    public Integer getRamCap() {
        return ramCap;
    }

    public void setRamCap(Integer ramCap) {
        this.ramCap = ramCap;
    }

    public String getRamCompany() {
        return ramCompany;
    }

    public void setRamCompany(String ramCompany) {
        this.ramCompany = ramCompany;
    }

    public String getRamFreq() {
        return ramFreq;
    }

    public void setRamFreq(String ramFreq) {
        this.ramFreq = ramFreq;
    }

    public Integer getRamPrice() {
        return ramPrice;
    }

    public void setRamPrice(Integer ramPrice) {
        this.ramPrice = ramPrice;
    }
}
