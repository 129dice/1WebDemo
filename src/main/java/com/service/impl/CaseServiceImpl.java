package com.service.impl;


import com.mapper.CaseMapper;
import com.mapper.PowerMapper;
import com.mapper.RamMapper;
import com.pojo.Case;
import com.pojo.Power;
import com.pojo.Ram;
import com.service.CaseService;
import com.service.PowerService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CaseServiceImpl implements CaseService {
    //创造工厂对象
    SqlSessionFactory factory=sqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Case> selectAll(){
        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);

        List<Case> CaseList = mapper.selectAll();
        sqlSession.close();
        return CaseList;
    }
    @Override
    public void add(Case cas){

        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);

        mapper.add(cas);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByCaseId(int id) {
        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        mapper.deleteByCaseId(id);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void revise(Case cas) {
        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);

        mapper.revise(cas);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Case> rcAll(String case1, String case2) {

        SqlSession sqlSession = factory.openSession();

        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);

        List<Case> caseList = mapper.rcAll(case1,case2);
        sqlSession.close();
        return caseList;
    }
}
