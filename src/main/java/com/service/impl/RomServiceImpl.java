package com.service.impl;


import com.mapper.RamMapper;
import com.mapper.RomMapper;
import com.pojo.Ram;
import com.pojo.Rom;
import com.service.RomService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RomServiceImpl implements RomService {
    //创造工厂对象
    SqlSessionFactory factory=sqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Rom> selectAll(){
        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);

        List<Rom> romList = mapper.selectAll();
        sqlSession.close();
        return romList;
    }
    @Override
    public void add(Rom rom){

        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);

        mapper.add(rom);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByRomId(int id) {
        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);
        mapper.deleteByRomId(id);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void revise(Rom rom ) {
        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);

        mapper.revise(rom);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Rom> rcAll(String rom1, String rom2) {
        SqlSession sqlSession = factory.openSession();

        RomMapper mapper = sqlSession.getMapper(RomMapper.class);

        List<Rom> romList = mapper.rcAll(rom1,rom2);
        sqlSession.close();
        return romList;
    }
}
