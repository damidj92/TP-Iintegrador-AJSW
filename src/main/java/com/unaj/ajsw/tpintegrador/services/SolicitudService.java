package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Solicitud;
import com.unaj.ajsw.tpintegrador.repositories.ISolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudService {

    private final ISolicitudRepository iSolicitudRepository;

    @Autowired
    public SolicitudService(ISolicitudRepository iSolicitudRepository){
        this.iSolicitudRepository = iSolicitudRepository;
    }

    public Solicitud saveSolicitud(Solicitud solicitud){
        return iSolicitudRepository.save(solicitud);
    }

    public Solicitud getSolicitudById(Long id){
        return iSolicitudRepository.findById(id).get();
    }

    public List<Solicitud> getAllSolicitudes(){
        return iSolicitudRepository.findAll();
    }

    public void deleteSolicitudById(Long id){
        iSolicitudRepository.deleteById(id);
    }
}
