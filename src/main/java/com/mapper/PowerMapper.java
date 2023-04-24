package com.mapper;

import com.pojo.Cpu;
import com.pojo.Power;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PowerMapper {
    /*查询所有*/
    List<Power> selectAll();

    void add(Power power);

    void deleteByIds(@Param("ids") int[] ids);

    void deleteByPowerId(int id);

    void revise(Power power);

    List<Power> rcAll(@Param("power1")String power1,@Param("power2") String power2);
}
