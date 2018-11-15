/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

public class PaisEntity {

    private Integer pais_id;
    private String nome_pais;

    public PaisEntity() {
    }

    public PaisEntity(Integer pais_id, String nome_pais) {
        this.pais_id = pais_id;
        this.nome_pais = nome_pais;
    }

    public Integer getPais_id() {
        return pais_id;
    }

    public void setPais_id(Integer pais_id) {
        this.pais_id = pais_id;
    }

    public String getNome_pais() {
        return nome_pais;
    }

    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }
}
