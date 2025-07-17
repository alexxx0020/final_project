package com.finconsgroup.parco_macchine.DTO;

public class UserDtoWithoutList {
    private Long id;
    private String nome;
    private Integer grant;

    public UserDtoWithoutList(Long id, String nome, Integer grant) {
        this.id = id;
        this.nome = nome;
        this.grant = grant;
    }

    public UserDtoWithoutList() {
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

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }
}
