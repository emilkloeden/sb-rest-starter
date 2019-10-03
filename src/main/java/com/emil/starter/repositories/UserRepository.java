package com.emil.starter.repositories;

import org.springframework.data.repository.CrudRepository;

import com.emil.starter.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
