package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Administrador;
import com.unaj.ajsw.tpintegrador.repositories.IAdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    private final IAdministradorRepository iAdministradorRepository;

    @Autowired
    public AdministradorService(IAdministradorRepository iAdministradorRepository){
        this.iAdministradorRepository = iAdministradorRepository;
    }

    public Administrador saveAdministrador(Administrador administrador){
        return iAdministradorRepository.save(administrador);
    }
}
