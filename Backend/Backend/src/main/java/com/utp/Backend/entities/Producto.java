package com.utp.Backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

public class Producto {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private Filtroseguridad filtroseguridad;

    @Column(nullable = false)
    private double Valor_Producto;

    @Column(nullable = false, unique = true)
    private int Numero_Obligacion;

    @Column(nullable = false)
    private String Descripcion_Producto;

    @Column(nullable = false)
    private Date Fecha_Producto;

    @Column(nullable = false, unique = true)
    private int Numero_Cuenta;

    @Column(nullable = false, unique = true)
    private int Numero_Credito;

    @Column(nullable = false)
    private double Saldo_Pendiente;

    @Column(nullable = false)
    private boolean Enable;

}
