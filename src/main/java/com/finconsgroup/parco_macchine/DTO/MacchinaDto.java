package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.entity.Intervento;
import com.finconsgroup.parco_macchine.enums.Stato;

import java.util.List;

public class MacchinaDto {

    private Long id;
    private String nome;
    private String descrizione;
    private Stato stato;
    private Integer tipologiaDto;
    private List<ComponenteDto> componentiDtos;
    private List<LogMacchinadto> logMacchineDto;
    private List<Intervento> interventi;

    public MacchinaDto(Long id, String nome, String descrizione, Stato stato, Integer tipologiaDto, List<ComponenteDto> componentiDtos, List<LogMacchinadto> logMacchineDto, List<Intervento> interventi) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.stato = stato;
        this.tipologiaDto = tipologiaDto;
        this.componentiDtos = componentiDtos;
        this.logMacchineDto = logMacchineDto;
        this.interventi = interventi;
    }

    public MacchinaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Integer getTipologiaDto() {
        return tipologiaDto;
    }

    public void setTipologiaDto(Integer tipologiaDto) {
        this.tipologiaDto = tipologiaDto;
    }

    public List<ComponenteDto> getComponentiDtos() {
        return componentiDtos;
    }

    public void setComponentiDtos(List<ComponenteDto> componentiDtos) {
        this.componentiDtos = componentiDtos;
    }

    public List<LogMacchinadto> getLogMacchineDto() {
        return logMacchineDto;
    }

    public void setLogMacchineDto(List<LogMacchinadto> logMacchineDto) {
        this.logMacchineDto = logMacchineDto;
    }

    public List<Intervento> getInterventi() {
        return interventi;
    }

    public void setInterventi(List<Intervento> interventi) {
        this.interventi = interventi;
    }
}
