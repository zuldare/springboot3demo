package org.jh.springboot3demo;

import org.jh.springboot3demo.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException e) {
        ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.ALREADY_REPORTED, e.getMessage());
        detail.setTitle("Entity not found");
        detail.setProperty("Entity", e.getEntityName());
        detail.setProperty("Parameters", e.getParameters());


        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(detail);
    }
}
