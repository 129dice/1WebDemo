package com.pojo;

public class Gpu {
   private  int gpuId ;
   private  String  gpuName;
   private  int gpuFreq;
   private  int gpuMemfreq;
   private  int gpuMem;
   private  int gpuPrice;
   private int gpuPll;

    public int getGpuPll() {
        return gpuPll;
    }

    public void setGpuPll(int gpuPll) {
        this.gpuPll = gpuPll;
    }

    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public int getGpuFreq() {
        return gpuFreq;
    }

    public void setGpuFreq(int gpuFreq) {
        this.gpuFreq = gpuFreq;
    }

    public int getGpuMemfreq() {
        return gpuMemfreq;
    }

    public void setGpuMemfreq(int gpuMemfreq) {
        this.gpuMemfreq = gpuMemfreq;
    }

    public int getGpuMem() {
        return gpuMem;
    }

    public void setGpuMem(int gpuMem) {
        this.gpuMem = gpuMem;
    }

    public int getGpuPrice() {
        return gpuPrice;
    }

    public void setGpuPrice(int gpuPrice) {
        this.gpuPrice = gpuPrice;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "gpuId=" + gpuId +
                ", gpuName=" + gpuName +
                ", gpuFreq=" + gpuFreq +
                ", gpuMemfreq=" + gpuMemfreq +
                ", gpuMem=" + gpuMem +
                ", gpuPrice=" + gpuPrice +
                ", gpuPll=" + gpuPll +
                '}';
    }
}
