package com.demoapp.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControllor {
	
		
	@GetMapping("/")
	public String getpathVariable(){
		return "Welcome to spring boot application";
	}
	
	@GetMapping("/user/{id}/{name}")
	public String getPathVariable(@PathVariable(name="name") String name ,@PathVariable(name="id") long id ){
		return "this is my dynamic value ="+id+" Name :"+name;
	}
	
}

