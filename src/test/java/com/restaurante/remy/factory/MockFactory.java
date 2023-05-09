package com.restaurante.remy.factory;

import com.restaurante.remy.entity.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class MockFactory {


    public static UsuarioEntity getUsuario() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombre("pepito");
        usuarioEntity.setApellido1("Pèrez");
        usuarioEntity.setTelefono("3023423442323");
        usuarioEntity.setEmail("jdarroyo@sura.com.co");
        usuarioEntity.setClave("clave");
        usuarioEntity.setNick("sura");
        usuarioEntity.setTipo("gerente");
        usuarioEntity.setUsuarioCreacion("pepito");
        return usuarioEntity;
    }
    public static UsuarioEntity getUsuario2() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombre("juancho");
        usuarioEntity.setApellido1("Pèrez");
        usuarioEntity.setTelefono("3023423442323");
        usuarioEntity.setEmail("jdarroyo@sura.com.co");
        usuarioEntity.setClave("clave");
        usuarioEntity.setNick("sura");
        usuarioEntity.setTipo("gerente");
        usuarioEntity.setUsuarioCreacion("pepito");
        return usuarioEntity;
    }
    public static List<UsuarioEntity> getLisUsuario(){
        List<UsuarioEntity> usuarioEntities = new ArrayList<>();
        usuarioEntities.add(getUsuario());
        usuarioEntities.add(getUsuario2());
        return usuarioEntities;
    }
}
