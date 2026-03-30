package com.example.spring_logistics_integrator.infra;

import com.example.spring_logistics_integrator.exceptions.CepNotFoundException;
import com.example.spring_logistics_integrator.exceptions.InvalidCepException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(InvalidCepException.class)
    private ResponseEntity<Object> handleInvalidCepException(InvalidCepException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

    @ExceptionHandler(CepNotFoundException.class)
    private ResponseEntity<Object> handleCepNotFoundException(CepNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}