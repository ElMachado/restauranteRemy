package com.restaurante.remy.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @Column(name = "idUsuario", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "telefono", length = 45)
    private String telefono;

    @Column(name = "apellido1", nullable = false, length = 45)
    private String apellido1;

    @Column(name = "apellido2", length = 45)
    private String apellido2;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "nick", nullable = false, length = 45)
    private String nick;

    @Column(name = "clave", nullable = false, length = 45)
    private String clave;

    @Column(name = "tipo", nullable = false, length = 45)
    private String tipo;

    @Column(name = "fecha_creacion", nullable = false)
    @CreationTimestamp
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    @UpdateTimestamp
    private Instant fechaModificacion;

    @Column(name = "usuario_creacion", length = 45)
    private String usuarioCreacion;

    @Column(name = "usuario_modificacion", length = 45)
    private String usuarioModificacion;

}