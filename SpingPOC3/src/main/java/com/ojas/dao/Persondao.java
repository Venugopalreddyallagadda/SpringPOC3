package com.ojas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ojas.domain.Person;

@Repository
public interface Persondao extends MongoRepository<Person, Integer>{

}
