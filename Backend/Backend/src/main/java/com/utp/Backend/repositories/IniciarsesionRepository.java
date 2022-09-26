package com.utp.Backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.Backend.entities.Iniciarsesion;

@Repository
public interface IniciarsesionRepository extends JpaRepository<Iniciarsesion, Integer> {

}
