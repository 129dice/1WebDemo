package com.pojo;

public class Mainboard {
  private Integer  mbId     ;
  private String mbName    ;
  private String mbChGrade;
  private Integer mbMem     ;
  private Integer mbM2      ;
  private Integer mbSata    ;
  private Integer mbWifi    ;
  private  Integer mbPrice   ;

    @Override
    public String toString() {
        return "Mainboard{" +
                "mbId=" + mbId +
                ", mbName='" + mbName + '\'' +
                ", mbChGrade='" + mbChGrade + '\'' +
                ", mbMem=" + mbMem +
                ", mbM2=" + mbM2 +
                ", mbSata=" + mbSata +
                ", mbWifi=" + mbWifi +
                ", mbPrice=" + mbPrice +
                '}';
    }

    public Integer getMbId() {
        return mbId;
    }

    public void setMbId(Integer mbId) {
        this.mbId = mbId;
    }

    public String getMbName() {
        return mbName;
    }

    public void setMbName(String mbName) {
        this.mbName = mbName;
    }

    public String getMbChGrade() {
        return mbChGrade;
    }

    public void setMbChGrade(String mbChGrade) {
        this.mbChGrade = mbChGrade;
    }

    public Integer getMbMem() {
        return mbMem;
    }

    public void setMbMem(Integer mbMem) {
        this.mbMem = mbMem;
    }

    public Integer getMbM2() {
        return mbM2;
    }

    public void setMbM2(Integer mbM2) {
        this.mbM2 = mbM2;
    }

    public Integer getMbSata() {
        return mbSata;
    }

    public void setMbSata(Integer mbSata) {
        this.mbSata = mbSata;
    }

    public Integer getMbWifi() {
        return mbWifi;
    }

    public void setMbWifi(Integer mbWifi) {
        this.mbWifi = mbWifi;
    }

    public Integer getMbPrice() {
        return mbPrice;
    }

    public void setMbPrice(Integer mbPrice) {
        this.mbPrice = mbPrice;
    }
}
