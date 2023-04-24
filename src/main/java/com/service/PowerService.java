package com.service;

import com.pojo.Power;
import com.pojo.Rom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PowerService {

    List<Power> selectAll();

    void add(Power power);

    void deleteByIds(int[] ids);

    void deleteByPowerId(int id);

    void revise(Power power);

    List<Power> rcAll(String power1, String power2);
}
