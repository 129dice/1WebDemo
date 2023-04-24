package com.service;

import com.pojo.Cpu;
import com.pojo.Ram;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RamService {


    /*查询所有*/
    List<Ram> selectAll();

    void add(Ram ram);

    void deleteByIds(int[] ids);

    void deleteByRamId(int id);

    void revise(Ram ram);

    List<Ram> rcAll(String ram1, String ram2 );
}
