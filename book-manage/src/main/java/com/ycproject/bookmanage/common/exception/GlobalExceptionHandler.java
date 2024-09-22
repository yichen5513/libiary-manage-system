package com.ycproject.bookmanage.common.exception;/*
 * @author      :  YC
 * @date        :  2024/8/25 16:44
 * @description :  some description
 */

import com.ycproject.bookmanage.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    //全局异常处理，执行的方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<Object> error(Exception e) {
        e.printStackTrace();
        return Result.fail().message(e.getMessage());
    }

    //自定义异常处理
    @ExceptionHandler(CustomDefineException.class)
    @ResponseBody
    public Result<Object> error(CustomDefineException e) {
        e.printStackTrace();
        return Result.fail().code(e.getCode()).message(e.getMessage());
    }
}
