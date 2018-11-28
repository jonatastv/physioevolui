/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class TipoMarchaBean {
    
    private Integer int_id_tipo_marcha;

    private String str_tipo_marcha_tipo_marcha;
    
    private String str_arquivo_tipo_marcha;
    
    private ErroBean erroBean;

    public TipoMarchaBean(Integer int_id_tipo_marcha, String str_tipo_marcha_tipo_marcha, String str_arquivo_tipo_marcha, ErroBean erroBean) {
        this.int_id_tipo_marcha = int_id_tipo_marcha;
        this.str_tipo_marcha_tipo_marcha = str_tipo_marcha_tipo_marcha;
        this.str_arquivo_tipo_marcha = str_arquivo_tipo_marcha;
        this.erroBean = erroBean;
    }

    public TipoMarchaBean() {
    }

    public TipoMarchaBean(Integer int_id_tipo_marcha) {
        this.int_id_tipo_marcha = int_id_tipo_marcha;
    }

    public TipoMarchaBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public Integer getInt_id_tipo_marcha() {
        return int_id_tipo_marcha;
    }

    public void setInt_id_tipo_marcha(Integer int_id_tipo_marcha) {
        this.int_id_tipo_marcha = int_id_tipo_marcha;
    }

    public String getStr_tipo_marcha_tipo_marcha() {
        return str_tipo_marcha_tipo_marcha;
    }

    public void setStr_tipo_marcha_tipo_marcha(String str_tipo_marcha_tipo_marcha) {
        this.str_tipo_marcha_tipo_marcha = str_tipo_marcha_tipo_marcha;
    }

    public String getStr_arquivo_tipo_marcha() {
        return str_arquivo_tipo_marcha;
    }

    public void setStr_arquivo_tipo_marcha(String str_arquivo_tipo_marcha) {
        this.str_arquivo_tipo_marcha = str_arquivo_tipo_marcha;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }
    
    
    
}
