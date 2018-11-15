/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;
import org.springframework.stereotype.Component;

@Component
public class CidadeBean {

    private Integer cidade_id;
    private Integer uf_id;
    private String nome_cidade;

    public CidadeBean() {
    }

    public CidadeBean(Integer cidade_id, Integer uf_id, String nome_cidade) {
        this.cidade_id = cidade_id;
        this.uf_id = uf_id;
        this.nome_cidade = nome_cidade;
    }

    public Integer getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(Integer cidade_id) {
        this.cidade_id = cidade_id;
    }

    public Integer getUf_id() {
        return uf_id;
    }

    public void setUf_id(Integer uf_id) {
        this.uf_id = uf_id;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }
}
