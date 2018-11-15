/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;
import org.springframework.stereotype.Component;

@Component
public class UfBean {
    private Integer uf_id;
    private Integer pais_id;
    private String nome_uf;
    private String sigla_uf;

    public UfBean() {
    }

    public UfBean(Integer uf_id, Integer pais_id, String nome_uf, String sigla_uf) {
        this.uf_id = uf_id;
        this.pais_id = pais_id;
        this.nome_uf = nome_uf;
        this.sigla_uf = sigla_uf;
    }

    public Integer getUf_id() {
        return uf_id;
    }

    public void setUf_id(Integer uf_id) {
        this.uf_id = uf_id;
    }

    public Integer getPais_id() {
        return pais_id;
    }

    public void setPais_id(Integer pais_id) {
        this.pais_id = pais_id;
    }

    public String getNome_uf() {
        return nome_uf;
    }

    public void setNome_uf(String nome_uf) {
        this.nome_uf = nome_uf;
    }

    public String getSigla_uf() {
        return sigla_uf;
    }

    public void setSigla_uf(String sigla_uf) {
        this.sigla_uf = sigla_uf;
    }
}
