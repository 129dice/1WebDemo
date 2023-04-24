package com.service;

import com.pojo.Case;
import com.pojo.Cpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseService {


    List<Case> selectAll();

    void add(Case cas);

    void deleteByIds(int[] ids);

    void deleteByCaseId(int id);

    void revise(Case cas);

    List<Case> rcAll(String case1, String case2);
}
