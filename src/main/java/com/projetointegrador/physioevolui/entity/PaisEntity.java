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
@Table(name = "paciente")
public class PaisEntity {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
   @Column(name = "pais_id")    
    private Integer pais_id;

   @Column(name = "nome_pais")   
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
