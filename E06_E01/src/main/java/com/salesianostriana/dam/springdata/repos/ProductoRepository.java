package com.salesianostriana.dam.springdata.repos;



import com.salesianostriana.dam.springdata.model.Categoria;
import com.salesianostriana.dam.springdata.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(Categoria categoria);
}
