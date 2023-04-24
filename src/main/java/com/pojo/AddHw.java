package com.pojo;

public class AddHw {

   private Integer userid         ;
   private String  cpu_name       ;
   private String  gpu_name       ;
   private String  mainboard_name ;
   private String  ram_name       ;
   private String  rom_name       ;
   private String  power_name     ;
   private String  case_name      ;

   @Override
   public String toString() {
      return "AddHw{" +
              "userid=" + userid +
              ", cpu_name='" + cpu_name + '\'' +
              ", gpu_name='" + gpu_name + '\'' +
              ", mainboard_name='" + mainboard_name + '\'' +
              ", ram_name='" + ram_name + '\'' +
              ", rom_name='" + rom_name + '\'' +
              ", power_name='" + power_name + '\'' +
              ", case_name='" + case_name + '\'' +
              '}';
   }

   public Integer getUserid() {
      return userid;
   }

   public void setUserid(Integer userid) {
      this.userid = userid;
   }

   public String getCpu_name() {
      return cpu_name;
   }

   public void setCpu_name(String cpu_name) {
      this.cpu_name = cpu_name;
   }

   public String getGpu_name() {
      return gpu_name;
   }

   public void setGpu_name(String gpu_name) {
      this.gpu_name = gpu_name;
   }

   public String getMainboard_name() {
      return mainboard_name;
   }

   public void setMainboard_name(String mainboard_name) {
      this.mainboard_name = mainboard_name;
   }

   public String getRam_name() {
      return ram_name;
   }

   public void setRam_name(String ram_name) {
      this.ram_name = ram_name;
   }

   public String getRom_name() {
      return rom_name;
   }

   public void setRom_name(String rom_name) {
      this.rom_name = rom_name;
   }

   public String getPower_name() {
      return power_name;
   }

   public void setPower_name(String power_name) {
      this.power_name = power_name;
   }

   public String getCase_name() {
      return case_name;
   }

   public void setCase_name(String case_name) {
      this.case_name = case_name;
   }
}
