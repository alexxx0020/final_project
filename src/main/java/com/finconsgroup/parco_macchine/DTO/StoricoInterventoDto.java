package com.finconsgroup.parco_macchine.DTO;

import java.time.LocalDate;

public class StoricoInterventoDto {

    private Long id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Integer intervento;

    public StoricoInterventoDto(Long id, LocalDate dataInizio, LocalDate dataFine, Integer intervento) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.intervento = intervento;
    }

    public StoricoInterventoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public Integer getIntervento() {
        return intervento;
    }

    public void setIntervento(Integer intervento) {
        this.intervento = intervento;
    }
}
