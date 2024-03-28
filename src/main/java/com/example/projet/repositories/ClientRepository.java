package com.example.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
