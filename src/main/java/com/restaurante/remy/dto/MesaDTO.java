package com.restaurante.remy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.time.Instant;
@Setter
@Getter
@Builder
@Validated
public class MesaDTO {
    @JsonProperty("id_mesa")
    private Integer id;
    private Integer numero;
    private Byte libre;
    private Integer maxPersonas;
    private Integer comensales;
    private String numMesas;
    private Instant fechaCreacion;
    private Instant fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModifcacion;
}
