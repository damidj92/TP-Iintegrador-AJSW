package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.models.Comentario;
import com.unaj.ajsw.tpintegrador.repositories.IComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

    private final IComentarioRepository iComentarioRepository;

    @Autowired
    public ComentarioService(IComentarioRepository iComentarioRepository){
        this.iComentarioRepository = iComentarioRepository;
    }

    public Comentario saveComentario (Comentario comentario){
        return iComentarioRepository.save(comentario);
    }

    public Comentario getComentarioById(Long id) {
        return iComentarioRepository.findById(id).get();
    }
}
