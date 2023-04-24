package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.AddHw;
import com.pojo.Case;
import com.pojo.Cpu;
import com.pojo.User;
import com.service.impl.AddServiceImlp;
import com.service.impl.CaseServiceImpl;
import com.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/addServlet/*")
public class AddServlet extends BaseServlet {
    private AddServiceImlp Service = new AddServiceImlp();

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        AddHw hw = JSON.parseObject(s, AddHw.class);

        System.out.println(hw);
        Service.add(hw);

        response.getWriter().write("success");
    }

    public void selectMy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


/*        User user=new User();
        Cookie[] cookies=request.getCookies();
        user.setUserid(CookieUtils.getCookie(cookies,"userid").getValue());*/
        System.out.println("用户id");

        System.out.println();
        List<AddHw> AHList = Service.selectMy(1233);
        String toJSONString = JSON.toJSONString(AHList);
        System.out.println("结果");
        System.out.println(AHList);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);

    }

    //删除自己的配置
    public void deleteByUserId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        Integer id = JSON.parseObject(s, int.class);
        System.out.println("shanchu ");
        System.out.println(id);
        Service.deleteByUserId(id);

        response.getWriter().write("success");
    }

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<AddHw> AHList = Service.selectAll();
        String toJSONString = JSON.toJSONString(AHList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }




}