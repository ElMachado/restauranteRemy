package com.restaurante.remy.repository;

import com.restaurante.remy.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {

    @Query("SELECT u FROM u WHERE u.nombre = :nombre")
    UsuarioEntity findByUsuarioNombre(String nombre);

}
