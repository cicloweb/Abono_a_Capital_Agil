package com.utp.Backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.Backend.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    // EXISTE O NO

    public boolean existsByName(String Nombre);

}
