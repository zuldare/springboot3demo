package org.jh.springboot3demo.service;

import lombok.extern.slf4j.Slf4j;
import org.jh.springboot3demo.domain.Person;
import org.jh.springboot3demo.dto.response.PersonResponseDto;
import org.jh.springboot3demo.exception.EntityNotFoundException;
import org.jh.springboot3demo.mapper.PersonMapper;
import org.jh.springboot3demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonResponseDto> getPeople() {
        return personRepository.findAll()
                .stream()
                .map(PersonMapper::toDto)
                .toList();
    }

    private static Supplier<RuntimeException> getCheckedPerson(Integer idPerson) {
        return () -> {
            EntityNotFoundException e = new EntityNotFoundException(Person.class.getSimpleName(), "Person not found", List.of(idPerson + ""));
            log.error("Person with id:{} was not found", idPerson, e);
            throw e;
        };
    }

    @Override
    public PersonResponseDto getPerson(Integer idPerson) {
        return PersonMapper.toDto(personRepository.findById(idPerson).orElseThrow(getCheckedPerson(idPerson)));
    }
}