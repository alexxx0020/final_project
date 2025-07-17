package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipologie")
public class Tipologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @OneToMany(mappedBy = "tipologia", orphanRemoval = true)
    private List<Macchina> macchine;

    public Tipologia(Integer id, String nome, List<Macchina> macchine) {
        this.id = id;
        this.nome = nome;
        this.macchine = macchine;
    }

    public Tipologia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Macchina> getMacchine() {
        return macchine;
    }

    public void setMacchine(List<Macchina> macchine) {
        this.macchine = macchine;
    }
}
