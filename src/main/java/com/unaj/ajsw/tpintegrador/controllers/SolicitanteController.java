package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Solicitante;
import com.unaj.ajsw.tpintegrador.services.SolicitanteService;
import com.unaj.ajsw.tpintegrador.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subasta")
public class SolicitanteController {

    private final SolicitanteService solicitanteService;
    private final UsuarioService usuarioService;

    @Autowired
    public SolicitanteController(SolicitanteService solicitanteService, UsuarioService usuarioService){
        this.solicitanteService = solicitanteService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/solicitante")
    public Solicitante createSolicitante(@Validated @RequestBody Solicitante solicitante){
        return solicitanteService.saveSolicitante(solicitante);
    }

    @GetMapping("/solicitante/{id}")
    public Solicitante readSolicitante(@PathVariable Integer id) {
        return solicitanteService.getSolicitanteById(id);
    }

    @PutMapping("/solicitante/{id}")
    public Solicitante updateSolicitante(@PathVariable Integer id, @Validated @RequestBody Solicitante solicitante){
        return solicitanteService.saveSolicitante(solicitante);
    }

    @DeleteMapping("/solicitante/{id}")
    public void deleteSolicitante(@PathVariable Integer id){
        usuarioService.deleteUsuarioById(id);
    }
}
