package com.example.demo.business;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Family;
import com.example.demo.entity.Person;
import com.example.demo.entity.Phone;
import com.example.demo.repository.Repo;

public class Business {

	@Autowired
	private Repo repo;
	
	public void save() {
		
		Family family = new Family();
		Person person = new Person();
		
		Set<Phone> phones = new HashSet<Phone>();
		
		Phone phone1 = new Phone();
		phone1.setType("Samsung");
		
		Phone phone2 = new Phone();
		phone2.setType("Nokia");
		
		Phone phone3 = new Phone();
		phone3.setType("MI");
		
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		
		person.setName("Anurag");
		person.setPhones(phones);
		family.setName("patel");		
		
		repo.save(family);
	}

	public void showStuff() {
		
	}

	
	
}
