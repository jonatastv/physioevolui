/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.ApvLateralBean;

import java.util.List;

public interface ApvLateralService {

    ApvLateralBean criarApvLateral(ApvLateralBean apvLateralBean);
    
    void deletarApvLateral(ApvLateralBean apvLateralBean);

    ApvLateralBean alterarApvLateral(ApvLateralBean apvLateralBean);

    ApvLateralBean buscarApvLateralPorId(ApvLateralBean apvLateralBean);

    List<ApvLateralBean> buscarApvLateralPorString(ApvLateralBean apvLateralBean);

    List<ApvLateralBean> listarApvLateral();

}
