package com.lukas.webapp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lukas.webapp.api.User;

@RestController
public class UserController {
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public User getUser(@RequestParam(value="name", defaultValue="Lukas") String name, 
						@RequestParam(value="surname", defaultValue="Pro") String surname, 
						@RequestParam(value="age", defaultValue="77") int age) {
		return User.builder().name(name).surname(surname).age(age).build();
	}
	
	@RequestMapping("/witam")
	public String getWitam() {
		return "Witam";
	}
}
