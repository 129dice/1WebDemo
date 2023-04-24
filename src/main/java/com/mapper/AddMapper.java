package com.mapper;

import com.pojo.AddHw;
import com.pojo.Cpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddMapper  {
    /*查询所有*/
    List<AddHw> selectAll();

    void add(AddHw hw);

    List<AddHw> selectMy(@Param("userid") Integer userid);

    void deleteByUserId(Integer id);
}
