package com.emil.starter.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.emil.starter.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	Optional<Person> findApplicantByReferenceNumber(String referenceNumber);

}
