package org.jh.springboot3demo.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class PersonCreateDto {

    @NotEmpty
    private String name;

    @NotNull
    private String surname1;

    private String surname2;
}
