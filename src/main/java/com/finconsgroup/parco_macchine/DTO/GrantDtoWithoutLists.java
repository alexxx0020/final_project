package com.finconsgroup.parco_macchine.DTO;

public class GrantDtoWithoutLists {

    private Long id;

    private String nome;
    private String descrizione;

    public GrantDtoWithoutLists(Long id, String nome, String descrizione) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public GrantDtoWithoutLists() {
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
}
