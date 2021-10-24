package com.salesianostriana.dam.springdata.service;


import com.salesianostriana.dam.springdata.model.Producto;
import com.salesianostriana.dam.springdata.repos.ProductoRepository;
import com.salesianostriana.dam.springdata.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService  extends BaseService<Producto, Long, ProductoRepository> {
}
