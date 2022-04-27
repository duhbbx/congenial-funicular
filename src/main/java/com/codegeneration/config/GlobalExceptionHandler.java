package com.codegeneration.config;


import com.codegeneration.exception.CommonException;
import com.codegeneration.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    public Result<Object> exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
        log.info("url", httpServletRequest.getRequestURI(), e);
        if (e instanceof CommonException) {
            return new Result<>(false, e.getMessage());
        }

        return new Result<>(false, "系统异常");
    }
}