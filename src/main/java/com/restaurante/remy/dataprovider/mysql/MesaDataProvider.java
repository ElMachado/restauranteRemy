package com.restaurante.remy.dataprovider.mysql;

import com.restaurante.remy.dataprovider.IMesaDataProvider;
import com.restaurante.remy.entity.MesaEntity;
import com.restaurante.remy.repository.IMesaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MesaDataProvider implements IMesaDataProvider {
    private  final  IMesaRepository iMesaRepository;
    @Override
    public MesaEntity saveMesa(MesaEntity entity) {
        MesaEntity mesaEntity = iMesaRepository.saveAndFlush(entity);
        return mesaEntity;
    }

    @Override
    public MesaEntity updateMesa(MesaEntity entity) {
        MesaEntity mesaEntity = iMesaRepository.saveAndFlush(entity);
        return null;
    }

   @Override
    public MesaEntity findIdMesa(Integer idMesa) {
        Optional<MesaEntity> mesaEntity = iMesaRepository.findById(idMesa);
        return mesaEntity.get();
    }

    @Override
    public void deleteMesaByID(MesaEntity entity) {
        iMesaRepository.delete(entity);
    }

    @Override
    public List<MesaEntity> findAll() {
        List<MesaEntity> entities = iMesaRepository.findAll();
        return entities;
    }
}
