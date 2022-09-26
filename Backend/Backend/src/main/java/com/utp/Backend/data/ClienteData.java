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

public class ClienteData {

    private int id;
    private String NumeroCedula;
    private int Numero_Credito;
    private String Nombres;
    private String Apellidos;
    private String Username;
    private String Contraseña;
    private String Email;
    private Date FechaRegistro;

}
