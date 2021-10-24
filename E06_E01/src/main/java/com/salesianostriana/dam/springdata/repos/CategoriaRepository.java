package com.salesianostriana.dam.springdata.repos;


import com.salesianostriana.dam.springdata.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
