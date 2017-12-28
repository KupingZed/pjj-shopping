package com.iotek.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by 15311 on 2017/12/27.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NullPointerException.class)
    public   String  getError(){
        return "500";
    }

}
