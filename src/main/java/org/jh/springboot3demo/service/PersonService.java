package org.jh.springboot3demo.service;

import org.jh.springboot3demo.dto.PersonDto;

import java.util.List;

public interface PersonService {

    List<PersonDto> findPeople();
}
