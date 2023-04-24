package com.web.Servlet;


import com.alibaba.fastjson.JSON;
import com.pojo.Cpu;
import com.pojo.Rom;
import com.pojo.User;
import com.service.impl.RomServiceImpl;
import com.service.impl.UserServiceImpl;
import com.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/userServlet/*")
public class UserServlet extends BaseServlet{
    private UserServiceImpl userService=new UserServiceImpl();
    public void selectLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String s = br.readLine();


        User user = JSON.parseObject(s, User.class);
        System.out.println(user);
        Cookie c1 = new Cookie("userid",user.getUserid());
        response.addCookie(c1);


        User userEnd = userService.selectLogin(user);
        System.out.println(userEnd);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write("success");


    }

    public void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br=request.getReader();
        String s = br.readLine();

        User user = JSON.parseObject(s, User.class);

        System.out.println(user);
        userService.addUser(user);
        response.getWriter().write("success");
    }
    public void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        User user =new User();
        Cookie[] cookies=request.getCookies();
        user.setUserid(CookieUtils.getCookie(cookies,"userid").getValue());
        System.out.println(user.getUserid());
        response.getWriter().write(user.getUserid());
    }

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> userList = userService.selectAll();
        String toJSONString = JSON.toJSONString(userList);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);
    }


}
