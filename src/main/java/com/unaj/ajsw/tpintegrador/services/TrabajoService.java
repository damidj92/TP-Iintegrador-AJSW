package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Trabajo;
import com.unaj.ajsw.tpintegrador.repositories.ITrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajoService {

    private final ITrabajoRepository iTrabajoRepository;

    @Autowired
    public TrabajoService(ITrabajoRepository iTrabajoRepository){
        this.iTrabajoRepository = iTrabajoRepository;
    }

    public Trabajo saveTrabajo(Trabajo trabajo){
        return iTrabajoRepository.save(trabajo);
    }

    public Trabajo getTrabajoById(Long id){
        return iTrabajoRepository.getById(id);
    }

    public List<Trabajo> getAllTrabajos(){
        return iTrabajoRepository.findAll();
    }

    public void deleteTrabajoById(Long id){
        iTrabajoRepository.deleteById(id);
    }
}
