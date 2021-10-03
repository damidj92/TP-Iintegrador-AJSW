package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Administrador;
import com.unaj.ajsw.tpintegrador.services.AdministradorService;
import com.unaj.ajsw.tpintegrador.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subasta")
public class AdministradorController {

    private final AdministradorService administradorService;
    private final UsuarioService usuarioService;

    @Autowired
    public AdministradorController(AdministradorService administradorService, UsuarioService usuarioService){
        this.administradorService = administradorService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/administrador")
    public Administrador createAdministrador(@Validated @RequestBody Administrador administrador){
        return administradorService.saveAdministrador(administrador);
    }

    @GetMapping("/administrador/{id}")
    public Administrador readAdministrador(@PathVariable Integer id){
        return administradorService.getAdministradorById(id);
    }

    @PutMapping("/administrador/{id}")
    public Administrador updateAdministrador(@PathVariable Integer id, @Validated @RequestBody Administrador administrador){
        return administradorService.saveAdministrador(administrador);
    }

    @DeleteMapping("/administrador/{id}")
    public void deleteAdministrador(@PathVariable Integer id){
        usuarioService.deleteUsuarioById(id);
    }
}
