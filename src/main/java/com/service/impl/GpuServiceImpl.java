package com.service.impl;

import com.mapper.CpuMapper;
import com.mapper.GpuMapper;
import com.pojo.Cpu;
import com.pojo.Gpu;
import com.service.GpuService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class GpuServiceImpl implements GpuService {

    SqlSessionFactory factory= sqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Gpu> selectAll() {
        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);

        List<Gpu> gpuList = mapper.selectAll();
        sqlSession.close();
        return gpuList;
    }

    @Override
    public void add(Gpu gpu) {


        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);

        mapper.add(gpu);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByGpuId(int id) {
        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);
        mapper.deleteByGpuId(id);

        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void revise(Gpu gpu) {
        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);

        mapper.revise(gpu);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Gpu> RcAll(String gpu1, String gpu2) {
        SqlSession sqlSession = factory.openSession();

        GpuMapper mapper = sqlSession.getMapper(GpuMapper.class);

        List<Gpu> gpuList = mapper.rcAll(gpu1,gpu2);
        sqlSession.close();
        return gpuList;
    }
}
