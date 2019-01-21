package com.lxy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 错误异常的控制类
 */
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(UserNotFoundException.class)
    public String handlerError(){
        System.out.println("error handler");
        return "forward:/error";
    }
}
