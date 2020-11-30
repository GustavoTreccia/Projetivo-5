package com.p5.projetivo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projetivo5Application {

	//OBs: NUNCA crie os pacotes fora do pacote original, se o pacote original 
	//for com.demo.example, todos os pacotes como entity ou resources deve 
	//estar dentro do mesmo
	public static void main(String[] args) {
		SpringApplication.run(Projetivo5Application.class, args);
	}

}
