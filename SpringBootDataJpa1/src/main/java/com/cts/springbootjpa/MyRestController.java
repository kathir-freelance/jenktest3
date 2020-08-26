package com.cts.springbootjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	private IPersonService service;
	
	@RequestMapping("getAll")
	public List<Person> getAll(){
		System.out.println("testing");
		System.out.println("testing-5");
		return service.getAllPersons();
	}
}
