package com.restaurante.remy.mapping;

import com.restaurante.remy.dto.UsuarioDTO;
import com.restaurante.remy.entity.UsuarioEntity;

public class UsuarioMapping {
   public UsuarioEntity usuarioEntityByDTO(UsuarioDTO usuarioDTO) {
    return UsuarioEntity.builder()
        .id(usuarioDTO.getId())
        .nick(usuarioDTO.getNick())
        .clave(usuarioDTO.getClave())
        .tipo(usuarioDTO.getTipo())
        .email(usuarioDTO.getEmail())
        .apellido1(usuarioDTO.getApellido1())
        .apellido2(usuarioDTO.getApellido2())
        .telefono(usuarioDTO.getTelefono())
        .activo(usuarioDTO.getActivo())
        .build();
    }
    public UsuarioDTO usuarioDTO (UsuarioEntity usuarioEntity){
    return UsuarioDTO.builder()
            .id(usuarioEntity.getId())
            .nombre(usuarioEntity.getNombre())
            .apellido1(usuarioEntity.getApellido1())
            .apellido2(usuarioEntity.getApellido2())
            .clave(usuarioEntity.getClave())
            .nick(usuarioEntity.getNick())
            .email(usuarioEntity.getEmail())
            .telefono(usuarioEntity.getTelefono())
            .tipo(usuarioEntity.getTipo())
            .build();
    }

}
