package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;

import java.util.List;

@Entity
@Table(name = "specifiche_interventi")
public class SpecificaIntervento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descrizione;

    @Column(name = "durata_ore")
    private Integer durataOre;

    @ManyToOne
    @JoinColumn(name = "intervento_id")
    private Intervento intervento;

    public SpecificaIntervento(Long id, String nome, String descrizione, Integer durataOre, Intervento intervento) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.durataOre = durataOre;
        this.intervento = intervento;
    }

    public SpecificaIntervento() {
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

    public Intervento getIntervento() {
        return intervento;
    }

    public void setIntervento(Intervento intervento) {
        this.intervento = intervento;
    }
}
