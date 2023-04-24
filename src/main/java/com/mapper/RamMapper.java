package com.mapper;

import com.pojo.Gpu;
import com.pojo.Ram;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RamMapper {
    /*查询所有*/
    List<Ram> selectAll();

    void add(Ram ram);

    void deleteByIds(@Param("ids") int[] ids);

    void deleteByRamId(int id);

    void revise(Ram ram);
    List<Ram> rcAll(@Param("ram1")String ram1, @Param("ram2")String ram2 );
}
