package org.jh.springboot3demo.service;

import org.jh.springboot3demo.dto.response.PersonResponseDto;

import java.util.List;

public interface PersonService {

    List<PersonResponseDto> getPeople();

    PersonResponseDto getPerson(Integer idPerson);
}
