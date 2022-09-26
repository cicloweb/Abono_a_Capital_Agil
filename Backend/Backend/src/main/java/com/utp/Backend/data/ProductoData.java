package com.utp.Backend.data;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProductoData {

    private int id;
    private ClienteData cliente;
    private FiltroseguridadData filtroseguridad;
    private double Valor_Producto;
    private int Numero_Obligacion;
    private String Descripcion_Producto;
    private Date Fecha_Producto;
    private int Numero_Cuenta;
    private int Numero_Credito;
    private Date FechaRegistro;
    private boolean Enabled;

}
