/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

@Component
public class TipoUsuarioBean {

    private Integer int_tipo_usuario_id;
    private Integer int_tipo_usuario;
    private String str_desc_usuario;
    private ErroBean erroBean;

    public TipoUsuarioBean() {
    }

    public TipoUsuarioBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public TipoUsuarioBean(Integer int_tipo_usuario_id) {
        this.int_tipo_usuario_id = int_tipo_usuario_id;
    }

    public TipoUsuarioBean(Integer int_tipo_usuario, String str_desc_usuario) {
        this.int_tipo_usuario = int_tipo_usuario;
        this.str_desc_usuario = str_desc_usuario;
    }

    public TipoUsuarioBean(Integer int_tipo_usuario_id, Integer int_tipo_usuario, String str_desc_usuario) {
        this.int_tipo_usuario_id = int_tipo_usuario_id;
        this.int_tipo_usuario = int_tipo_usuario;
        this.str_desc_usuario = str_desc_usuario;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public Integer getInt_tipo_usuario_id() {
        return int_tipo_usuario_id;
    }

    public void setInt_tipo_usuario_id(Integer int_tipo_usuario_id) {
        this.int_tipo_usuario_id = int_tipo_usuario_id;
    }

    public Integer getInt_tipo_usuario() {
        return int_tipo_usuario;
    }

    public void setInt_tipo_usuario(Integer int_tipo_usuario) {
        this.int_tipo_usuario = int_tipo_usuario;
    }

    public String getStr_desc_usuario() {
        return str_desc_usuario;
    }

    public void setStr_desc_usuario(String str_desc_usuario) {
        this.str_desc_usuario = str_desc_usuario;
    }
}
