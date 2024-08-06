package com.koushik.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<ExceptionData> getExceptionData(CustomerNotFoundException cnfe)
    {
        ExceptionData exceptionData = new ExceptionData();
        exceptionData.setCode("101");
        exceptionData.setMessage(cnfe.getMessage());
        exceptionData.setDate(LocalDateTime.now());
        return new ResponseEntity<>(exceptionData, HttpStatus.BAD_REQUEST);
    }
}
