package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Solicitante;
import com.unaj.ajsw.tpintegrador.repositories.ISolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitanteService {

    private final ISolicitanteRepository iSolicitanteRepository;

    @Autowired
    public SolicitanteService(ISolicitanteRepository iSolicitanteRepository){
        this.iSolicitanteRepository = iSolicitanteRepository;
    }

    public Solicitante saveSolicitante(Solicitante solicitante){
        return iSolicitanteRepository.save(solicitante);
    }

    public Solicitante getSolicitanteById(Integer id){
        return iSolicitanteRepository.findById(id).get();
    }
}
