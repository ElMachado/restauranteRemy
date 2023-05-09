package com.restaurante.remy.dataprovider;

import com.restaurante.remy.entity.UsuarioEntity;

public interface IUsuarioDataProvider  {
    UsuarioEntity saveUsuario(UsuarioEntity entity);
    UsuarioEntity updateUsuario(UsuarioEntity entity);
    UsuarioEntity findIDUsuario(Integer idUsuario);
    void deleteID(UsuarioEntity entity);

}
