package com.pojo;

public class Cpu {
    private Integer cpuId;
    private String cpuName;
    private int cpuPrice;
    private int cpuCore;
    private int cpuThread;
    private int cpuHaveGpu;
    private String cpuImage;
    private int cpuPll;
    private  String cpuClockSpeed;

    public String getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(String cpuClockSpeed) {
        this.cpuClockSpeed = cpuClockSpeed;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cpuId=" + cpuId +
                ", cpuName='" + cpuName + '\'' +
                ", cpuPrice=" + cpuPrice +
                ", cpuCore=" + cpuCore +
                ", cpuThread=" + cpuThread +
                ", cpuHaveGpu=" + cpuHaveGpu +
                ", cpuImage='" + cpuImage + '\'' +
                ", cpuPll=" + cpuPll +
                ", cpuClockSpeed='" + cpuClockSpeed + '\'' +
                '}';
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getCpuPrice() {
        return cpuPrice;
    }

    public void setCpuPrice(int cpuPrice) {
        this.cpuPrice = cpuPrice;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public int getCpuThread() {
        return cpuThread;
    }

    public void setCpuThread(int cpuThread) {
        this.cpuThread = cpuThread;
    }

    public int getCpuHaveGpu() {
        return cpuHaveGpu;
    }

    public void setCpuHaveGpu(int cpuHaveGpu) {
        this.cpuHaveGpu = cpuHaveGpu;
    }

    public String getCpuImage() {
        return cpuImage;
    }

    public void setCpuImage(String cpuImage) {
        this.cpuImage = cpuImage;
    }

    public int getCpuPll() {
        return cpuPll;
    }

    public void setCpuPll(int cpuPll) {
        this.cpuPll = cpuPll;
    }

}
