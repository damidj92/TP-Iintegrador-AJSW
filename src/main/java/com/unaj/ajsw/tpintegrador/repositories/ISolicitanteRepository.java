package com.unaj.ajsw.tpintegrador.repositories;

import com.unaj.ajsw.tpintegrador.models.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitanteRepository extends JpaRepository<Solicitante, Integer> {
}
