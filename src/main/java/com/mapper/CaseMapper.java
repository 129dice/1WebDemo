package com.mapper;

import com.pojo.Case;
import com.pojo.Power;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseMapper {
    /*查询所有*/
    List<Case> selectAll();

    void add(Case cas);

    void deleteByIds(@Param("ids") int[] ids);

    void deleteByCaseId(int id);

    void revise(Case cas);

    List<Case> rcAll(@Param("case1")String case1, @Param("case2")String case2);
}
