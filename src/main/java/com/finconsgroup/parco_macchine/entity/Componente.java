package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "componenti")
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "macchina_id")
    private Macchina macchina;

    public Componente(Long id, String nome, Macchina macchina) {
        this.id = id;
        this.nome = nome;
        this.macchina = macchina;
    }

    public Componente() {
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

    public Macchina getMacchina() {
        return macchina;
    }

    public void setMacchina(Macchina macchina) {
        this.macchina = macchina;
    }
}
