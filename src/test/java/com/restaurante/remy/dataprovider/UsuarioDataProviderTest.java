package com.restaurante.remy.dataprovider;

import com.restaurante.remy.dataprovider.mysql.UsuarioDataProvider;
import com.restaurante.remy.entity.UsuarioEntity;
import com.restaurante.remy.factory.MockFactory;
import com.restaurante.remy.repository.IUsuarioRepository;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioDataProviderTest {
    @InjectMocks
    private UsuarioDataProvider usuarioDataProvider;
    @Mock
    private IUsuarioRepository iUsuarioRepository;

    @Test
    public void insertarUsuario(){
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

    }

