/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.PaisBean;

import java.util.List;

public interface PaisService {

    PaisBean criarPais(PaisBean paisBean);
    
    void deletarPais(PaisBean paisBean);

    PaisBean alterarPais(PaisBean paisBean);

    PaisBean buscarPaisPorId(PaisBean paisBean);

    List<PaisBean> buscarPaisPorString(PaisBean paisBean);

    List<PaisBean> listarPais();

}
