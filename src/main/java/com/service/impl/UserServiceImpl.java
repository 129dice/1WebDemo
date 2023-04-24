package com.service.impl;


import com.mapper.*;
import com.pojo.Case;
import com.pojo.Cpu;
import com.pojo.Rom;
import com.pojo.User;
import com.service.CpuService;
import com.service.UserService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserServiceImpl implements UserService{
    //创造工厂对象
    SqlSessionFactory factory=sqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public void addUser(User user) {

        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User selectLogin(User user) {
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.selectLogin(user);
        sqlSession.close();
        return user1;
    }

    @Override
    public List<User> selectAll() {
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.selectAll();
        sqlSession.close();
        return userList;

    }
}
