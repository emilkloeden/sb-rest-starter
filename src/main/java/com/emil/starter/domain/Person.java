package com.emil.starter.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String referenceNumber;
	private String givens;
	private String middle;
	private String surname;
	@ElementCollection
	@CollectionTable(name="person_previous_names", joinColumns = @JoinColumn(name="person_id"))
	@AttributeOverrides({
		  @AttributeOverride( name = "givens", column = @Column(name = "givens")),
		  @AttributeOverride( name = "surname", column = @Column(name = "surname")),
		})
	private List<PreviousName> previousNames = new ArrayList<>();
	
}
