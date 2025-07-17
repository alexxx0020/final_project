package com.finconsgroup.parco_macchine.entity;

import com.finconsgroup.parco_macchine.enums.Stato;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "log_macchine")
public class LogMacchina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_tempo")
    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "log_macchina")
    private Macchina macchina;

    public LogMacchina(Long id, LocalDateTime dateTime, Stato stato, Macchina macchina) {
        this.id = id;
        this.dateTime = dateTime;
        this.stato = stato;
        this.macchina = macchina;
    }

    public LogMacchina() {
    }

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

    public Macchina getMacchina() {
        return macchina;
    }

    public void setMacchina(Macchina macchina) {
        this.macchina = macchina;
    }
}
