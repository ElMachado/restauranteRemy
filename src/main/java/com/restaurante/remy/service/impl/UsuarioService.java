package com.restaurante.remy.service.impl;

import com.restaurante.remy.dataprovider.IUsuarioDataProvider;
import com.restaurante.remy.dto.UsuarioDTO;
import com.restaurante.remy.entity.UsuarioEntity;
import com.restaurante.remy.mapping.UsuarioMapping;
import com.restaurante.remy.service.IUsuarioService;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class UsuarioService implements IUsuarioService {
    private final IUsuarioDataProvider usuarioDataProvider;
    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuario = usuarioDataProvider.findUsuarioNombre(usuarioDTO.getNombre());
        if (Objects.isNull(usuario)){
            usuario = usuarioDataProvider.saveUsuario(new UsuarioMapping().usuarioEntityByDTO(usuarioDTO));
            if (Objects.nonNull(usuario)){
                return new UsuarioMapping().usuarioDTO(usuario);
            }
        }
        return null;
    }

    @Override
    public UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuario = usuarioDataProvider.findIdUsuario(usuarioDTO.getId());
        if (Objects.nonNull(usuario)){
            usuario = usuarioDataProvider.updateUsuario(new UsuarioMapping().usuarioEntityByDTO(usuarioDTO));
            if (Objects.nonNull(usuario)){
                return new UsuarioMapping().usuarioDTO(usuario);
            }
        }
        return null;
    }

    @Override
    public UsuarioDTO buscarUsuarioPorID(Integer idUsuario) {
        UsuarioEntity usuario = usuarioDataProvider.findIdUsuario(idUsuario);
        if (Objects.nonNull(usuario)){
            return new UsuarioMapping().usuarioDTO(usuario);
        }
        return null;
    }

    @Override
    public String borrarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuario = new UsuarioMapping().usuarioEntityByDTO(usuarioDTO);
        usuarioDataProvider.deleteID(usuario);
        return null;
    }
}