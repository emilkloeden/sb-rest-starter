package com.emil.starter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emil.starter.domain.Person;
import com.emil.starter.services.PersonService;

@RestController
@RequestMapping(PersonController.ROUTE_URL)
public class PersonController {
	public static final String ROUTE_URL = MainController.BASE_URL + "/people";
	
	private final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("") 
	List<Person> getAllPeople() {
		return personService.findAllPeople();
	}
	
	@GetMapping("search") 
	Optional<Person> getPersonByReferenceNumber(@RequestParam String referenceNumber) {
		return personService.findPersonByReferenceNumber(referenceNumber);
	}
	
	@PostMapping("")
	void createPerson(@RequestBody Person person) {
		personService.createPerson(person);
	}
	
	
}
