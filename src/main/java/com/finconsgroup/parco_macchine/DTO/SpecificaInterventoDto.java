package com.finconsgroup.parco_macchine.DTO;

public class SpecificaInterventoDto {

    private Long id;

    private String nome;
    private String descrizione;
    private Integer durataOre;
    private Integer intervento;

    public SpecificaInterventoDto(Long id, String nome, String descrizione, Integer durataOre, Integer intervento) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.durataOre = durataOre;
        this.intervento = intervento;
    }

    public SpecificaInterventoDto() {
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

    public Integer getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(Integer durataOre) {
        this.durataOre = durataOre;
    }

    public Integer getIntervento() {
        return intervento;
    }

    public void setIntervento(Integer intervento) {
        this.intervento = intervento;
    }
}
