package com.p5.projetivo5.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.p5.projetivo5.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User fulano = new User("1", "fulano", "fulano@fulanagem.com" , "3218792");
		User ciclano = new User("1", "ciclano", "ciclano@fulanagem.com" , "3218793");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(fulano, ciclano));
		return ResponseEntity.ok().body(list);
	}
}
