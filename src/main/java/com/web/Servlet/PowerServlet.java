package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Power;
import com.pojo.Rom;
import com.pojo.recommend;
import com.service.impl.CpuServiceImpl;
import com.service.impl.PowerServiceImpl;
import com.service.impl.RomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/powerServlet/*")
public class PowerServlet extends BaseServlet{
    private PowerServiceImpl powerService=new PowerServiceImpl();
    private CpuServiceImpl cpuService=new CpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Power> powerList = powerService.selectAll();
        String toJSONString = JSON.toJSONString(powerList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Power power = JSON.parseObject(s, Power.class);

        System.out.println(power);
        powerService.add(power);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        powerService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByPowerId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        powerService.deleteByPowerId(id);

        response.getWriter().write("success");
    }

    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Power power = JSON.parseObject(s, Power.class);

        System.out.println(power);
        powerService.revise(power);

        response.getWriter().write("success");
    }



    public void RcPowerAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);
        String power1=rc.getPower1_name();
        String power2=rc.getPower2_name();
        List<Power> powerList = powerService.rcAll(power1, power2);
        String toJSONString = JSON.toJSONString(powerList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

}
