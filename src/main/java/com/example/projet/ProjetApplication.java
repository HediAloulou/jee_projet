package com.example.projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projet.services.ClientService;
import com.example.projet.entities.Client;

@SpringBootApplication
public class ProjetApplication {
	@Autowired
	private ClientService clientservice;
	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}
	public void run(String... args) throws Exception {
		Client client1 = new Client(1L,"aloulou","hedi","hedialoulou90@gmail.com");
		clientservice.EnregistrerClient(client1);
		Client client2 = new Client(2L,"aloulou","hedi","hedialoulou90@gmail.com");
		clientservice.EnregistrerClient(client2);
	}
}
