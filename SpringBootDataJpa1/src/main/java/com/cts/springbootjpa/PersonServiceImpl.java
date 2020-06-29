package com.cts.springbootjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao dao;//entity mgr factory
	
	@Override
	public List<Person> getAllPersons() {
	
		return dao.findAll();
				
	}

}
