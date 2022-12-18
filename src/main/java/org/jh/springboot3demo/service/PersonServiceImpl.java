package org.jh.springboot3demo.service;

import org.jh.springboot3demo.dto.PersonDto;
import org.jh.springboot3demo.mapper.PersonMapper;
import org.jh.springboot3demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public List<PersonDto> findPeople() {
        return personRepository.findAll()
                .stream()
                .map(PersonMapper::toDto)
                .toList();
    }
}
