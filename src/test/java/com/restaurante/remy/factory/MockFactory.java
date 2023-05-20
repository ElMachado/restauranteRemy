package com.restaurante.remy.factory;

import com.restaurante.remy.dto.UsuarioDTO;
import com.restaurante.remy.entity.MesaEntity;
import com.restaurante.remy.entity.UsuarioEntity;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MockFactory {

  public static UsuarioEntity getUsuario() {

    UsuarioEntity usuarioEntity = new UsuarioEntity();
    usuarioEntity.setId(1212);
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

  public static MesaEntity getMesa2() {
    MesaEntity mesaEntity = new MesaEntity();
    mesaEntity.setId(1);
    mesaEntity.setNumMesas("4");
    mesaEntity.setNumero(2);
    mesaEntity.setLibre((byte) 1);
    mesaEntity.setMaxPersonas(5);
    mesaEntity.setComensales(2);
    mesaEntity.setFechaCreacion(Instant.parse("2022-02-15T18:35:24.00Z"));
    mesaEntity.setFechaModificacion(Instant.parse("2022-02-15T18:35:24.00Z"));
    mesaEntity.setUsuarioModifcacion("jesus");
    mesaEntity.setUsuarioModifcacion("david");
    return mesaEntity;
  }

  public static MesaEntity getMesa() {
    MesaEntity mesaEntity = new MesaEntity();
    mesaEntity.setId(1);
    mesaEntity.setNumMesas("4");
    mesaEntity.setNumero(2);
    mesaEntity.setLibre((byte) 1);
    mesaEntity.setMaxPersonas(5);
    mesaEntity.setComensales(2);
    mesaEntity.setFechaCreacion(Instant.parse("2022-02-15T18:35:24.00Z"));
    mesaEntity.setFechaModificacion(Instant.parse("2022-02-15T18:35:24.00Z"));
    mesaEntity.setUsuarioModifcacion("jesus");
    mesaEntity.setUsuarioModifcacion("david");
    return mesaEntity;
  }

  public static List<UsuarioEntity> getLisUsuario() {
    List<UsuarioEntity> usuarioEntities = new ArrayList<>();
    usuarioEntities.add(getUsuario());
    usuarioEntities.add(getUsuario2());
    return usuarioEntities;
  }

  public static List<MesaEntity> getListMesas() {
    List<MesaEntity> mesaEntityList = new ArrayList<>();
    mesaEntityList.add(getMesa());
    mesaEntityList.add(getMesa2());
    return mesaEntityList;
  }

  public static UsuarioDTO getUsuarioDTO() {
    return UsuarioDTO.builder()
        .activo("s")
        .tipo("gerente")
        .nick("sura")
        .id(1212)
        .clave("clave")
        .email("sura.com.co")
        .build();
  }
}
