/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cidade")
public class CidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cidade_id")    
    private Integer cidade_id;
    
    @Column(name = "uf_id")
    private Integer uf_id;
    
    @Column(name = "nome_cidade")
    private String nome_cidade;

    public CidadeEntity() {
    }

    public CidadeEntity(Integer cidade_id, Integer uf_id, String nome_cidade) {
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
