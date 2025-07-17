package com.finconsgroup.parco_macchine.DTO;

public class TipologiaDtoWithoutList {

    private Integer id;
    private String nome;

    public TipologiaDtoWithoutList(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public TipologiaDtoWithoutList() {
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
}
