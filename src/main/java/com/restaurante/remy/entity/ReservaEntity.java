package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class ReservaEntity {
    @Id
    @Column(name = "idreserva", nullable = false)
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @Column(name = "finalizada", nullable = false)
    private Byte finalizada;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Column(name = "usuario_creacion", nullable = false, length = 45)
    private String usuarioCreacion;

    @Column(name = "usuario_modificacion", length = 45)
    private String usuarioModificacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Mesa_idMesa", nullable = false)
    private MesaEntity mesaEntityIdmesa;

}