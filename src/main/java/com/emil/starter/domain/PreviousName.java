package com.emil.starter.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Embeddable
@Data
public class PreviousName {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String givens;
	private String surname;
}
