package com.service.impl;

import com.mapper.AddMapper;
import com.pojo.AddHw;
import com.service.AddService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AddServiceImlp implements AddService {
    //创造工厂对象
    SqlSessionFactory factory= sqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public void add(AddHw hw) {
        SqlSession sqlSession = factory.openSession();

        AddMapper mapper = sqlSession.getMapper(AddMapper.class);

        mapper.add(hw);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<AddHw> selectAll() {
        SqlSession sqlSession = factory.openSession();

        AddMapper mapper = sqlSession.getMapper(AddMapper.class);

        List<AddHw> AHList = mapper.selectAll();
        sqlSession.close();
        return AHList;

    }

    @Override
    public List<AddHw> selectMy(Integer userid) {
        SqlSession sqlSession = factory.openSession();

        AddMapper mapper = sqlSession.getMapper(AddMapper.class);

        List<AddHw> AHList = mapper.selectMy(userid);
        sqlSession.close();
        return AHList;

    }

    @Override
    public void deleteByUserId(Integer id) {
            SqlSession sqlSession = factory.openSession();

            AddMapper mapper = sqlSession.getMapper(AddMapper.class);
            mapper.deleteByUserId(id);

            sqlSession.commit();
            sqlSession.close();
    }
}
