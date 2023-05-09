package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "mesa")
public class MesaEntity {
    @Id
    @Column(name = "idMesa", nullable = false)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "libre", nullable = false)
    private Byte libre;

    @Column(name = "max_personas", nullable = false)
    private Integer maxPersonas;

    @Column(name = "comensales")
    private Integer comensales;

    @Column(name = "num_mesas", length = 45)
    private String numMesas;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = false)
    private Instant fechaModificacion;

    @Column(name = "usuario_creacion", nullable = false, length = 45)
    private String usuarioCreacion;

    @Column(name = "usuario_modifcacion", length = 45)
    private String usuarioModifcacion;

}