package com.salesianostriana.dam.springdata.service;

import com.salesianostriana.dam.springdata.model.Categoria;
import com.salesianostriana.dam.springdata.repos.CategoriaRepository;
import com.salesianostriana.dam.springdata.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
