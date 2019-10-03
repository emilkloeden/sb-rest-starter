package com.emil.starter.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.emil.starter.domain.Person;
import com.emil.starter.domain.PreviousName;
import com.emil.starter.repositories.PersonRepository;
import com.emil.starter.repositories.PreviousNameRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final PreviousNameRepository previousNameRepository;

	public BootStrapData(PreviousNameRepository previousNameRepository, PersonRepository personRepository) {
		this.previousNameRepository = previousNameRepository;
		this.personRepository = personRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Creating fake previous name data");

		Person a1 = new Person();
		a1.setReferenceNumber("712345678");
		a1.setGivens("John");
		a1.setMiddle("James");
		a1.setSurname("Doe");

		List<PreviousName> ps = new ArrayList<PreviousName>();

		PreviousName previousName1 = new PreviousName();
		previousName1.setGivens("John");
		previousName1.setSurname("Doe");

		PreviousName previousName2 = new PreviousName();
		previousName2.setGivens("Jack");

		ps.add(previousName1);
		ps.add(previousName2);

		a1.setPreviousNames(ps);

		previousNameRepository.save(previousName1);
		previousNameRepository.save(previousName2);
		personRepository.save(a1);

		System.out.println("Saved " + personRepository.count() + " applicants, and " + previousNameRepository.count()
				+ " previous names.");
	}

}
