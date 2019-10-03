package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emil.starter.domain.Person;
import com.emil.starter.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;

	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public Optional<Person> findPersonById(Long id) {
		return personRepository.findById(id);
	}
	
	@Override
	public Optional<Person> findPersonByReferenceNumber(String referenceNumber) {
		return personRepository.findApplicantByReferenceNumber(referenceNumber);
	}

	@Override
	public List<Person> findAllPeople() {
		return (List<Person>) personRepository.findAll();
	}
	
	@Override
	public void createPerson(Person person) {
		personRepository.save(person);
	}
	
	
}
