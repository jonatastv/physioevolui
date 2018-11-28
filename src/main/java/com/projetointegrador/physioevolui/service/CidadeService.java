/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.CidadeBean;

import java.util.List;

public interface CidadeService {

    CidadeBean criarCidade(CidadeBean cidadeBean);
    
    void deletarCidade(CidadeBean cidadeBean);

    CidadeBean alterarCidade(CidadeBean cidadeBean);

    CidadeBean buscarCidadePorId(CidadeBean cidadeBean);

    List<CidadeBean> buscarCidadePorString(CidadeBean cidadeBean);

    List<CidadeBean> listarCidade();

}
