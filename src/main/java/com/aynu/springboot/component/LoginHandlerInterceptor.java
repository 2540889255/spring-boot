package com.aynu.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user=request.getSession().getAttribute("loginuser");
        if (user==null){
            request.setAttribute("msg","没有权限请先登录");
            request.getRequestDispatcher("/index").forward(request,response);
            return false;
        }else{
            return true;
        }

    }
}
