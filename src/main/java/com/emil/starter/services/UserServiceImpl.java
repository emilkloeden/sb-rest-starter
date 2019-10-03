package com.emil.starter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.emil.starter.domain.User;
import com.emil.starter.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder encoder;

	public UserServiceImpl(UserRepository userRepository, PasswordEncoder encoder) {
		this.userRepository = userRepository;
		this.encoder = encoder;
	}
	
	@Override
	public void createUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(encoder.encode(password));
		userRepository.save(user);
	}
	
	@Override
	public Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	
}
