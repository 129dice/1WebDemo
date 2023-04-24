package com.service;

import com.pojo.Gpu;

import java.util.List;

public interface GpuService {


    List<Gpu> selectAll();

    void add(Gpu gpu);
    void deleteByIds( int [] ids);
    void deleteByGpuId( int id);
    void revise(Gpu gpu);
    List<Gpu> RcAll(String gpu1,String gpu2);
}
