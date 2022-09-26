package com.utp.Backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.Backend.entities.Registrousuario;

@Repository
public interface RegistrousuarioRepository extends JpaRepository<Registrousuario, Integer> {

}
