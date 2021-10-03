package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Solicitud;
import com.unaj.ajsw.tpintegrador.services.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subasta")
public class SolicitudController {

    private final SolicitudService solicitudService;

    @Autowired
    public SolicitudController(SolicitudService solicitudService){
        this.solicitudService = solicitudService;
    }

    @PostMapping("/solicitud")
    public Solicitud createSolicitud(@Validated @RequestBody Solicitud solicitud){
        return solicitudService.saveSolicitud(solicitud);
    }

    @GetMapping("/solicitud/{id}")
    public Solicitud readSolicitud(@PathVariable Long id){
        return solicitudService.getSolicitudById(id);
    }

    @GetMapping("/solicitudes")
    public List<Solicitud> readAllSolicitudes(){
        return solicitudService.getAllSolicitudes();
    }

    @PutMapping("/solicitud/{id}")
    public Solicitud updateSolicitud(@PathVariable Long id, @Validated @RequestBody Solicitud solicitud){
        return solicitudService.saveSolicitud(solicitud);
    }

    @DeleteMapping("/solicitud/{id}")
    public void deleteSolicitud(@PathVariable Long id){
        solicitudService.deleteSolicitudById(id);
    }

}
