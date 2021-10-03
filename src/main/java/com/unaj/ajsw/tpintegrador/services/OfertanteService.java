package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Ofertante;
import com.unaj.ajsw.tpintegrador.repositories.IOfertanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfertanteService {

    private final IOfertanteRepository iOfertanteRepository;

    @Autowired
    public OfertanteService(IOfertanteRepository iOfertanteRepository){
        this.iOfertanteRepository = iOfertanteRepository;
    }

    public Ofertante saveOfertante(Ofertante ofertante){
        return iOfertanteRepository.save(ofertante);
    }

    public Ofertante getOfertanteById(Integer id){
        return iOfertanteRepository.getById(id);
    }
}
