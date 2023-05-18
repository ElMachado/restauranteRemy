package com.restaurante.remy.mapping;

import com.restaurante.remy.dto.MesaDTO;
import com.restaurante.remy.entity.MesaEntity;

public class MesaMapping {
  MesaEntity mesaEntityByDTO(MesaDTO mesaDTO) {
    return MesaEntity.builder()
        .id(mesaDTO.getId())
        .numMesas(mesaDTO.getNumMesas())
        .libre(mesaDTO.getLibre())
        .numero(mesaDTO.getNumero())
        .comensales(mesaDTO.getComensales())
        .maxPersonas(mesaDTO.getMaxPersonas())
        .fechaModificacion(mesaDTO.getFechaModificacion())
        .fechaCreacion(mesaDTO.getFechaCreacion())
        .usuarioModifcacion(mesaDTO.getUsuarioModifcacion())
        .usuarioCreacion(mesaDTO.getUsuarioCreacion())
        .build();
  }

  MesaDTO mesaDTO(MesaEntity mesaEntity) {
  return   MesaDTO.builder()
        .id(mesaEntity.getId())
        .numero(mesaEntity.getNumero())
        .numMesas(mesaEntity.getNumMesas())
        .libre(mesaEntity.getLibre())
        .maxPersonas(mesaEntity.getMaxPersonas())
        .comensales(mesaEntity.getComensales())
        .usuarioCreacion(mesaEntity.getUsuarioCreacion())
        .usuarioModifcacion(mesaEntity.getUsuarioModifcacion())
        .fechaCreacion(mesaEntity.getFechaCreacion())
        .fechaModificacion(mesaEntity.getFechaModificacion())
        .build();
  }
}
