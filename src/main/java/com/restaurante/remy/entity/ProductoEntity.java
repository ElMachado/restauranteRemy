package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class ProductoEntity {
    @EmbeddedId
    private ProductoIdEntity id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "Pedido_idPedido1", referencedColumnName = "idPedido", nullable = false),
            @JoinColumn(name = "Pedido_Usuario_idUsuario1", referencedColumnName = "Usuario_idUsuario", nullable = false)
    })
    private PedidoEntity pedidoEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipoProducto_idtipoProducto", nullable = false)
    private TipoproductoEntity tipoproductoEntityIdtipoproducto;

}