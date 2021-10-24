package com.salesianostriana.dam.ej2.service;

import com.salesianostriana.dam.ej2.model.CursoOnline;
import com.salesianostriana.dam.ej2.repository.CursoOnlineRepository;
import com.salesianostriana.dam.ej2.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoOnlineService extends BaseService<CursoOnline,Long, CursoOnlineRepository> {



    @Override
    public List<CursoOnline> findAll() {

        return this.repositorio.findAllJoin();
    }

}
