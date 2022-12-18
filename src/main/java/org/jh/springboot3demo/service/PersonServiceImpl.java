package org.jh.springboot3demo.service;

import org.jh.springboot3demo.domain.Person;
import org.jh.springboot3demo.dto.PersonDto;
import org.jh.springboot3demo.exception.EntityNotFoundException;
import org.jh.springboot3demo.mapper.PersonMapper;
import org.jh.springboot3demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> getPeople() {

        return personRepository.findAll()
                .stream()
                .map(PersonMapper::toDto)
                .toList();
    }

    @Override
    public PersonDto getPerson(Integer idPerson) {
        throw new EntityNotFoundException(Person.class.getSimpleName(), "Entity not found", List.of(idPerson + ""));
    }
}