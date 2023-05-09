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
public class ProductoIdEntity implements Serializable {
    private static final long serialVersionUID = -1649019230174474565L;
    @Column(name = "idProducto", nullable = false)
    private Integer idProducto;

    @Column(name = "Pedido_idPedido", nullable = false)
    private Integer pedidoIdpedido;

    @Column(name = "Pedido_Usuario_idUsuario", nullable = false)
    private Integer pedidoUsuarioIdusuario;

    @Column(name = "Pedido_Mesa_idMesa", nullable = false)
    private Integer pedidoMesaIdmesa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductoIdEntity entity = (ProductoIdEntity) o;
        return Objects.equals(this.pedidoUsuarioIdusuario, entity.pedidoUsuarioIdusuario) &&
                Objects.equals(this.idProducto, entity.idProducto) &&
                Objects.equals(this.pedidoMesaIdmesa, entity.pedidoMesaIdmesa) &&
                Objects.equals(this.pedidoIdpedido, entity.pedidoIdpedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoUsuarioIdusuario, idProducto, pedidoMesaIdmesa, pedidoIdpedido);
    }

}