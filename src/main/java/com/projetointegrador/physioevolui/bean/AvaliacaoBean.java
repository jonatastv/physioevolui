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
     private ErroBean erroBean;

    public AvaliacaoBean() {
    }

    public AvaliacaoBean(Integer int_avaliacao_id, FisioterapeutaBean fisioterapeutaBean, AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean, ErroBean erroBean) {
        this.int_avaliacao_id = int_avaliacao_id;
        this.fisioterapeutaBean = fisioterapeutaBean;
        this.avaliacaoPosturalVistaPosteriorBean = avaliacaoPosturalVistaPosteriorBean;
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
     
     
     
}
