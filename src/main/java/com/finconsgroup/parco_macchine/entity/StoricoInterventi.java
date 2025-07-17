package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "storico_interventi")
public class StoricoInterventi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inizio")
    private LocalDate dataInizio;

    @Column(name = "data_fine")
    private LocalDate dataFine;

    @ManyToOne
    @JoinColumn(name = "id_intervento")
    private Intervento intervento;

    public StoricoInterventi(Long id, LocalDate dataInizio, LocalDate dataFine, Intervento intervento) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.intervento = intervento;
    }

    public StoricoInterventi() {
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

    public Intervento getIntervento() {
        return intervento;
    }

    public void setIntervento(Intervento intervento) {
        this.intervento = intervento;
    }
}

