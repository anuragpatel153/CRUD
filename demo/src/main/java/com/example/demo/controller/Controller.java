package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.Business;

@RestController
@RequestMapping("/app")
public class Controller {

	private Business business;
	
	@GetMapping(value="/saveStuff")
	public void saveStuf(){
		business.save();
	}
	
	@GetMapping(value="/showstuff")
	public void showStuff(){
		business.showStuff();
	}
	
}
