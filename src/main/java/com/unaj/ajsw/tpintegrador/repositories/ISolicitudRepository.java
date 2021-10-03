package com.unaj.ajsw.tpintegrador.repositories;

import com.unaj.ajsw.tpintegrador.models.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Long> {
}
