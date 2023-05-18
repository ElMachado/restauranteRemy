package com.restaurante.remy.dto;

import com.restaurante.remy.entity.ProductoIdEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
@Setter
@Getter
@Builder
@Validated
public class ProductoDTO {
    private ProductoIdEntity id;

    private String nombre;

    private String descripcion;

    private Double precio;
}
