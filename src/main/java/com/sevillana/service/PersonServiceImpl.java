package com.sevillana.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevillana.domain.Person;
import com.sevillana.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public Optional<Person> findOne(Integer id) {
		return personRepository.findById(id);
	}

	@Override
	public void save(Person person) {
		personRepository.save(person);
	}

	@Override
	public void delete(Integer id) {
		personRepository.deleteById(id);
	}

}
