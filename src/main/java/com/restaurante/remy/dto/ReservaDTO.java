package com.restaurante.remy.dto;

import com.restaurante.remy.entity.MesaEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.time.Instant;
@Setter
@Getter
@Builder
@Validated
public class ReservaDTO {
    private Integer id;
    private Instant fecha;
    private Byte finalizada;
    private Instant fechaCreacion;
    private Instant fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private MesaEntity mesaEntityIdmesa;
}
