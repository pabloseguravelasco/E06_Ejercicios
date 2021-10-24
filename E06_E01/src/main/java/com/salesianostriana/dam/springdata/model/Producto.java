package com.salesianostriana.dam.springdata.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))

    private Categoria categoria;


    public void addCategoria(Categoria categoria){
        this.categoria = categoria;
        if (categoria.getProductos() == null)
            categoria.setProductos(new ArrayList<>());
        categoria.getProductos().add(this);
    }
    public void removeCategoria(Categoria categoria) {
        categoria.getProductos().remove(this);
        this.categoria = null;
    }
}
