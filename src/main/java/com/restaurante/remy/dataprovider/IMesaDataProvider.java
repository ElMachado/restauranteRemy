package com.restaurante.remy.dataprovider;

import com.restaurante.remy.dto.MesaDTO;
import com.restaurante.remy.entity.MesaEntity;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface IMesaDataProvider {
    MesaEntity saveMesa(MesaEntity entity);
    MesaEntity updateMesa(MesaEntity entity);

    MesaEntity findIdMesa(Integer idMesa);

    void deleteMesaByID(MesaEntity entity);
    List<MesaEntity> findAll();
}
