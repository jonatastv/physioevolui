/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;
import org.springframework.stereotype.Component;

@Component
public class FisioterapeutaBean {

    private Integer int_fisioterapeuta_id;
    private String str_fisioterapeuta_nome;
    private String str_cpf;
    private String str_rg;
    private String str_cretito;
    private String str_email;
    private String str_telefone;
    private ErroBean erroBean;

    public FisioterapeutaBean() {
    }

    public FisioterapeutaBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public FisioterapeutaBean(Integer int_fisioterapeuta_id) {
        this.int_fisioterapeuta_id = int_fisioterapeuta_id;
    }

    public FisioterapeutaBean(String str_fisioterapeuta_nome, String str_cpf, String str_rg, String str_cretito, String str_email, String str_telefone) {
        this.str_fisioterapeuta_nome = str_fisioterapeuta_nome;
        this.str_cpf = str_cpf;
        this.str_rg = str_rg;
        this.str_cretito = str_cretito;
        this.str_email = str_email;
        this.str_telefone = str_telefone;
    }

    public FisioterapeutaBean(Integer int_fisioterapeuta_id, String str_fisioterapeuta_nome, String str_cpf, String str_rg, String str_cretito, String str_email, String str_telefone) {
        this.int_fisioterapeuta_id = int_fisioterapeuta_id;
        this.str_fisioterapeuta_nome = str_fisioterapeuta_nome;
        this.str_cpf = str_cpf;
        this.str_rg = str_rg;
        this.str_cretito = str_cretito;
        this.str_email = str_email;
        this.str_telefone = str_telefone;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public Integer getInt_fisioterapeuta_id() {
        return int_fisioterapeuta_id;
    }

    public void setInt_fisioterapeuta_id(Integer int_fisioterapeuta_id) {
        this.int_fisioterapeuta_id = int_fisioterapeuta_id;
    }

    public String getStr_fisioterapeuta_nome() {
        return str_fisioterapeuta_nome;
    }

    public void setStr_fisioterapeuta_nome(String str_fisioterapeuta_nome) {
        this.str_fisioterapeuta_nome = str_fisioterapeuta_nome;
    }

    public String getStr_cpf() {
        return str_cpf;
    }

    public void setStr_cpf(String str_cpf) {
        this.str_cpf = str_cpf;
    }

    public String getStr_rg() {
        return str_rg;
    }

    public void setStr_rg(String str_rg) {
        this.str_rg = str_rg;
    }

    public String getStr_cretito() {
        return str_cretito;
    }

    public void setStr_cretito(String str_cretito) {
        this.str_cretito = str_cretito;
    }

    public String getStr_email() {
        return str_email;
    }

    public void setStr_email(String str_email) {
        this.str_email = str_email;
    }

    public String getStr_telefone() {
        return str_telefone;
    }

    public void setStr_telefone(String str_telefone) {
        this.str_telefone = str_telefone;
    }
}
