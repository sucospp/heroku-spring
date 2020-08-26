package com.springdesarrolladores.springdesarrolladores.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Excepcion {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler() {

        return "error";
    }
}