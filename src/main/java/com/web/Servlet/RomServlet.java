package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Cpu;
import com.pojo.Ram;
import com.pojo.Rom;
import com.pojo.recommend;
import com.service.CpuService;
import com.service.impl.CpuServiceImpl;
import com.service.impl.RomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/romServlet/*")
public class RomServlet extends BaseServlet{
    private RomServiceImpl romService=new RomServiceImpl();
    private CpuServiceImpl cpuService=new CpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Rom> romList = romService.selectAll();
        String toJSONString = JSON.toJSONString(romList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Rom rom = JSON.parseObject(s, Rom.class);

        System.out.println(rom);
        romService.add(rom);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        romService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByRomId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        romService.deleteByRomId(id);

        response.getWriter().write("success");
    }

    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Rom rom = JSON.parseObject(s, Rom.class);

        System.out.println(rom);
        romService.revise(rom);

        response.getWriter().write("success");
    }

    public void RcRomAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);

        String rom1=rc.getRom1_name();
        String rom2=rc.getRom2_name();
        List<Rom> romList = romService.rcAll(rom1, rom2);
        String toJSONString = JSON.toJSONString(romList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

}
