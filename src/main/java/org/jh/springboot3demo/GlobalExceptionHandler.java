package org.jh.springboot3demo;

import org.jh.springboot3demo.domain.exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.URI;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomNotFoundException.class)
    public ResponseEntity<Object> handleCustomNotFoundException(CustomNotFoundException e){
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetail.setInstance(URI.create("/sss/"));
        problemDetail.setTitle("Not found");
        problemDetail.setType(URI.create("about:blank"));
        problemDetail.setProperty("elements", e.getCause());


        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problemDetail);
    }
}
