package com.restaurante.remy.service.impl;

import com.restaurante.remy.dataprovider.IMesaDataProvider;
import com.restaurante.remy.dataprovider.mysql.MesaDataProvider;
import com.restaurante.remy.dto.MesaDTO;
import com.restaurante.remy.service.IMesaService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MesaService implements IMesaService {
  private final IMesaDataProvider mesaDataProvider;

  @Override
  public MesaDTO crearMesa(MesaDTO mesaDTO) {
    return null;
  }
}
