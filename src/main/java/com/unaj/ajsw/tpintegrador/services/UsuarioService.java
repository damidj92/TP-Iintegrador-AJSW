package com.unaj.ajsw.tpintegrador.services;

import com.unaj.ajsw.tpintegrador.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final IUsuarioRepository iUsuarioRepository;

    @Autowired
    public UsuarioService(IUsuarioRepository iUsuarioRepository){
        this.iUsuarioRepository = iUsuarioRepository;
    }

    public void deleteUsuarioById(Integer id){
        iUsuarioRepository.deleteById(id);
    }
}
