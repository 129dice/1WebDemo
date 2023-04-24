package com.service.impl;

import com.mapper.MainboardMapper;
import com.pojo.Mainboard;
import com.service.MainboardService;
import com.util.sqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MainboardServiceImpl implements MainboardService {

    SqlSessionFactory factory= sqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public void add(Mainboard mainboard) {
        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);

        mapper.add(mainboard);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Mainboard> selectAll() {
        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);

        List<Mainboard> mainboardList = mapper.selectAll();
        sqlSession.close();
        return mainboardList;
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);
        mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void deleteByMbId(int id) {
        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);
        mapper.deleteByMbId(id);

        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void revise(Mainboard mb) {
        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);

        mapper.revise(mb);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Mainboard> rcAll(String mb1, String mb2) {

        SqlSession sqlSession = factory.openSession();

        MainboardMapper mapper = sqlSession.getMapper(MainboardMapper.class);

        List<Mainboard> mbList = mapper.rcAll(mb1,mb2);
        sqlSession.close();
        return mbList;
    }
}
