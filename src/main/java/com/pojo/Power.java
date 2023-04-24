package com.pojo;

public class Power {
    private Integer powerId;
    private String powerName;
    private Integer powerPll;
    private Integer powerPrice;
    private String powerCompany;

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public Integer getPowerPll() {
        return powerPll;
    }

    public void setPowerPll(Integer powerPll) {
        this.powerPll = powerPll;
    }

    public Integer getPowerPrice() {
        return powerPrice;
    }

    public void setPowerPrice(Integer powerPrice) {
        this.powerPrice = powerPrice;
    }

    public String getPowerCompany() {
        return powerCompany;
    }

    public void setPowerCompany(String powerCompany) {
        this.powerCompany = powerCompany;
    }

    @Override
    public String toString() {
        return "Power{" +
                "powerId=" + powerId +
                ", powerName='" + powerName + '\'' +
                ", powerPll=" + powerPll +
                ", powerPrice=" + powerPrice +
                ", powerCompany='" + powerCompany + '\'' +
                '}';
    }
}
