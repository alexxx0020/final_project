package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.enums.Stato;

import java.time.LocalDateTime;

public class LogMacchinadto {

    private Long id;
    private LocalDateTime dateTime;
    private Stato stato;
    private Integer macchina;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Integer getMacchina() {
        return macchina;
    }

    public void setMacchina(Integer macchina) {
        this.macchina = macchina;
    }

    public LogMacchinadto(Long id, LocalDateTime dateTime, Stato stato, Integer macchina) {
        this.id = id;
        this.dateTime = dateTime;
        this.stato = stato;
        this.macchina = macchina;
    }

    public LogMacchinadto() {
    }
}
