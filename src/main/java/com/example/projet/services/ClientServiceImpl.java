package com.example.projet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.projet.repositories.ClientRepository;

import com.example.projet.entities.Client;
import jakarta.transaction.Transactional;

@Component
@Transactional

public class ClientServiceImpl implements ClientService {
@Autowired
private ClientRepository clientrepo;
public void EnregistrerClient(Client client)
{
	clientrepo.save(client);
}
}
