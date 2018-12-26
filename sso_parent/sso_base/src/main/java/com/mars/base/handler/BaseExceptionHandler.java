package com.mars.base.handler;

import com.mars.domain.eneity.Resault;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Resault exception(Exception exception){
        exception.printStackTrace();
        return new Resault(exception.getMessage(),50000,null);
    }
}
