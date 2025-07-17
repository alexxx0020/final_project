package com.finconsgroup.parco_macchine.repository;

import com.finconsgroup.parco_macchine.entity.Componente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponenteRepository extends JpaRepository<Long, Componente> {
}
