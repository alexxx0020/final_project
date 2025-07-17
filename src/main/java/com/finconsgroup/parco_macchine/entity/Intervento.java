package com.finconsgroup.parco_macchine.entity;

import com.finconsgroup.parco_macchine.enums.Stato;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "interventi")
public class Intervento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    @OneToMany(mappedBy = "intervento")
    private List<SpecificaIntervento> specificaInterventi;

    @ManyToOne
    @JoinColumn(name = "macchina_id")
    private Macchina macchina;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "intervento")
    private List<StoricoInterventi> storicoInterventi;

    public Intervento(Long id, Stato stato, List<SpecificaIntervento> specificaInterventi, Macchina macchina, User user, List<StoricoInterventi> storicoInterventi) {
        this.id = id;
        this.stato = stato;
        this.specificaInterventi = specificaInterventi;
        this.macchina = macchina;
        this.user = user;
        this.storicoInterventi = storicoInterventi;
    }

    public Intervento() {
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

    public List<SpecificaIntervento> getSpecificaInterventi() {
        return specificaInterventi;
    }

    public void setSpecificaInterventi(List<SpecificaIntervento> specificaInterventi) {
        this.specificaInterventi = specificaInterventi;
    }

    public Macchina getMacchina() {
        return macchina;
    }

    public void setMacchina(Macchina macchina) {
        this.macchina = macchina;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<StoricoInterventi> getStoricoInterventi() {
        return storicoInterventi;
    }

    public void setStoricoInterventi(List<StoricoInterventi> storicoInterventi) {
        this.storicoInterventi = storicoInterventi;
    }
}
