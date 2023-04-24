package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Cpu;
import com.pojo.Gpu;
import com.pojo.recommend;
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

@WebServlet("/cpuServlet/*")
public class CpuServlet extends BaseServlet{

    private CpuService cpuService=new CpuServiceImpl();
    private GpuService gpuService=new GpuServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Cpu> cpuList = cpuService.selectAll();
        String toJSONString = JSON.toJSONString(cpuList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Cpu cpu = JSON.parseObject(s, Cpu.class);

        System.out.println(cpu);
        cpuService.add(cpu);

        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        int[] ids = JSON.parseObject(s, int[].class);

        System.out.println(ids);
        cpuService.deleteByIds(ids);

        response.getWriter().write("success");
    }
    public void deleteByCpuId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);

        System.out.println(id);
        cpuService.deleteByCpuId(id);

        response.getWriter().write("success");
    }

    public void revise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Cpu cpu = JSON.parseObject(s, Cpu.class);

        System.out.println(cpu);
        cpuService.revise(cpu);

        response.getWriter().write("success");
    }
    public void selectRc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Cpu> cpuList = cpuService.selectRc();
        String toJSONString = JSON.toJSONString(cpuList);

        System.out.println(cpuList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }
    public void RcAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br=request.getReader();
        String s = br.readLine();
        recommend rc = cpuService.RcAll(s);
        String gpu1=rc.getGpu1_name();
        String gpu2=rc.getGpu2_name();
        List<Gpu> gpuList = gpuService.RcAll(gpu1, gpu2);
        System.out.println(gpuList);
        String toJSONString = JSON.toJSONString(gpuList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

}
