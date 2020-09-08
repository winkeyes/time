package com.winkeyes.time.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkeyes.time.model.Person;
import com.winkeyes.time.service.TimeService;


@RestController
@RequestMapping(value = "/time")
public class MainController {
	
	@Autowired
	public TimeService service;

	@GetMapping(value = { "/today" })
	public ResponseEntity<String> sayHello() {
		String statement = null;
		statement = "Hello!!  Today: "+LocalDate.now()+" "+LocalTime.now();
		return ResponseEntity.ok(statement);
	}
	
	@GetMapping(value = { "/sayhello", "/sayhello/{name}" })
	public ResponseEntity<String> sayHelloAgain(@PathVariable(name = "name",required = false ) String name) {
		String statement = null;
		if (name == null)
			statement = "Hello!!";
		else
			statement = "Hello! " + name+ "...";
		return ResponseEntity.ok(statement);
	}
	
	@GetMapping(value = {"/people"})
	public ResponseEntity<List<Person>> getAllPeople(){
		List<Person> people = service.getAllPeople();
		return ResponseEntity.ok(people);
	}

}
