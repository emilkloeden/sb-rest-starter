package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import com.emil.starter.domain.Person;

public interface PersonService {
	Optional<Person> findPersonById(Long id);
	Optional<Person> findPersonByReferenceNumber(String referenceNumber);
	List<Person> findAllPeople();
	void createPerson(Person person);
}
