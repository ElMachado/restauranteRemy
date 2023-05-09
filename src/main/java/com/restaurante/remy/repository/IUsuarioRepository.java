package com.restaurante.remy.repository;

import com.restaurante.remy.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {
    UsuarioEntity findByUsuarioNombre(String nombre);

}
