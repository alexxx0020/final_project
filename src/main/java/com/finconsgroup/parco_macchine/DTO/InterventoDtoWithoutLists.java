package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.enums.Stato;

public class InterventoDtoWithoutLists {

    private Long id;
    private Stato stato;
    private Integer macchina;
    private Integer user;

    public InterventoDtoWithoutLists(Long id, Stato stato, Integer macchina, Integer user) {
        this.id = id;
        this.stato = stato;
        this.macchina = macchina;
        this.user = user;
    }

    public InterventoDtoWithoutLists() {
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
