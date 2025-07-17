package com.finconsgroup.parco_macchine.repository;

import com.finconsgroup.parco_macchine.entity.Intervento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventoRepository extends JpaRepository<Long, Intervento> {
}
