package com.utp.Backend.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

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

public class Registrousuario {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(nullable = false, unique = true)
    private String Nombres;

    @Column(nullable = false, unique = true)
    private String Apellidos;

    @Column(nullable = false, unique = true)
    private String Username;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false, unique = true)
    private String NumeroCedula;
    // SEGURISADAD PARA EL PASSWORD Y PARA QUE LO RECIBA NO SOLO TIPO STRING

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String Contraseña;
    // propiedad para saber si se debe cargar una entidad o ya esta los valores
    // definidos con numeracion
    // CREAR TABLA PARA DETERMINAR RELACIONES ManyTomay
    // FetchType es la propiedad que determina como debe ser cargada la entidad

    @ManyToMany(fetch = FetchType.LAZY)
    // MnyTomany trabaja con la columna JoinColumn ella me permite seleccionar las
    // dos columnas
    // mirar cuales son las llaves foraneas que vamos a utilizar y poder ir creando
    // nuestra infrmacion en lka base de datos
    @JoinColumn(nullable = false)
    private List<Role> Roles;
    // Ahora debo verificar los registros

    @Column(nullable = false)
    private Date FechaRegistro;

    //
    @Column(nullable = false)
    private boolean Enabled;

    // chequear el password para el ingreso de cada uno de los usuarios en la base
    // de datos
    // equals: Buscar informacion puntual que para este caso es contraseña
    public boolean checkContraseña(String contraseña) {
        return this.Contraseña.equals(contraseña);

    }
}
