package com.finconsgroup.parco_macchine.entity;

import com.finconsgroup.parco_macchine.enums.Stato;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "macchine")
public class Macchina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "tipologia_id")
    private Tipologia tipologia;

    @OneToMany(mappedBy = "macchina", orphanRemoval = true)
    private List<Componente> componenti;

    @OneToMany(mappedBy = "macchina")
    private List<LogMacchina> logMacchine;

    @OneToMany(mappedBy = "macchina")
    private List<Intervento> interventi;

    public Macchina(Long id, String nome, String descrizione, Stato stato, Tipologia tipologia, List<Componente> componenti, List<LogMacchina> logMacchine, List<Intervento> interventi) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.stato = stato;
        this.tipologia = tipologia;
        this.componenti = componenti;
        this.logMacchine = logMacchine;
        this.interventi = interventi;
    }

    public Macchina() {
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

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    public List<Componente> getComponenti() {
        return componenti;
    }

    public void setComponenti(List<Componente> componenti) {
        this.componenti = componenti;
    }

    public List<LogMacchina> getLogMacchine() {
        return logMacchine;
    }

    public void setLogMacchine(List<LogMacchina> logMacchine) {
        this.logMacchine = logMacchine;
    }

    public List<Intervento> getInterventi() {
        return interventi;
    }

    public void setInterventi(List<Intervento> interventi) {
        this.interventi = interventi;
    }
}
