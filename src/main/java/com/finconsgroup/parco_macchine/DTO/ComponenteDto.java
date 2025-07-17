package com.finconsgroup.parco_macchine.DTO;

public class ComponenteDto {

    private Long id;
    private String nome;
    private Integer macchina;

    public ComponenteDto(Long id, String nome, Integer macchina) {
        this.id = id;
        this.nome = nome;
        this.macchina = macchina;
    }

    public ComponenteDto() {
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

    public Integer getMacchina() {
        return macchina;
    }

    public void setMacchina(Integer macchina) {
        this.macchina = macchina;
    }
}
