package com.restaurante.remy.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Id;
@Setter
@Getter
@Builder
@Validated
public class TipoProductoDTO {
    private Integer id;

    private String nombre;
}
