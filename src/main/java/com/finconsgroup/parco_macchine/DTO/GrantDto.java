package com.finconsgroup.parco_macchine.DTO;

import java.util.List;

public class GrantDto {

    private Long id;

    private String nome;
    private String descrizione;
    private List<UserDto> users;

    public GrantDto(Long id, String nome, String descrizione, List<UserDto> users) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.users = users;
    }

    public GrantDto() {
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

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}
