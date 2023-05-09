package com.restaurante.remy.dataprovider;

import com.restaurante.remy.entity.UsuarioEntity;

import java.util.List;

public interface IUsuarioDataProvider  {
    UsuarioEntity saveUsuario(UsuarioEntity entity);
    UsuarioEntity updateUsuario(UsuarioEntity entity);
       UsuarioEntity findIdUsuario(Integer idUsuario);

    void deleteID(UsuarioEntity entity);

    List<UsuarioEntity> findAll();

}
