package com.utp.Backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.Backend.entities.Filtroseguridad;

@Repository
public interface FiltroseguridadRepository extends JpaRepository<Filtroseguridad, Integer> {

}
