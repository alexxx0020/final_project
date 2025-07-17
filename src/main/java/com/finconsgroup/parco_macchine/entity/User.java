package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "grant_id")
    private Grant grant;

    @OneToMany(mappedBy = "user")
    private List<Intervento> interventi;

    public User(Long id, String nome, Grant grant, List<Intervento> interventi) {
        this.id = id;
        this.nome = nome;
        this.grant = grant;
        this.interventi = interventi;
    }

    public User() {
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

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public List<Intervento> getInterventi() {
        return interventi;
    }

    public void setInterventi(List<Intervento> interventi) {
        this.interventi = interventi;
    }
}
