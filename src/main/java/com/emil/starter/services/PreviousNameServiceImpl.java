package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emil.starter.domain.PreviousName;
import com.emil.starter.repositories.PreviousNameRepository;

@Service
public class PreviousNameServiceImpl implements PreviousNameService {

	private final PreviousNameRepository previousNameRepository;

	public PreviousNameServiceImpl(PreviousNameRepository previousNameRepository) {
		this.previousNameRepository = previousNameRepository;
	}

	@Override
	public Optional<PreviousName> findPreviousNameById(Long id) {
		return previousNameRepository.findById(id);
	}

	@Override
	public List<PreviousName> findAllPreviousNames() {
		return (List<PreviousName>) previousNameRepository.findAll();
	}

}
