package com.p5.projetivo5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.p5.projetivo5.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
