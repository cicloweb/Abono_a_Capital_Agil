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

public class FiltroseguridadData {

    private int id;

    private ClienteData cliente;
    private IniciarsesionData iniciarsesion;
    private int Numero_Credito;
    private String NumeroCedula;
    private Date FechaRegistro;

}
