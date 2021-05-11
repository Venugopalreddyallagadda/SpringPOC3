package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.Persondao;
import com.ojas.domain.Person;

@Service
public class PersonService {
	
	@Autowired
	private Persondao persondao;
	
	public Person createPerson(Person person) {
		return persondao.save(person);
	}
	
	public Optional<Person> getPersonById(int id) {
		return persondao.findById(id);
	}
	
	public List<Person> getAllPersons() {
		return persondao.findAll();
	}
	
	public void deleteById(int id) {
		persondao.deleteById(id);
	}
	
	
	public Person update(Integer id, String firstname) {
		Person person  = persondao.findById(id).orElse(new Person());
		return persondao.save(person);
	}
	
	

}
