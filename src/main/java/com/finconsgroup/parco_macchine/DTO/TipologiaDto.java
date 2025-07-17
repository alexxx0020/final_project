package com.finconsgroup.parco_macchine.DTO;

import com.finconsgroup.parco_macchine.entity.Macchina;

import java.util.List;

public class TipologiaDto {

    private Integer id;
    private String nome;
    private List<MacchinaDto> macchineDtos;

    public TipologiaDto(Integer id, String nome, List<MacchinaDto> macchineDtos) {
        this.id = id;
        this.nome = nome;
        this.macchineDtos = macchineDtos;
    }

    public TipologiaDto() {
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

    public List<MacchinaDto> getMacchineDtos() {
        return macchineDtos;
    }

    public void setMacchineDtos(List<MacchinaDto> macchineDtos) {
        this.macchineDtos = macchineDtos;
    }
}
