/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mauro
 */
@Entity
@Table(name = "avaliacao_postural_vista_posterior")
public class AvaliacaoPosturalVistaPosteriorEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avaliacaoposturalvistaposterior_id")
    private int avaliacaoposturalvistaposterior_id;
    
    @Column(name = "coluna_servical")
    private String coluna_servical;
    
    @Column(name = "coluna_toracica")
    private String coluna_toracica;
    
    @Column(name = "coluna_lombar")
    private String coluna_lombar;
    
    @Column(name = "cabeca")
    private String cabeca;
    
    @Column(name = "ombro")
    private String ombro;
    
    @Column(name = "escapula")
    private String escapula;
    
    @Column(name = "angulo_tales")
    private String angulo_tales;
    
    @Column(name = "espinha_iliaca_antero")
    private String espinha_iliaca_antero;
    
    @Column(name = "joelho")
    private String joelho;
    
    @Column(name = "tornozelo_pe")
    private String tornozelo_pe;

    public AvaliacaoPosturalVistaPosteriorEntity(int avaliacaoposturalvistaposterior_id, String coluna_servical, String coluna_toracica, String coluna_lombar, String cabeca, String ombro, String escapula, String angulo_tales, String espinha_iliaca_antero, String joelho, String tornozelo_pe) {
        this.avaliacaoposturalvistaposterior_id = avaliacaoposturalvistaposterior_id;
        this.coluna_servical = coluna_servical;
        this.coluna_toracica = coluna_toracica;
        this.coluna_lombar = coluna_lombar;
        this.cabeca = cabeca;
        this.ombro = ombro;
        this.escapula = escapula;
        this.angulo_tales = angulo_tales;
        this.espinha_iliaca_antero = espinha_iliaca_antero;
        this.joelho = joelho;
        this.tornozelo_pe = tornozelo_pe;
    }

    public AvaliacaoPosturalVistaPosteriorEntity() {
        
    }

    public int getAvaliacaoposturalvistaposterior_id() {
        return avaliacaoposturalvistaposterior_id;
    }

    public void setAvaliacaoposturalvistaposterior_id(int avaliacaoposturalvistaposterior_id) {
        this.avaliacaoposturalvistaposterior_id = avaliacaoposturalvistaposterior_id;
    }

    public String getColuna_servical() {
        return coluna_servical;
    }

    public void setColuna_servical(String coluna_servical) {
        this.coluna_servical = coluna_servical;
    }

    public String getColuna_toracica() {
        return coluna_toracica;
    }

    public void setColuna_toracica(String coluna_toracica) {
        this.coluna_toracica = coluna_toracica;
    }

    public String getColuna_lombar() {
        return coluna_lombar;
    }

    public void setColuna_lombar(String coluna_lombar) {
        this.coluna_lombar = coluna_lombar;
    }

    public String getCabeca() {
        return cabeca;
    }

    public void setCabeca(String cabeca) {
        this.cabeca = cabeca;
    }

    public String getOmbro() {
        return ombro;
    }

    public void setOmbro(String ombro) {
        this.ombro = ombro;
    }

    public String getEscapula() {
        return escapula;
    }

    public void setEscapula(String escapula) {
        this.escapula = escapula;
    }

    public String getAngulo_tales() {
        return angulo_tales;
    }

    public void setAngulo_tales(String angulo_tales) {
        this.angulo_tales = angulo_tales;
    }

    public String getEspinha_iliaca_antero() {
        return espinha_iliaca_antero;
    }

    public void setEspinha_iliaca_antero(String espinha_iliaca_antero) {
        this.espinha_iliaca_antero = espinha_iliaca_antero;
    }

    public String getJoelho() {
        return joelho;
    }

    public void setJoelho(String joelho) {
        this.joelho = joelho;
    }

    public String getTornozelo_pe() {
        return tornozelo_pe;
    }

    public void setTornozelo_pe(String tornozelo_pe) {
        this.tornozelo_pe = tornozelo_pe;
    }
    
    
    
}
