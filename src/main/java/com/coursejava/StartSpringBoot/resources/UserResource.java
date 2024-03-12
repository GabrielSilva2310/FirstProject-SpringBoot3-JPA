package com.coursejava.StartSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejava.StartSpringBoot.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u=new User(1L, "Gabriel", "gabriel@gmail.com", "99956566", "123456");
		return ResponseEntity.ok().body(u);
	}

}
