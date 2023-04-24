package com.mapper;

import com.pojo.Rom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RomMapper {
    /*查询所有*/
    List<Rom> selectAll();

    void add(Rom rom);

    void deleteByIds(@Param("ids") int[] ids);

    void deleteByRomId(int id);

    void revise(Rom rom);

    List<Rom> rcAll(@Param("rom1")String rom1, @Param("rom2")String rom2);
}
