package com.stavaray.blacklist.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlackListUpdateRequest {

    private Integer codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String referencia;
    private String modifiedBy;
}
