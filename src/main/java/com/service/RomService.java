package com.service;

import com.pojo.Rom;

import java.util.List;

public interface RomService {


    List<Rom> selectAll();

    void add(Rom rom);

    void deleteByIds(int[] ids);

    void deleteByRomId(int id);

    void revise(Rom rom);

    List<Rom> rcAll(String rom1, String rom2);
}
