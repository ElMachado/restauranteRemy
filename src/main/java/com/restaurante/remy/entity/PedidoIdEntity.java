package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PedidoIdEntity implements Serializable {
    private static final long serialVersionUID = -200539937465822019L;
    @Column(name = "idPedido", nullable = false)
    private Integer idPedido;

    @Column(name = "Usuario_idUsuario", nullable = false)
    private Integer usuarioIdusuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PedidoIdEntity entity = (PedidoIdEntity) o;
        return Objects.equals(this.usuarioIdusuario, entity.usuarioIdusuario) &&
                Objects.equals(this.idPedido, entity.idPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioIdusuario, idPedido);
    }

}