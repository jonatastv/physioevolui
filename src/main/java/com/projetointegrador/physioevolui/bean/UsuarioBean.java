/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 * Classe utilizada para 'pegar' os dados que vem do front end
 */
@Component
public class UsuarioBean {

    private Integer int_usuario_id;
    private String str_login;
    private String str_password;
    private TipoUsuarioBean tipoUsuarioBean;
    private FisioterapeutaBean fisioterapeutaBean;
    private ErroBean erroBean;

    public UsuarioBean() {
    }

    public UsuarioBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public UsuarioBean(Integer int_usuario_id) {
        this.int_usuario_id = int_usuario_id;
    }

    public UsuarioBean(Integer int_usuario_id, String str_login, String str_password, TipoUsuarioBean tipoUsuarioBean, FisioterapeutaBean fisioterapeutaBean) {
        this.int_usuario_id = int_usuario_id;
        this.str_login = str_login;
        this.str_password = str_password;
        this.tipoUsuarioBean = tipoUsuarioBean;
        this.fisioterapeutaBean = fisioterapeutaBean;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public Integer getInt_usuario_id() {
        return int_usuario_id;
    }

    public void setInt_usuario_id(Integer int_usuario_id) {
        this.int_usuario_id = int_usuario_id;
    }

    public String getStr_login() {
        return str_login;
    }

    public void setStr_login(String str_login) {
        this.str_login = str_login;
    }

    public String getStr_password() {
        return str_password;
    }

    public void setStr_password(String str_password) {
        this.str_password = str_password;
    }

    public TipoUsuarioBean getTipoUsuarioBean() {
        return tipoUsuarioBean;
    }

    public void setTipoUsuarioBean(TipoUsuarioBean tipoUsuarioBean) {
        this.tipoUsuarioBean = tipoUsuarioBean;
    }

    public FisioterapeutaBean getFisioterapeutaBean() {
        return fisioterapeutaBean;
    }

    public void setFisioterapeutaBean(FisioterapeutaBean fisioterapeutaBean) {
        this.fisioterapeutaBean = fisioterapeutaBean;
    }
}
