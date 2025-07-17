package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.entity.Intervento;

import java.util.List;

public class UserDto {

    private Long id;
    private String nome;
    private Integer grant;
    private List<InterventoDto> interventiDto;

    public UserDto(Long id, String nome, Integer grant, List<InterventoDto> interventiDto) {
        this.id = id;
        this.nome = nome;
        this.grant = grant;
        this.interventiDto = interventiDto;
    }

    public UserDto() {
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

    public List<InterventoDto> getInterventiDto() {
        return interventiDto;
    }

    public void setInterventiDto(List<InterventoDto> interventiDto) {
        this.interventiDto = interventiDto;
    }
}
