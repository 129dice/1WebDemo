package com.mapper;

import com.pojo.Gpu;
import com.pojo.Mainboard;
import org.apache.ibatis.annotations.Param;
import sun.applet.Main;

import java.util.List;

public interface MainboardMapper {



    void add(Mainboard mainboard);

    List<Mainboard> selectAll();

    void deleteByIds(@Param("ids") int[] ids);
    void deleteByMbId(int id);

    void revise(Mainboard mb);

    List<Mainboard> rcAll(@Param("mb1")String mb1,@Param("mb2")String mb2);
}
