package com.winkeyes.time.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkeyes.time.model.Person;
import com.winkeyes.time.repo.WinkeyesRespository;

@Service
public class TimeService {
	
	@Autowired
	public WinkeyesRespository respository;
	
	public List<Person> getAllPeople(){
		return respository.findAll();
	}

}
