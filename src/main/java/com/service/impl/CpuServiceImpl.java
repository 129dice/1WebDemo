package com.service.impl;


import com.mapper.CpuMapper;
import com.pojo.Cpu;
import com.pojo.recommend;
import com.service.CpuService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.util.sqlSessionFactoryUtils;

import java.util.List;

public class CpuServiceImpl implements CpuService{
    //创造工厂对象
    SqlSessionFactory factory=sqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Cpu> selectAll(){
        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);

        List<Cpu> cpuList = mapper.selectAll();
        sqlSession.close();
        return cpuList;
    }
    @Override
    public void add(Cpu cpu){

        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);

        mapper.add(cpu);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByCpuId(int id) {
        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);
        mapper.deleteByCpuId(id);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void revise(Cpu cpu) {
        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);

        mapper.revise(cpu);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Cpu> selectRc() {

        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);

        List<Cpu> cpuList = mapper.selectRc();
        sqlSession.close();
        return cpuList;
    }

    @Override
    public recommend RcAll(String cpu_name) {
        SqlSession sqlSession = factory.openSession();

        CpuMapper mapper = sqlSession.getMapper(CpuMapper.class);

        recommend re = mapper.RcAll(cpu_name);
        sqlSession.close();
        return re;
    }

}
