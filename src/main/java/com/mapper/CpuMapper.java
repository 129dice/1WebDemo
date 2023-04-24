package com.mapper;

import com.pojo.Cpu;
import com.pojo.recommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpuMapper {
    /*查询所有*/
    List<Cpu> selectAll();

    void add(Cpu cpu);

    void deleteByIds(@Param("ids") int[] ids);

    void deleteByCpuId(int id);

    void revise(Cpu cpu);
    List<Cpu> selectRc();
    recommend RcAll(@Param("cpu_name") String cpu_name);

}
