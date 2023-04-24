package com.mapper;

import com.pojo.Cpu;
import com.pojo.Gpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GpuMapper {
    /*查询所有*/
    List<Gpu> selectAll();

    void add(Gpu gpu);
    void deleteByIds(@Param("ids") int[] ids);
    void deleteByGpuId(int id);

    void revise(Gpu gpu);
    List<Gpu> rcAll(@Param("gpu1")String gpu1,@Param("gpu2")String gpu2 );

}
