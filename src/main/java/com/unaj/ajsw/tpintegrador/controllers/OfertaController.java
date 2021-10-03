package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Oferta;
import com.unaj.ajsw.tpintegrador.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subasta")
public class OfertaController {

    private final OfertaService ofertaService;

    @Autowired
    public OfertaController(OfertaService ofertaService){
        this.ofertaService = ofertaService;
    }

    @PostMapping("/oferta")
    public Oferta createOferta(@Validated @RequestBody Oferta oferta){
        return ofertaService.saveOferta(oferta);
    }

    @GetMapping("/oferta/{id}")
    public Oferta readOferta(@PathVariable Long id){
        return ofertaService.getOfertaById(id);
    }

    @PutMapping("/oferta/{id}")
    public Oferta updateOferta(@PathVariable Long id, @Validated @RequestBody Oferta oferta){
        return ofertaService.saveOferta(oferta);
    }

    @DeleteMapping("/oferta/{id}")
    public void deleteOferta(@PathVariable Long id){
        ofertaService.deleteOfertaById(id);
    }
}
