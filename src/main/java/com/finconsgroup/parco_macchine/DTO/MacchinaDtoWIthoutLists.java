package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.enums.Stato;

public class MacchinaDtoWIthoutLists {
    private Long id;
    private String nome;
    private String descrizione;
    private Stato stato;
    private Integer tipologiaDto;

    public MacchinaDtoWIthoutLists(Long id, String nome, String descrizione, Stato stato, Integer tipologiaDto) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.stato = stato;
        this.tipologiaDto = tipologiaDto;
    }

    public MacchinaDtoWIthoutLists() {
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
}
