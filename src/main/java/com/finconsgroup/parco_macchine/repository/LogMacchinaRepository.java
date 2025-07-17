package com.finconsgroup.parco_macchine.repository;

import com.finconsgroup.parco_macchine.entity.LogMacchina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogMacchinaRepository extends JpaRepository<Long, LogMacchina> {
}
