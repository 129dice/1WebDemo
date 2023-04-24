package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Cpu;
import com.pojo.Gpu;
import com.service.CpuService;
import com.service.GpuService;
import com.service.impl.CpuServiceImpl;
import com.service.impl.GpuServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/gpuServlet/*")
public class GpuServlet extends BaseServlet{
    private GpuService gpuService=new GpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Gpu> gpuList = gpuService.selectAll();
        String toJSONString = JSON.toJSONString(gpuList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Gpu gpu = JSON.parseObject(s, Gpu.class);

        System.out.println(gpu);
        gpuService.add(gpu);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        gpuService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByGpuId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        gpuService.deleteByGpuId(id);

        response.getWriter().write("success");
    }
    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Gpu gpu = JSON.parseObject(s, Gpu.class);

        System.out.println(gpu);
        gpuService.revise(gpu);

        response.getWriter().write("success");
    }
}
