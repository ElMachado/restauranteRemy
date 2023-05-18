package com.restaurante.remy.repository;

import com.restaurante.remy.entity.MesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IMesaRepository extends JpaRepository<MesaEntity,Integer> {
    @Query("SELECT u FROM u WHERE U.numero = :numero")
    Optional<MesaEntity> findById(Integer id);
}
