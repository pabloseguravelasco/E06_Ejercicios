package com.salesianostriana.dam.ej2.service;

import com.salesianostriana.dam.ej2.model.Profesor;
import com.salesianostriana.dam.ej2.repository.ProfesorRepository;
import com.salesianostriana.dam.ej2.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService  extends BaseService<Profesor,Long, ProfesorRepository> {
}
