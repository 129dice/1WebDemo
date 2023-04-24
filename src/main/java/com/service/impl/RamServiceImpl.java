package com.service.impl;

import com.mapper.CpuMapper;
import com.mapper.GpuMapper;
import com.mapper.MainboardMapper;
import com.mapper.RamMapper;
import com.pojo.Cpu;
import com.pojo.Gpu;
import com.pojo.Ram;
import com.service.RamService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RamServiceImpl  implements RamService {
    SqlSessionFactory factory= sqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Ram> selectAll() {
        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);

        List<Ram> ramList = mapper.selectAll();
        sqlSession.close();
        return ramList;
    }

    @Override
    public void add(Ram ram) {
        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);

        mapper.add(ram);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByRamId(int id) {
        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);
        mapper.deleteByRamId(id);

        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void revise(Ram ram) {
        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);

        mapper.revise(ram);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Ram> rcAll(String ram1, String ram2) {

        SqlSession sqlSession = factory.openSession();

        RamMapper mapper = sqlSession.getMapper(RamMapper.class);

        List<Ram> ramList = mapper.rcAll(ram1,ram2);
        sqlSession.close();
        return ramList;
    }
}
