/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.GoniometriaBean;

import java.util.List;

public interface GoniometriaService {

    GoniometriaBean criarGoniometria(GoniometriaBean goniometriaBean);
    
    void deletarGoniometria(GoniometriaBean goniometriaBean);

    GoniometriaBean alterarGoniometria(GoniometriaBean goniometriaBean);

    GoniometriaBean buscarGoniometriaPorId(GoniometriaBean goniometriaBean);

    List<GoniometriaBean> buscarGoniometriaPorString(GoniometriaBean goniometriaBean);

    List<GoniometriaBean> listarGoniometria();

}
