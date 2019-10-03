package com.emil.starter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emil.starter.domain.Person;
import com.emil.starter.domain.PreviousName;
import com.emil.starter.services.PersonService;
import com.emil.starter.services.PreviousNameService;

@RestController
@RequestMapping(MainController.BASE_URL)
public class MainController {

	public static final String BASE_URL = "api/v1";

	private final PreviousNameService previousNameService;

	public MainController(PreviousNameService previousNameService) {
		this.previousNameService = previousNameService;
	}

	@GetMapping(path = "previousNames")
	List<PreviousName> getAllPreviousNames() {
		return previousNameService.findAllPreviousNames();
	}

	@GetMapping("previousNames/{id}")
	public Optional<PreviousName> getPreviousNameById(@PathVariable Long id) {
		return previousNameService.findPreviousNameById(id);
	}

}
