package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @EmbeddedId
    private PedidoIdEntity id;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "pagado", nullable = false)
    private Byte pagado;

    @Column(name = "servido", nullable = false)
    private Byte servido;

    @Column(name = "activo", nullable = false)
    private Byte activo;

    @Column(name = "confirmado", nullable = false)
    private Byte confirmado;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Column(name = "usuario_creacion", nullable = false, length = 45)
    private String usuarioCreacion;

    @Column(name = "usuario_modificacion", length = 45)
    private String usuarioModificacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Usuario_idUsuario1", nullable = false)
    private UsuarioEntity usuarioEntityIdusuario1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Mesa_idMesa", nullable = false)
    private MesaEntity mesaEntityIdmesa;

}