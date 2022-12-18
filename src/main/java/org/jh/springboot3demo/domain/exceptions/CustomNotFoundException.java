package org.jh.springboot3demo.domain.exceptions;

public class CustomNotFoundException extends RuntimeException {

    public CustomNotFoundException(String message){
        super(message);
    }
}
