package com.service;

import com.pojo.Case;
import com.pojo.User;

import java.util.List;

public interface UserService {


    void addUser(User user);

    User selectLogin(User user);

    List<User> selectAll();
}
