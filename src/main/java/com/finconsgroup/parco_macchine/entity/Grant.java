package com.finconsgroup.parco_macchine.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "grants")
public class Grant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descrizione;

    @OneToMany(mappedBy = "user")
    private List<User> users;

    public Grant(Long id, String nome, String descrizione, List<User> users) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.users = users;
    }

    public Grant() {
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
