package com.restaurante.remy.dataprovider;

import com.restaurante.remy.dataprovider.mysql.UsuarioDataProvider;
import com.restaurante.remy.entity.UsuarioEntity;
import com.restaurante.remy.factory.MockFactory;
import com.restaurante.remy.repository.IUsuarioRepository;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.restaurante.remy.factory.MockFactory.getUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioDataProviderTest {
    @InjectMocks
    private UsuarioDataProvider usuarioDataProvider;
    @Mock
    private IUsuarioRepository iUsuarioRepository;

    @Test
    public void insertarUsuario() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombre("pepito");
        usuarioEntity.setApellido1("Pèrez");
        usuarioEntity.setTelefono("3023423442323");
        usuarioEntity.setEmail("jdarroyo@sura.com.co");
        usuarioEntity.setClave("clave");
        usuarioEntity.setNick("sura");
        usuarioEntity.setTipo("gerente");
        usuarioEntity.setUsuarioCreacion("pepito");
        usuarioDataProvider.saveUsuario(usuarioEntity);
        verify(iUsuarioRepository).saveAndFlush(usuarioEntity);
    }

    @Test
    public void actualizarUsuario() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombre("pepito");
        usuarioEntity.setApellido1("Pèrez");
        usuarioEntity.setTelefono("3023423442323");
        usuarioEntity.setEmail("jdarroyo@sura.com.co");
        usuarioEntity.setClave("clave");
        usuarioEntity.setNick("sura");
        usuarioEntity.setTipo("gerente");
        usuarioEntity.setUsuarioCreacion("pepito");
        usuarioDataProvider.saveUsuario(usuarioEntity);
        verify(iUsuarioRepository).saveAndFlush(usuarioEntity);
    }

    @Test
    public void buscarUsuario(){
        Optional <UsuarioEntity> usuarioEntity = Optional.of(getUsuario());
        Mockito.when(iUsuarioRepository.findById(1212)).thenReturn(usuarioEntity);
        UsuarioEntity result = usuarioDataProvider.findIdUsuario(1212);
        assertEquals(usuarioEntity.get(),result);
        }

        @Test
    public void eliminarUsuario(){
            UsuarioEntity usuarioEntity = new UsuarioEntity();
            usuarioEntity.setNombre("pepito");
            usuarioEntity.setApellido1("Pèrez");
            usuarioEntity.setTelefono("3023423442323");
            usuarioEntity.setEmail("jdarroyo@sura.com.co");
            usuarioEntity.setClave("clave");
            usuarioEntity.setNick("sura");
            usuarioEntity.setTipo("gerente");
            usuarioEntity.setUsuarioCreacion("pepito");
            usuarioDataProvider.deleteID(usuarioEntity);
            verify(iUsuarioRepository).delete(usuarioEntity);
        }


        @Test
        public void buscarTodos(){
            List<UsuarioEntity> usuarioEntityList = MockFactory.getLisUsuario();
            Mockito.when(iUsuarioRepository.findAll()).thenReturn(usuarioEntityList);
            List<UsuarioEntity> result = usuarioDataProvider.findAll();
            Assertions.assertEquals(usuarioEntityList,result);
        }
        @Test
    public void buscarNombre(){
        UsuarioEntity usuarioEntity = MockFactory.getUsuario();
        Mockito.when(iUsuarioRepository.findByUsuarioNombre("pepito")).thenReturn(usuarioEntity);
        UsuarioEntity result = usuarioDataProvider.findIdUsuarioNombre("pepito");
        Assertions.assertEquals(usuarioEntity,result);
        }
}

