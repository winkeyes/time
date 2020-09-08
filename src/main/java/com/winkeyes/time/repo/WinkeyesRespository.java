package com.winkeyes.time.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.winkeyes.time.model.Person;

public interface WinkeyesRespository extends MongoRepository<Person, String>{

}
