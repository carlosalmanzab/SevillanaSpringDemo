package com.sevillana.repository;

import org.springframework.data.repository.CrudRepository;

import com.sevillana.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
