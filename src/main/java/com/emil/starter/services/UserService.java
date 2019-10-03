package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import com.emil.starter.domain.User;

public interface UserService {
	Optional<User> findUserById(Long id);
	List<User> findAllUsers();
	void createUser(String username, String password);
}
