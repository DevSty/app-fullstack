package com.stavaray.blacklist.infrastructure.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "BlackList")
public class BlackListEntity {

    @Id
    @SequenceGenerator(name = "blacklist_seq", sequenceName = "blacklist_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blacklist_seq")
    @Column(name = "codigo", columnDefinition = "INT")
    private Integer codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "estado", columnDefinition = "TINYINT")
    private Short estado;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATETIME")
    private LocalDateTime createdDate;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATETIME")
    private LocalDateTime modifiedDate;
}
