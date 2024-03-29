package com.example.projet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.projet.repositories.ClientRepository;

import com.example.projet.entities.Client;
import jakarta.transaction.Transactional;


@Service
public class ClientServiceImpl implements ClientService {
@Autowired
ClientRepository clientrepo;
public void EnregistrerClient(Client client)
{
	clientrepo.save(client);
	System.out.println("client enregistré");
}
}
