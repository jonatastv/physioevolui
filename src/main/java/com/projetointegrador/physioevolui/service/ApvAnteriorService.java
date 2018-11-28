/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.ApvAnteriorBean;

import java.util.List;

public interface ApvAnteriorService {

    ApvAnteriorBean criarApvAnterior(ApvAnteriorBean apvAnteriorBean);
    
    void deletarApvAnterior(ApvAnteriorBean apvAnteriorBean);

    ApvAnteriorBean alterarApvAnterior(ApvAnteriorBean apvAnteriorBean);

    ApvAnteriorBean buscarApvAnteriorPorId(ApvAnteriorBean apvAnteriorBean);

    List<ApvAnteriorBean> buscarApvAnteriorPorString(ApvAnteriorBean apvAnteriorBean);

    List<ApvAnteriorBean> listarApvAnterior();

}
