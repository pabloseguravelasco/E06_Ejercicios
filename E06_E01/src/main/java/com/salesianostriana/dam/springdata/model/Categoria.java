package com.salesianostriana.dam.springdata.model;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria  {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;



    @OneToMany(mappedBy = "categoria")

    private List<Producto> productos = new ArrayList<>();
}
