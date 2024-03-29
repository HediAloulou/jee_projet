package com.example.projet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projet.entities.*;
import com.example.projet.services.*;


@SpringBootApplication
public class ProjetApplication implements CommandLineRunner{

	@Autowired
	ClientService clientservice;
	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Ajout Etudiant
		Client e=new Client();
		clientservice.EnregistrerClient(e);
		
		
		Client client2 = new Client(2L,"aloulou","hedi","hedialoulou90@gmail.com", null);
		clientservice.EnregistrerClient(client2);
		
		Client client3 = new Client(3L,"aloulou","hediiiii","hedialoulou90@gmail.com",null);
		clientservice.EnregistrerClient(client3);

}
}