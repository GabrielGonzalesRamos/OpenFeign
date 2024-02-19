package com.codigo.msregistro.infraestructure.repository;

import com.codigo.msregistro.infraestructure.entity.PersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    List<PersonaEntity> findByEstado(Integer estado);
    PersonaEntity findByNumDocu(String dni);

}
