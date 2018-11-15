/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

@Component
public class ErroBean {

    private Boolean isErro;
    private String message;
    private StackTraceElement[] stackTrace;

    public ErroBean() {
    }

    public ErroBean(Boolean isErro, StackTraceElement[] stackTrace) {
        this.isErro = isErro;
        this.stackTrace = stackTrace;
    }

    public ErroBean(Boolean isErro, String message) {
        this.isErro = isErro;
        this.message = message;
    }

    public ErroBean(Boolean isErro, String message, StackTraceElement[] stackTrace) {
        this.isErro = isErro;
        this.message = message;
        this.stackTrace = stackTrace;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getErro() {
        return isErro;
    }

    public void setErro(Boolean erro) {
        isErro = erro;
    }

    public StackTraceElement[] getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(StackTraceElement[] stackTrace) {
        this.stackTrace = stackTrace;
    }
}