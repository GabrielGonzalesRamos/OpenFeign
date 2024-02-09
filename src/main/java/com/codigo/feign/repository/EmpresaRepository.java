package com.codigo.feign.repository;

import com.codigo.feign.entity.EmpresaEnitity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEnitity, Long> {
}
