package org.jh.springboot3demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDto {
    private Integer id;
    private String name;
    private String surname1;
    private String surname2;
}
