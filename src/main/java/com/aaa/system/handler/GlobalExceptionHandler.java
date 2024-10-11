package com.aaa.system.handler;

import com.aaa.common.result.Result;
import com.aaa.system.exception.AAAException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    //1.全局异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return Result.fail().message("执行了全局异常处理");
    }

    //2.特定异常处理
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error( ArithmeticException e){
        return Result.fail().message("执行了特定异常处理");
    }

    //3.自定义异常处理
    @ExceptionHandler(AAAException.class)
    @ResponseBody
    public Result error( AAAException e){
        return Result.fail().code(e.getCode()).message(e.getMsg());
    }

}
