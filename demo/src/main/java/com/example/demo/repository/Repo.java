package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Family;

@Repository
public interface Repo extends CrudRepository<Family, Integer>{
	
}
