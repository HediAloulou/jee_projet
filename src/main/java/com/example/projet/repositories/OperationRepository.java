package com.example.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
