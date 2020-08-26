package com.cts.springbootjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IPersonService{

	List<Person> getAllPersons();
//https://github.com/kathir-freelance/jenktest3

	
	
}
