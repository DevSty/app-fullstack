package com.stavaray.blacklist.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlackList {

    private Integer codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String referencia;
    private Short estado;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;

}
