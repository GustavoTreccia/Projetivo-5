package com.p5.projetivo5.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.p5.projetivo5.domain.User;
import com.p5.projetivo5.repository.UserRepository;

public class Instantiation  implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User fulano = new User(null, "fulano", "fulano@fulanagem.com", "92192919");
		User ciclano = new User(null, "ciclano", "ciclano@fulanagem.com", "92192191");
		User beltrano = new User(null, "beltrano", "beltrano@fulanagem.com", "98129839");
		
		userRepository.saveAll(Arrays.asList(fulano, ciclano, beltrano));
		
	}

}
