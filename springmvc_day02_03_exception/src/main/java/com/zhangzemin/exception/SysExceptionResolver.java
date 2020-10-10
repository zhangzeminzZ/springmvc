package com.zhangzemin.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取到异常对象
        SysException exception = null;

        //如果抛出的是系统自定义异常则直接转换
        if(e instanceof SysException){
            exception = (SysException) e;
        }else{
            //如果抛出的不是系统自定义异常则重新构造一个系统错误异常。
            exception = new SysException("系统错误，请与系统管理 员联系！");
        }
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",exception.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
