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
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    @Column(name = "idcliente", nullable = false)
    private Integer id;

    //TODO [JPA Buddy] generate columns from DB
}