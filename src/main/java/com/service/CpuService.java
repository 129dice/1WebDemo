package com.service;

import com.pojo.Cpu;
import com.pojo.Gpu;
import com.pojo.recommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpuService {


    /*查询所有*/
    List<Cpu> selectAll();
    void add(Cpu cpu);
    void deleteByIds( int [] ids);

    void deleteByCpuId( int id);

    void revise(Cpu cpu);
    List<Cpu> selectRc();
    recommend RcAll(String cpu_name);
}
