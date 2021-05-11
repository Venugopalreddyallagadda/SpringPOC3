package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.domain.Person;
import com.ojas.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	private PersonService personservice;
	
	@PostMapping("/create")
	public Person createPerson(@RequestBody Person person) {
		return personservice.createPerson(person);
	}
	
	@GetMapping("/person/{id}")
	public Optional<Person> getPersonById(@PathVariable int id) {
		return personservice.getPersonById(id);
	}
	
	@GetMapping("/getAllpersons")
	public List<Person> getAllPersons() {
		return personservice.getAllPersons();
	}
	
	@DeleteMapping("/deletePersonById")
	public void deletePersonById(@PathVariable int id) {
		 personservice.deleteById(id);
	}
	
	@PutMapping("/updatePerson{id}/{firstname}") 
	public Person update(@PathVariable("id") Integer id, @PathVariable("firstName") String firstname) {
		return personservice.update(id, firstname);
	}
}
