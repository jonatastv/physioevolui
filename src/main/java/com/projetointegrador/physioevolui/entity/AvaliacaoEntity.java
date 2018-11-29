/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_avaliacao_id")
    private Integer int_avaliacao_id;
   

   
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_fisioterapeuta_id", referencedColumnName = "int_fisioterapeuta_id", nullable = false)
    private FisioterapeutaEntity fisioterapeutaEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "avaliacaoposturalvistaposterior_id", referencedColumnName = "avaliacaoposturalvistaposterior_id", nullable = false)
    private AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity;
    
    
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_tipo_marcha", referencedColumnName = "int_id_tipo_marcha", nullable = false)
    private TipoMarchaEntity tipoMarchaEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_perimetria", referencedColumnName = "int_id_perimetria", nullable = false)
    private PerimetriaEntity perimetriaEntity;
    
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_exame_fisico", referencedColumnName = "int_id_exame_fisico", nullable = false)
    private ExameFisicoEntity exameFisicoEntity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_goniometria", referencedColumnName = "int_id_goniometria", nullable = false)
    private GoniometriaEntity goniometriaEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_apv_lateral", referencedColumnName = "int_id_apv_lateral", nullable = false)
    private ApvLateralEntity apvLateralEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_apv_anterior", referencedColumnName = "int_id_apv_anterior", nullable = false)
    private ApvAnteriorEntity apvAnteriorEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_paciente", referencedColumnName = "int_id_paciente", nullable = false)
    private PacienteEntity pacienteEntity;
    
 

    public AvaliacaoEntity() {
    }

    public AvaliacaoEntity(Integer int_avaliacao_id, FisioterapeutaEntity fisioterapeutaEntity, AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity, TipoMarchaEntity tipoMarchaEntity, PerimetriaEntity perimetriaEntity, ExameFisicoEntity exameFisicoEntity, GoniometriaEntity goniometriaEntity, ApvLateralEntity apvLateralEntity, ApvAnteriorEntity apvAnteriorEntity, PacienteEntity pacienteEntity) {
        this.int_avaliacao_id = int_avaliacao_id;
        this.fisioterapeutaEntity = fisioterapeutaEntity;
        this.avaliacaoPosturalVistaPosteriorEntity = avaliacaoPosturalVistaPosteriorEntity;
        this.tipoMarchaEntity = tipoMarchaEntity;
        this.perimetriaEntity = perimetriaEntity;
        this.exameFisicoEntity = exameFisicoEntity;
        this.goniometriaEntity = goniometriaEntity;
        this.apvLateralEntity = apvLateralEntity;
        this.apvAnteriorEntity = apvAnteriorEntity;
        this.pacienteEntity = pacienteEntity;
    }

   

    public Integer getInt_avaliacao_id() {
        return int_avaliacao_id;
    }

    public void setInt_avaliacao_id(Integer int_avaliacao_id) {
        this.int_avaliacao_id = int_avaliacao_id;
    }

    public FisioterapeutaEntity getFisioterapeutaEntity() {
        return fisioterapeutaEntity;
    }

    public void setFisioterapeutaEntity(FisioterapeutaEntity fisioterapeutaEntity) {
        this.fisioterapeutaEntity = fisioterapeutaEntity;
    }

    public AvaliacaoPosturalVistaPosteriorEntity getAvaliacaoPosturalVistaPosteriorEntity() {
        return avaliacaoPosturalVistaPosteriorEntity;
    }

    public void setAvaliacaoPosturalVistaPosteriorEntity(AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity) {
        this.avaliacaoPosturalVistaPosteriorEntity = avaliacaoPosturalVistaPosteriorEntity;
    }

    public TipoMarchaEntity getTipoMarchaEntity() {
        return tipoMarchaEntity;
    }

    public void setTipoMarchaEntity(TipoMarchaEntity tipoMarchaEntity) {
        this.tipoMarchaEntity = tipoMarchaEntity;
    }

    public PerimetriaEntity getPerimetriaEntity() {
        return perimetriaEntity;
    }

    public void setPerimetriaEntity(PerimetriaEntity perimetriaEntity) {
        this.perimetriaEntity = perimetriaEntity;
    }

    public ExameFisicoEntity getExameFisicoEntity() {
        return exameFisicoEntity;
    }

    public void setExameFisicoEntity(ExameFisicoEntity exameFisicoEntity) {
        this.exameFisicoEntity = exameFisicoEntity;
    }

    public GoniometriaEntity getGoniometriaEntity() {
        return goniometriaEntity;
    }

    public void setGoniometriaEntity(GoniometriaEntity goniometriaEntity) {
        this.goniometriaEntity = goniometriaEntity;
    }

    public ApvLateralEntity getApvLateralEntity() {
        return apvLateralEntity;
    }

    public void setApvLateralEntity(ApvLateralEntity apvLateralEntity) {
        this.apvLateralEntity = apvLateralEntity;
    }

    public ApvAnteriorEntity getApvAnteriorEntity() {
        return apvAnteriorEntity;
    }

    public void setApvAnteriorEntity(ApvAnteriorEntity apvAnteriorEntity) {
        this.apvAnteriorEntity = apvAnteriorEntity;
    }

    public PacienteEntity getPacienteEntity() {
        return pacienteEntity;
    }

    public void setPacienteEntity(PacienteEntity pacienteEntity) {
        this.pacienteEntity = pacienteEntity;
    }
    
    
    
    
    
   
}
