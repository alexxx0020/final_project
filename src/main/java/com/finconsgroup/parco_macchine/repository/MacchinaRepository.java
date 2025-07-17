package com.finconsgroup.parco_macchine.repository;

import com.finconsgroup.parco_macchine.entity.Macchina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MacchinaRepository extends JpaRepository<Long, Macchina> {
}
