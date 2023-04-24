package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Cpu;
import com.pojo.Gpu;
import com.pojo.Ram;
import com.pojo.recommend;
import com.service.CpuService;
import com.service.impl.CpuServiceImpl;
import com.service.impl.RamServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/ramServlet/*")
public class RamServlet extends BaseServlet{
    private RamServiceImpl ramService=new RamServiceImpl();
    private CpuServiceImpl cpuService=new CpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Ram> ramList = ramService.selectAll();
        String toJSONString = JSON.toJSONString(ramList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Ram ram = JSON.parseObject(s, Ram.class);

        System.out.println(ram);
        ramService.add(ram);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        ramService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByRamId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        ramService.deleteByRamId(id);

        response.getWriter().write("success");
    }

    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Ram ram = JSON.parseObject(s, Ram.class);

        System.out.println(ram);
        ramService.revise(ram);

        response.getWriter().write("success");
    }
    public void RcRamAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);
        String ram1=rc.getRam1_name();
        String ram2=rc.getRam2_name();
        List<Ram> ramList = ramService.rcAll(ram1, ram2);
        String toJSONString = JSON.toJSONString(ramList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

}
