package com.service;

import com.pojo.AddHw;

import java.util.List;

public interface AddService {
    void add(AddHw hw);

    List<AddHw> selectAll();

    List<AddHw> selectMy(Integer userid);

    void deleteByUserId(Integer id);
}
