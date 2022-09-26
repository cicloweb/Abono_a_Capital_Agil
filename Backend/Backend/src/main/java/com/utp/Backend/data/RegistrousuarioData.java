package com.utp.Backend.data;

import java.util.List;

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

public class RegistrousuarioData {

    private int id;

    private String NumeroCedula;
    private String Email;
    private String Username;
    private String Contraseña;
    private String Nombres;
    private String Apellidos;

    private List<RoleData> Roles;

    private boolean Enabled;

}
