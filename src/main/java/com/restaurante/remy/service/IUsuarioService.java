package com.restaurante.remy.service;

import com.restaurante.remy.dto.UsuarioDTO;

public interface IUsuarioService {
    UsuarioDTO crearUsuario (UsuarioDTO usuarioDTO);

    UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO buscarUsuarioPorID(Integer idUsuario);

    String borrarUsuario(UsuarioDTO usuarioDTO);
}
