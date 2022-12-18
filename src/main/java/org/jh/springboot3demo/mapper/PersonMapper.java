package org.jh.springboot3demo.mapper;

import org.jh.springboot3demo.domain.Person;
import org.jh.springboot3demo.dto.PersonDto;

public class PersonMapper {

    private PersonMapper() {
        throw new IllegalStateException("Utility class");
    }

    public static PersonDto toDto(Person p) {
        return PersonDto
                .builder()
                .id(p.getId())
                .name(p.getName())
                .surname1(p.getSurname1())
                .surname2(p.getSurname2())
                .build();
    }

    public static Person toEntity(PersonDto p) {
        return Person
                .builder()
                .id(p.getId())
                .name(p.getName())
                .surname1(p.getSurname1())
                .surname2(p.getSurname2())
                .build();
    }
}