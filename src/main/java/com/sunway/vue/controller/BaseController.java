package com.sunway.vue.controller;

import com.sunway.vue.session.SessionStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: app_vue
 * @Date: 2019/11/9 21:22
 * @Author: Mr.Cheng
 * @Description:
 */
public class BaseController {

    @Autowired
    private SessionStrategy sessionStrategy;

    private ServletRequestAttributes getServletRequestAttributes(){
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }

    protected HttpServletRequest getHttpServletRequest(){
        return getServletRequestAttributes().getRequest();
    }
    protected HttpServletResponse getHttpServletResponse(){
        return getServletRequestAttributes().getResponse();
    }

    protected void setSessionAttribute(String name,Object value) {
        sessionStrategy.setAttribute(getServletRequestAttributes(), name, value);
    }

    protected Object getSessionAttribute(String name){
        return sessionStrategy.getAttribute(getServletRequestAttributes(), name);
    }
}
