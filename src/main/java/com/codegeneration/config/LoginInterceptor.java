package com.codegeneration.config;

import com.alibaba.fastjson.JSON;
import com.codegeneration.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 实现HandlerInterceptor接口，自定义拦截器
 *
 * @author Administrator
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 实现前置方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        // if (request.getSession().getAttribute("loginUser") != null) {
        //     return true;
        // }
        // response.setCharacterEncoding("UTF-8");
        // response.setStatus(HttpServletResponse.SC_OK);
        // response.setContentType("application/json;charset=UTF-8");
        // Result<Object> result = new Result<>(false, "您尚未登录!");
        // result.setCode(403);
        //
        // try (PrintWriter writer = response.getWriter()) {
        //     writer.write(JSON.toJSONString(result));
        //     writer.flush();
        // } catch (IOException ex) {
        //     log.error(ex.getMessage());
        // }
        //
        // return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //这个方法可以往request中添加一些公共的工具类给前端页面进行调用
    }


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //当请求处理完成调用
    }
}