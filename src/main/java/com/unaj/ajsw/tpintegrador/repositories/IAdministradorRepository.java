package com.unaj.ajsw.tpintegrador.repositories;

import com.unaj.ajsw.tpintegrador.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorRepository extends JpaRepository<Administrador, Integer> {
}
