package com.web.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取路径
        String url=req.getRequestURI();

        req.setCharacterEncoding("utf-8");
        int index=url.lastIndexOf('/');
        String methodName=url.substring(index+1);


        Class<? extends BaseServlet> aClass = this.getClass();

        try {
            Method method = aClass.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
