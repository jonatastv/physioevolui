/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.utils;

/**
 * classe responsável por tratar os erros encontrados
 */
public class ExceptionTratada extends Exception {

    private static final long serialVersionUID = 1189188521388183949L;
    private Exception ex;
    private String msg;

    public ExceptionTratada(Exception e){
        ex = e;
        msg = e.getMessage();
    }

    public ExceptionTratada(String msg) {
        this.msg = msg;
    }

    public ExceptionTratada(Exception e, String mensagem){
        e.printStackTrace();
        ex = e;
        msg = mensagem;
    }

    public Exception getEx() {
        return ex;
    }

    public String getMsg() {
        return msg;
    }
}
