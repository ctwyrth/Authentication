package com.ctwyrth.authentication.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ctwyrth.authentication.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	// this method retrieves all from the database
	List<User> findAll();
	
	// checking for email unique
	Optional<User> findByEmail(String email);
}
