
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
@Table(name = "goniometria")
public class GoniometriaEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_goniometria")
    private Integer int_id_goniometria;
    
    @Column(name = "int_ombro_goniometria")
    private Integer int_ombro_goniometria;
    
    @Column(name = "int_cotovelo_goniometria")
    private Integer int_cotovelo_goniometria;
    
    @Column(name = "int_punho_goniometria")
    private Integer int_punho_goniometria;
    
    @Column(name = "int_quadril_goniometria")
    private Integer int_quadril_goniometria;
    
    @Column(name = "int_joelho_goniometria")
    private Integer int_joelho_goniometria;
    
    @Column(name = "int_tornozelo_goniometria")
    private Integer int_tornozelo_goniometria;
    
    @Column(name = "int_coluna_vertebral_goniometria")
    private Integer int_coluna_vertebral_goniometria;
    
    @Column(name = "int_articulacao_temporomandibular_goniometria")
    private Integer int_articulacao_temporomandibular_goniometria;

    public GoniometriaEntity() {
    }

    public GoniometriaEntity(Integer int_id_goniometria, Integer int_ombro_goniometria, Integer int_cotovelo_goniometria, Integer int_punho_goniometria, Integer int_quadril_goniometria, Integer int_joelho_goniometria, Integer int_tornozelo_goniometria, Integer int_coluna_vertebral_goniometria, Integer int_articulacao_temporomandibular_goniometria) {
        this.int_id_goniometria = int_id_goniometria;
        this.int_ombro_goniometria = int_ombro_goniometria;
        this.int_cotovelo_goniometria = int_cotovelo_goniometria;
        this.int_punho_goniometria = int_punho_goniometria;
        this.int_quadril_goniometria = int_quadril_goniometria;
        this.int_joelho_goniometria = int_joelho_goniometria;
        this.int_tornozelo_goniometria = int_tornozelo_goniometria;
        this.int_coluna_vertebral_goniometria = int_coluna_vertebral_goniometria;
        this.int_articulacao_temporomandibular_goniometria = int_articulacao_temporomandibular_goniometria;
    }

    public Integer getInt_id_goniometria() {
        return int_id_goniometria;
    }

    public void setInt_id_goniometria(Integer int_id_goniometria) {
        this.int_id_goniometria = int_id_goniometria;
    }

    public Integer getInt_ombro_goniometria() {
        return int_ombro_goniometria;
    }

    public void setInt_ombro_goniometria(Integer int_ombro_goniometria) {
        this.int_ombro_goniometria = int_ombro_goniometria;
    }

    public Integer getInt_cotovelo_goniometria() {
        return int_cotovelo_goniometria;
    }

    public void setInt_cotovelo_goniometria(Integer int_cotovelo_goniometria) {
        this.int_cotovelo_goniometria = int_cotovelo_goniometria;
    }

    public Integer getInt_punho_goniometria() {
        return int_punho_goniometria;
    }

    public void setInt_punho_goniometria(Integer int_punho_goniometria) {
        this.int_punho_goniometria = int_punho_goniometria;
    }

    public Integer getInt_quadril_goniometria() {
        return int_quadril_goniometria;
    }

    public void setInt_quadril_goniometria(Integer int_quadril_goniometria) {
        this.int_quadril_goniometria = int_quadril_goniometria;
    }

    public Integer getInt_joelho_goniometria() {
        return int_joelho_goniometria;
    }

    public void setInt_joelho_goniometria(Integer int_joelho_goniometria) {
        this.int_joelho_goniometria = int_joelho_goniometria;
    }

    public Integer getInt_tornozelo_goniometria() {
        return int_tornozelo_goniometria;
    }

    public void setInt_tornozelo_goniometria(Integer int_tornozelo_goniometria) {
        this.int_tornozelo_goniometria = int_tornozelo_goniometria;
    }

    public Integer getInt_coluna_vertebral_goniometria() {
        return int_coluna_vertebral_goniometria;
    }

    public void setInt_coluna_vertebral_goniometria(Integer int_coluna_vertebral_goniometria) {
        this.int_coluna_vertebral_goniometria = int_coluna_vertebral_goniometria;
    }

    public Integer getInt_articulacao_temporomandibular_goniometria() {
        return int_articulacao_temporomandibular_goniometria;
    }

    public void setInt_articulacao_temporomandibular_goniometria(Integer int_articulacao_temporomandibular_goniometria) {
        this.int_articulacao_temporomandibular_goniometria = int_articulacao_temporomandibular_goniometria;
    }
    
    
    
    
}
