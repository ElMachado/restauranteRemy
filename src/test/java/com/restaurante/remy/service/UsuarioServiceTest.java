package com.restaurante.remy.service;

import com.restaurante.remy.dataprovider.mysql.UsuarioDataProvider;
import com.restaurante.remy.dto.UsuarioDTO;
import com.restaurante.remy.factory.MockFactory;
import com.restaurante.remy.service.impl.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServiceTest {
    @InjectMocks
    UsuarioService usuarioService;
    @Mock
    UsuarioDataProvider usuarioDataProvider;
    @Test
    public void guardarUsuario(){
        UsuarioDTO usuarioDTO = MockFactory.getUsuarioDTO();
        Mockito.when(usuarioDataProvider.findUsuarioNombre("pepi")).thenReturn(null);
        Mockito.when(usuarioDataProvider.saveUsuario(MockFactory.getUsuario())).thenReturn(MockFactory.getUsuario());
        UsuarioDTO result = usuarioService.crearUsuario(usuarioDTO);
    }
}
