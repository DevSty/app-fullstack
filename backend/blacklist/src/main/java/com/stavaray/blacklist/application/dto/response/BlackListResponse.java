package com.stavaray.blacklist.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlackListResponse {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String referencia;
    private Short estado;
}
