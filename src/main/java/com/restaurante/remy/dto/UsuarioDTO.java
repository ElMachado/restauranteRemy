package com.restaurante.remy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
@Setter
@Getter
@Builder
@Validated
public class UsuarioDTO {

    @JsonProperty("id_usuario")

    private Integer id;

    private String nombre;

    private String telefono;

    private String apellido1;

    private String apellido2;

    private String email;

    private String nick;


    private String clave;


    private String tipo;

    private Instant fechaCreacion;


    private Instant fechaModificacion;


    private String usuarioCreacion;


    private String usuarioModificacion;

    private String activo;
}
