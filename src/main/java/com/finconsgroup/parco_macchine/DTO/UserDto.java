package com.finconsgroup.parco_macchine.DTO;

import java.util.List;

public class UserDto {

    private Long id;
    private String username;
    private Integer grant;
    private String password;
    private List<InterventoDto> interventiDto;

    public UserDto(Long id, String username, Integer grant, String password, List<InterventoDto> interventiDto) {
        this.id = id;
        this.username = username;
        this.grant = grant;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<InterventoDto> getInterventiDto() {
        return interventiDto;
    }

    public void setInterventiDto(List<InterventoDto> interventiDto) {
        this.interventiDto = interventiDto;
    }
}
