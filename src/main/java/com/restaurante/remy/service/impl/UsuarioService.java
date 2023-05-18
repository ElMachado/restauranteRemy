package com.restaurante.remy.service.impl;

import com.restaurante.remy.dataprovider.IUsuarioDataProvider;
import com.restaurante.remy.dto.UsuarioDTO;
import com.restaurante.remy.service.IUsuarioService;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class UsuarioService implements IUsuarioService {

    private final IUsuarioDataProvider usuarioDataProvider;
    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }
}
