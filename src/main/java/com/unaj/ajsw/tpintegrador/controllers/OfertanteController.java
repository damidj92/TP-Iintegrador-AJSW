package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Ofertante;
import com.unaj.ajsw.tpintegrador.services.OfertanteService;
import com.unaj.ajsw.tpintegrador.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subasta")
public class OfertanteController {

    private final OfertanteService ofertanteService;
    private final UsuarioService usuarioService;

    @Autowired
    public OfertanteController(OfertanteService ofertanteService, UsuarioService usuarioService){
        this.ofertanteService = ofertanteService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/ofertante")
    public Ofertante createOfertante(@Validated @RequestBody Ofertante ofertante){
        return ofertanteService.saveOfertante(ofertante);
    }

    @GetMapping("/ofertante/{id}")
    public Ofertante readOfertante(@PathVariable Integer id){
        return ofertanteService.getOfertanteById(id);
    }

    @PutMapping("/ofertante/{id}")
    public Ofertante updateOfertante(@PathVariable Integer id, @Validated @RequestBody Ofertante ofertante){
        return ofertanteService.saveOfertante(ofertante);
    }

    @DeleteMapping("/ofertante/{id}")
    public void deleteOfertante(@PathVariable Integer id){
        usuarioService.deleteUsuarioById(id);
    }
}
