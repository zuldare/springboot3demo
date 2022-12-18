package org.jh.springboot3demo.domain;


import org.jh.springboot3demo.domain.exceptions.CustomNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/test")
    public Output response(){
        return new Output(System.nanoTime(), "hola");
    }

    @GetMapping("/error-test")
    public Output responseError(){
        throw new CustomNotFoundException("Entidad pepe");
    }

}


