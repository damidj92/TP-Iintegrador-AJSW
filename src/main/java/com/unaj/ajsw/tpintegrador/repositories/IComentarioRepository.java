package com.unaj.ajsw.tpintegrador.repositories;

import com.unaj.ajsw.tpintegrador.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Long> {
}
