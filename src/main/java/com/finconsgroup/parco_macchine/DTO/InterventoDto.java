package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.enums.Stato;

import java.util.List;

public class InterventoDto {

    private Long id;
    private Stato stato;
    private List<SpecificaInterventoDto> specificaInterventiDtos;
    private List<StoricoInterventoDto> storicoInterventi;
    private Integer macchina;
    private Integer user;

    public InterventoDto(Long id, Stato stato, List<SpecificaInterventoDto> specificaInterventiDtos, List<StoricoInterventoDto> storicoInterventi, Integer macchina, Integer user) {
        this.id = id;
        this.stato = stato;
        this.specificaInterventiDtos = specificaInterventiDtos;
        this.storicoInterventi = storicoInterventi;
        this.macchina = macchina;
        this.user = user;
    }

    public InterventoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public List<SpecificaInterventoDto> getSpecificaInterventiDtos() {
        return specificaInterventiDtos;
    }

    public void setSpecificaInterventiDtos(List<SpecificaInterventoDto> specificaInterventiDtos) {
        this.specificaInterventiDtos = specificaInterventiDtos;
    }

    public List<StoricoInterventoDto> getStoricoInterventi() {
        return storicoInterventi;
    }

    public void setStoricoInterventi(List<StoricoInterventoDto> storicoInterventi) {
        this.storicoInterventi = storicoInterventi;
    }

    public Integer getMacchina() {
        return macchina;
    }

    public void setMacchina(Integer macchina) {
        this.macchina = macchina;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}
