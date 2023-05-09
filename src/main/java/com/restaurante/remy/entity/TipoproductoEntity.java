package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tipoproducto")
public class TipoproductoEntity {
    @Id
    @Column(name = "idtipoProducto", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 45)
    private String nombre;

}