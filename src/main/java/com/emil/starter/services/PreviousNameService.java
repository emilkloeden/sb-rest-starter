package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import com.emil.starter.domain.PreviousName;

public interface PreviousNameService {
	Optional<PreviousName> findPreviousNameById(Long id);

	List<PreviousName> findAllPreviousNames();
}
