package com.codigo.msregistro.infraestructure.repository;

import com.codigo.msregistro.infraestructure.entity.TipoPersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {
    TipoPersonaEntity findByCodTipo(@Param("codTipo") String codTipo);
}
