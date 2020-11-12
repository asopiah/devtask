package com.alfred_sopia.kcb_mpesa_walet_disbursement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Created on 12:11 AM 12-Nov-2020
 * @Author Alfred Sopia
 */


@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
            (NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNotFoundException(){
    }
}
