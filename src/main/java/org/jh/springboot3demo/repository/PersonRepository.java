package org.jh.springboot3demo.repository;

import org.jh.springboot3demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
