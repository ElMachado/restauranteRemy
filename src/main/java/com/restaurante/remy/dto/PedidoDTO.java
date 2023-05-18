package com.restaurante.remy.dto;

import com.restaurante.remy.entity.MesaEntity;
import com.restaurante.remy.entity.PedidoIdEntity;
import com.restaurante.remy.entity.UsuarioEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.time.Instant;
@Setter
@Getter
@Builder
@Validated
public class PedidoDTO {

    private PedidoIdEntity id;

    private Instant fecha;

    private Double precio;

    private Byte pagado;

    private Byte servido;

    private Byte activo;

    private Byte confirmado;

    private Instant fechaCreacion;

    private Instant fechaModificacion;

    private String usuarioCreacion;

    private String usuarioModificacion;

    private UsuarioEntity usuarioEntityIdusuario1;

    private MesaEntity mesaEntityIdmesa;

}
