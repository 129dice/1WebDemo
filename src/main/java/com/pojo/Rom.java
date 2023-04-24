package com.pojo;

public class Rom {

   private Integer romId;
   private  String romName;
   private String romCompany;
   private Integer romPrice;
   private Integer romCap;
   private String  romType;

    @Override
    public String toString() {
        return "Rom{" +
                "romId=" + romId +
                ", romName='" + romName + '\'' +
                ", romCompany='" + romCompany + '\'' +
                ", romPrice=" + romPrice +
                ", romCap=" + romCap +
                ", romType='" + romType + '\'' +
                '}';
    }

    public Integer getRomId() {
        return romId;
    }

    public void setRomId(Integer romId) {
        this.romId = romId;
    }

    public String getRomName() {
        return romName;
    }

    public void setRomName(String romName) {
        this.romName = romName;
    }

    public String getRomCompany() {
        return romCompany;
    }

    public void setRomCompany(String romCompany) {
        this.romCompany = romCompany;
    }

    public Integer getRomPrice() {
        return romPrice;
    }

    public void setRomPrice(Integer romPrice) {
        this.romPrice = romPrice;
    }

    public Integer getRomCap() {
        return romCap;
    }

    public void setRomCap(Integer romCap) {
        this.romCap = romCap;
    }

    public String getRomType() {
        return romType;
    }

    public void setRomType(String romType) {
        this.romType = romType;
    }
}
