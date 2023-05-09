package com.restaurante.remy.dataprovider.mysql;

import com.restaurante.remy.dataprovider.IUsuarioDataProvider;
import com.restaurante.remy.entity.UsuarioEntity;
import com.restaurante.remy.repository.IUsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioDataProvider implements IUsuarioDataProvider {


    private final IUsuarioRepository iUsuarioRepository;


    @Override
    public UsuarioEntity saveUsuario(UsuarioEntity entity) {
        UsuarioEntity usuarioEntity = iUsuarioRepository.saveAndFlush(entity);
        return usuarioEntity;
    }

    @Override
    public UsuarioEntity updateUsuario(UsuarioEntity entity) {
        UsuarioEntity usuarioEntity = iUsuarioRepository.saveAndFlush(entity);
        return usuarioEntity;
    }

    @Override
    public UsuarioEntity findIDUsuario(Integer idUsuario) {
        Optional <UsuarioEntity> usuarioEntity = iUsuarioRepository.findById(idUsuario);
        return usuarioEntity.get();
    }

    @Override
    public void deleteID(UsuarioEntity entity) {
       iUsuarioRepository.delete(entity);
    }
}