package com.restaurante.remy.dataprovider;

import com.restaurante.remy.dataprovider.mysql.MesaDataProvider;
import com.restaurante.remy.dto.MesaDTO;
import com.restaurante.remy.entity.MesaEntity;
import com.restaurante.remy.factory.MockFactory;
import com.restaurante.remy.repository.IMesaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static com.restaurante.remy.factory.MockFactory.getMesa;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MesaDataProviderTest {
    @InjectMocks
    private MesaDataProvider mesaDataProvider;
    @Mock
    private IMesaRepository iMesaRepository;

    @Test
    public void insertarMesa(){
        MesaEntity mesaEntity = new MesaEntity();
        mesaEntity.setId(1);
        mesaEntity.setNumMesas("2");
        mesaEntity.setLibre((byte)1);
        mesaEntity.setComensales(5);
        mesaEntity.setFechaCreacion( Instant.parse("2022-02-15T18:35:24.00Z"));
        mesaEntity.setFechaModificacion(Instant.parse("2022-02-15T18:35:24.00Z"));
        mesaEntity.setMaxPersonas(5);
        mesaEntity.setUsuarioCreacion("jesus");
        mesaEntity.setUsuarioModifcacion("jesus");
        mesaDataProvider.saveMesa(mesaEntity);
        verify(iMesaRepository).saveAndFlush(mesaEntity);
    }
    @Test
    public void actualizarMesa(){
        MesaEntity mesaEntity = new MesaEntity();
        mesaEntity.setNumMesas("3");
        mesaEntity.setLibre((byte)0);
        mesaEntity.setComensales(3);
        mesaEntity.setFechaCreacion( Instant.parse("2022-02-15T18:35:24.00Z"));
        mesaEntity.setFechaModificacion(Instant.parse("2022-02-15T18:35:24.00Z"));
        mesaEntity.setMaxPersonas(6);
        mesaEntity.setUsuarioCreacion("David");
        mesaEntity.setUsuarioModifcacion("David");
        mesaDataProvider.saveMesa(mesaEntity);
        verify(iMesaRepository).saveAndFlush(mesaEntity);
    }
    @Test
    public void buscarMesa(){
        Optional<MesaEntity> mesaEntity = Optional.of(getMesa());

        Mockito.when(iMesaRepository.findById(122)).thenReturn(mesaEntity);
        MesaEntity result = mesaDataProvider.findIdMesa(122);
        assertEquals(mesaEntity.get(),result);
    }

    @Test
    public void eliminarMesa(){
        MesaEntity mesaEntity = new MesaEntity();
        mesaDataProvider.deleteMesaByID(mesaEntity);
        verify(iMesaRepository).delete(mesaEntity);
    }

    @Test
    public void buscarTodas(){
        List<MesaEntity> mesaEntityList = MockFactory.getListMesas();
    }
}