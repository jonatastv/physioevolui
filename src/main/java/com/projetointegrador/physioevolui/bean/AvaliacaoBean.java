/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

@Component
public class AvaliacaoBean {

     private Integer int_avaliacao_id;
     private FisioterapeutaBean fisioterapeutaBean;
     private AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean;
     private TipoMarchaBean tipoMarchaBean;
     private PerimetriaBean perimetriaBean;
     private ExameFisicoBean exameFisicoBean;
     private GoniometriaBean goniometriaBean;
     private ApvLateralBean apvLateralBean;
     private ApvAnteriorBean apvAnteriorBean;
     private PacienteBean pacienteBean;
     private ErroBean erroBean;

    public AvaliacaoBean() {
    }

    public AvaliacaoBean(Integer int_avaliacao_id, FisioterapeutaBean fisioterapeutaBean, AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean, TipoMarchaBean tipoMarchaBean, PerimetriaBean perimetriaBean, ExameFisicoBean exameFisicoBean, GoniometriaBean goniometriaBean, ApvLateralBean apvLateralBean, ApvAnteriorBean apvAnteriorBean, PacienteBean pacienteBean, ErroBean erroBean) {
        this.int_avaliacao_id = int_avaliacao_id;
        this.fisioterapeutaBean = fisioterapeutaBean;
        this.avaliacaoPosturalVistaPosteriorBean = avaliacaoPosturalVistaPosteriorBean;
        this.tipoMarchaBean = tipoMarchaBean;
        this.perimetriaBean = perimetriaBean;
        this.exameFisicoBean = exameFisicoBean;
        this.goniometriaBean = goniometriaBean;
        this.apvLateralBean = apvLateralBean;
        this.apvAnteriorBean = apvAnteriorBean;
        this.pacienteBean = pacienteBean;
        this.erroBean = erroBean;
    }

    
    


    public AvaliacaoBean(ErroBean erroBean) {
       this.erroBean = erroBean;
    }

    public AvaliacaoBean(Integer int_avaliacao_id) {
     this.int_avaliacao_id = int_avaliacao_id;
    }

    public Integer getInt_avaliacao_id() {
        return int_avaliacao_id;
    }

    public void setInt_avaliacao_id(Integer int_avaliacao_id) {
        this.int_avaliacao_id = int_avaliacao_id;
    }

    public FisioterapeutaBean getFisioterapeutaBean() {
        return fisioterapeutaBean;
    }

    public void setFisioterapeutaBean(FisioterapeutaBean fisioterapeutaBean) {
        this.fisioterapeutaBean = fisioterapeutaBean;
    }

    public AvaliacaoPosturalVistaPosteriorBean getAvaliacaoPosturalVistaPosteriorBean() {
        return avaliacaoPosturalVistaPosteriorBean;
    }

    public void setAvaliacaoPosturalVistaPosteriorBean(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
        this.avaliacaoPosturalVistaPosteriorBean = avaliacaoPosturalVistaPosteriorBean;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public TipoMarchaBean getTipoMarchaBean() {
        return tipoMarchaBean;
    }

    public void setTipoMarchaBean(TipoMarchaBean tipoMarchaBean) {
        this.tipoMarchaBean = tipoMarchaBean;
    }

    public PerimetriaBean getPerimetriaBean() {
        return perimetriaBean;
    }

    public void setPerimetriaBean(PerimetriaBean perimetriaBean) {
        this.perimetriaBean = perimetriaBean;
    }

    public ExameFisicoBean getExameFisicoBean() {
        return exameFisicoBean;
    }

    public void setExameFisicoBean(ExameFisicoBean exameFisicoBean) {
        this.exameFisicoBean = exameFisicoBean;
    }

    public GoniometriaBean getGoniometriaBean() {
        return goniometriaBean;
    }

    public void setGoniometriaBean(GoniometriaBean goniometriaBean) {
        this.goniometriaBean = goniometriaBean;
    }

    public ApvLateralBean getApvLateralBean() {
        return apvLateralBean;
    }

    public void setApvLateralBean(ApvLateralBean apvLateralBean) {
        this.apvLateralBean = apvLateralBean;
    }

    public ApvAnteriorBean getApvAnteriorBean() {
        return apvAnteriorBean;
    }

    public void setApvAnteriorBean(ApvAnteriorBean apvAnteriorBean) {
        this.apvAnteriorBean = apvAnteriorBean;
    }

    public PacienteBean getPacienteBean() {
        return pacienteBean;
    }

    public void setPacienteBean(PacienteBean pacienteBean) {
        this.pacienteBean = pacienteBean;
    }
     
     
     
}
