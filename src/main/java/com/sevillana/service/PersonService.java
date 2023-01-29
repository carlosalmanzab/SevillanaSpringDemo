package com.sevillana.service;

import java.util.Optional;

import com.sevillana.domain.Person;

public interface PersonService {
	
	Iterable<Person> findAll();
	
	Optional<Person> findOne(Integer id);
	
	void save(Person person);
	
	void delete(Integer id);
}
