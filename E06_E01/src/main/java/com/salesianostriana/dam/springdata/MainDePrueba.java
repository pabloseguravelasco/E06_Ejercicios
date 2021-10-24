package com.salesianostriana.dam.springdata;

import com.salesianostriana.dam.springdata.model.Categoria;
import com.salesianostriana.dam.springdata.model.Producto;
import com.salesianostriana.dam.springdata.service.CategoriaService;
import com.salesianostriana.dam.springdata.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {


    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @PostConstruct
    public void test() {

        Categoria categoria = Categoria.builder()
                .nombre("Carnes")
                .build();

        categoriaService.save(categoria);

        Producto producto = Producto.builder()
                .nombre("Pechuga de pollo")
                .pvp(10)
                .build();

        productoService.save(producto);
        producto.addCategoria(categoria);


        System.out.println("Categoria: " +categoria.getNombre());
        System.out.println("Producto: " +producto.getNombre());


    }

}
