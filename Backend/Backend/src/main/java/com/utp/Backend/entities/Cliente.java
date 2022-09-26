package com.utp.Backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(nullable = false, unique = true)
    private String NumeroCedula;

    @Column(nullable = false, unique = true)
    private String Nombres;

    @Column(nullable = false, unique = true)
    private String Apellidos;

    private String Username;

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String Contraseña;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false)
    private Date FechaRegistro;
}
