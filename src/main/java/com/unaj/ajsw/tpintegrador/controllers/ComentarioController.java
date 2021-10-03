package com.unaj.ajsw.tpintegrador.controllers;

import com.unaj.ajsw.tpintegrador.models.Comentario;
import com.unaj.ajsw.tpintegrador.services.ComentarioService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subasta")
public class ComentarioController {

    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService){
        this.comentarioService = comentarioService;
    }

    @PostMapping("/comentario")
    public Comentario createComentario(@Validated @RequestBody Comentario comentario){
        return comentarioService.saveComentario(comentario);
    }

    @GetMapping("/comentario/{id}")
    public Comentario readComentario(@PathVariable Long id){
        return comentarioService.getComentarioById(id);
    }
}
