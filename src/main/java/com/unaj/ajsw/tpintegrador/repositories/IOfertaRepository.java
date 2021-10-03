package com.unaj.ajsw.tpintegrador.repositories;

import com.unaj.ajsw.tpintegrador.models.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOfertaRepository extends JpaRepository<Oferta, Long> {
}
