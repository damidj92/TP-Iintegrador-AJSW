package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Trabajo;
import com.unaj.ajsw.tpintegrador.services.TrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subasta")
public class TrabajoController {

    private final TrabajoService trabajoService;

    @Autowired
    public TrabajoController(TrabajoService trabajoService){
        this.trabajoService = trabajoService;
    }

    @PostMapping("/trabajo")
    public Trabajo createTrabajo(@Validated @RequestBody Trabajo trabajo){
        return trabajoService.saveTrabajo(trabajo);
    }

    @GetMapping("/trabajo/{id}")
    public Trabajo readTrabajo(@PathVariable Long id){
        return trabajoService.getTrabajoById(id);
    }

    @GetMapping("/trabajos")
    public List<Trabajo> readAllTrabajos(){
        return trabajoService.getAllTrabajos();
    }

    @PutMapping("/trabajo/{id}")
    public Trabajo updateTrabajo(@PathVariable Long id, @Validated @RequestBody Trabajo trabajo){
        return trabajoService.saveTrabajo(trabajo);
    }

    @DeleteMapping("/trabajo/{id}")
    public void deleteTrabajo(@PathVariable Long id){
        trabajoService.deleteTrabajoById(id);
    }

}
