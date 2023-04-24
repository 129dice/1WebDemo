package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Case;
import com.pojo.Power;
import com.pojo.recommend;
import com.service.CpuService;
import com.service.impl.CaseServiceImpl;
import com.service.impl.CpuServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/caseServlet/*")
public class CaseServlet extends BaseServlet{
    private CaseServiceImpl caseService=new CaseServiceImpl();
    private CpuService cpuService=new CpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Case> caseList = caseService.selectAll();
        String toJSONString = JSON.toJSONString(caseList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Case cas = JSON.parseObject(s, Case.class);

        System.out.println(cas);
        caseService.add(cas);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        caseService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByCaseId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        caseService.deleteByCaseId(id);

        response.getWriter().write("success");
    }

    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Case cas = JSON.parseObject(s, Case.class);

        System.out.println(cas);
        caseService.revise(cas);

        response.getWriter().write("success");
    }

    public void RcCaseAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);
        String case1=rc.getCase1_name();
        String case2=rc.getCase2_name();
        List<Case> caseList = caseService.rcAll(case1, case2);
        System.out.println(caseList);
        String toJSONString = JSON.toJSONString(caseList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

}
