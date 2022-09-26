package com.utp.Backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

public class Iniciarsesion {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private Registrousuario registrousuario;

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String Contraseña;

    @Column(nullable = false, unique = true)
    private String Username;

    public boolean checkContraseña(String contraseña) {
        return this.Contraseña.equals(contraseña);

    }

    @Column(nullable = false)
    private boolean Enable;

}
