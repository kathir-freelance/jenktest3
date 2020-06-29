package com.cts.springbootjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IPersonDao  extends JpaRepository<Person, Integer> {

	
}
