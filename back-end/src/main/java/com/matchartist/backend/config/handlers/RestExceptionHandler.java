package com.matchartist.backend.config.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ExceptionDetails> handleBadRequestException(ValidationException validationException){
        return new ResponseEntity<>(new ExceptionDetails(validationException.getMsg(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }
}
