package com.service.impl;


import com.mapper.PowerMapper;
import com.mapper.RomMapper;
import com.pojo.Power;
import com.pojo.Rom;
import com.service.PowerService;
import com.service.RomService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class PowerServiceImpl implements PowerService {
    //创造工厂对象
    SqlSessionFactory factory=sqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Power> selectAll(){
        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);

        List<Power> PowerList = mapper.selectAll();
        sqlSession.close();
        return PowerList;
    }
    @Override
    public void add(Power power){

        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);

        mapper.add(power);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByPowerId(int id) {
        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);
        mapper.deleteByPowerId(id);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void revise(Power power) {
        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);

        mapper.revise(power);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Power> rcAll(String power1, String power2) {
        SqlSession sqlSession = factory.openSession();

        PowerMapper mapper = sqlSession.getMapper(PowerMapper.class);

        List<Power> powerList = mapper.rcAll(power1,power2);
        sqlSession.close();
        return powerList;

    }
}
