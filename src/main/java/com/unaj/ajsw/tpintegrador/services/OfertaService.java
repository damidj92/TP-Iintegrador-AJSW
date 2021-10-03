package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Oferta;
import com.unaj.ajsw.tpintegrador.repositories.IOfertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaService {

    private final IOfertaRepository iOfertaRepository;

    @Autowired
    public OfertaService(IOfertaRepository iOfertaRepository){
        this.iOfertaRepository = iOfertaRepository;
    }

    public Oferta saveOferta(Oferta oferta){
        return iOfertaRepository.save(oferta);
    }

    public Oferta getOfertaById(Long id){
        return iOfertaRepository.findById(id).get();
    }

    public void deleteOfertaById(Long id){
        iOfertaRepository.deleteById(id);
    }
}
