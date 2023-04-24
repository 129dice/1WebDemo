package com.pojo;

public class recommend {
    private String CPU_NAME;
    private String gpu1_name;
    private String gpu2_name;
    private String mb1_name;
    private String mb2_name;
    private String ram1_name;
    private String ram2_name;
    private String rom1_name;
    private String rom2_name;
    private String power1_name;
    private String power2_name;
    private String case1_name;
    private String case2_name;

    @Override
    public String toString() {
        return "recommend{" +
                "CPU_NAME='" + CPU_NAME + '\'' +
                ", gpu1_name='" + gpu1_name + '\'' +
                ", gpu2_name='" + gpu2_name + '\'' +
                ", mb1_name='" + mb1_name + '\'' +
                ", mb2_name='" + mb2_name + '\'' +
                ", ram1_name='" + ram1_name + '\'' +
                ", ram2_name='" + ram2_name + '\'' +
                ", rom1_name='" + rom1_name + '\'' +
                ", rom2_name='" + rom2_name + '\'' +
                ", power1_name='" + power1_name + '\'' +
                ", power2_name='" + power2_name + '\'' +
                ", case1_name='" + case1_name + '\'' +
                ", case2_name='" + case2_name + '\'' +
                '}';
    }

    public String getCPU_NAME() {
        return CPU_NAME;
    }

    public void setCPU_NAME(String CPU_NAME) {
        this.CPU_NAME = CPU_NAME;
    }

    public String getGpu1_name() {
        return gpu1_name;
    }

    public void setGpu1_name(String gpu1_name) {
        this.gpu1_name = gpu1_name;
    }

    public String getGpu2_name() {
        return gpu2_name;
    }

    public void setGpu2_name(String gpu2_name) {
        this.gpu2_name = gpu2_name;
    }

    public String getMb1_name() {
        return mb1_name;
    }

    public void setMb1_name(String mb1_name) {
        this.mb1_name = mb1_name;
    }

    public String getMb2_name() {
        return mb2_name;
    }

    public void setMb2_name(String mb2_name) {
        this.mb2_name = mb2_name;
    }

    public String getRam1_name() {
        return ram1_name;
    }

    public void setRam1_name(String ram1_name) {
        this.ram1_name = ram1_name;
    }

    public String getRam2_name() {
        return ram2_name;
    }

    public void setRam2_name(String ram2_name) {
        this.ram2_name = ram2_name;
    }

    public String getRom1_name() {
        return rom1_name;
    }

    public void setRom1_name(String rom1_name) {
        this.rom1_name = rom1_name;
    }

    public String getRom2_name() {
        return rom2_name;
    }

    public void setRom2_name(String rom2_name) {
        this.rom2_name = rom2_name;
    }

    public String getPower1_name() {
        return power1_name;
    }

    public void setPower1_name(String power1_name) {
        this.power1_name = power1_name;
    }

    public String getPower2_name() {
        return power2_name;
    }

    public void setPower2_name(String power2_name) {
        this.power2_name = power2_name;
    }

    public String getCase1_name() {
        return case1_name;
    }

    public void setCase1_name(String case1_name) {
        this.case1_name = case1_name;
    }

    public String getCase2_name() {
        return case2_name;
    }

    public void setCase2_name(String case2_name) {
        this.case2_name = case2_name;
    }
}
