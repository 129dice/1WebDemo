package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Gpu;
import com.pojo.Mainboard;
import com.pojo.Ram;
import com.pojo.recommend;
import com.service.GpuService;
import com.service.impl.CpuServiceImpl;
import com.service.impl.GpuServiceImpl;
import com.service.impl.MainboardServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/mbServlet/*")
public class MbServlet extends BaseServlet{
    private MainboardServiceImpl MbService=new MainboardServiceImpl();
    private CpuServiceImpl cpuService=new CpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Mainboard> mainboardList = MbService.selectAll();
        String toJSONString = JSON.toJSONString(mainboardList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Mainboard mainboard = JSON.parseObject(s, Mainboard.class);

        System.out.println(mainboard);
        MbService.add(mainboard);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        MbService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByMbId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        MbService.deleteByMbId(id);

        response.getWriter().write("success");
    }
    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Mainboard mainboard = JSON.parseObject(s, Mainboard.class);

        System.out.println(mainboard);
        MbService.revise(mainboard);

        response.getWriter().write("success");
    }
    public void RcMbAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);
        System.out.println(rc);
        String mb1=rc.getMb1_name();
        String mb2=rc.getMb2_name();
        System.out.println(mb1);
        List<Mainboard> mbList = MbService.rcAll(mb1, mb2);
        System.out.println(mbList);
        String toJSONString = JSON.toJSONString(mbList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }
}
