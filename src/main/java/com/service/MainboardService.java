package com.service;

import com.pojo.Mainboard;

import java.util.List;

public interface MainboardService {
    void add(Mainboard mainboard);

    List<Mainboard> selectAll();

    void deleteByIds(int[] ids);
    void deleteByMbId(int id);

    void revise(Mainboard mb);

    List<Mainboard> rcAll(String mb1, String mb2);
}
