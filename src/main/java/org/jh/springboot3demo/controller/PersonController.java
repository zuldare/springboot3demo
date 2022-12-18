package org.jh.springboot3demo.controller;

import org.jh.springboot3demo.dto.PersonDto;
import org.jh.springboot3demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<PersonDto> getPeople() {
        return personService.getPeople();
    }

    @GetMapping("/people/{idPerson}")
    public PersonDto getPerson(@PathVariable("idPerson") Integer idPerson) {
        return personService.getPerson(idPerson);
    }
}