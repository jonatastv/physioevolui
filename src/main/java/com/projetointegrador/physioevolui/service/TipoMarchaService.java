/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.TipoMarchaBean;

import java.util.List;

public interface TipoMarchaService {

    TipoMarchaBean criarTipoMarcha(TipoMarchaBean tipoMarchaBean);
    
    
    void deletarTipoMarcha(TipoMarchaBean tipoMarchaBean);

    TipoMarchaBean alterarTipoMarcha(TipoMarchaBean tipoMarchaBean);

    TipoMarchaBean buscarTipoMarchaPorId(TipoMarchaBean tipoMarchaBean);

    List<TipoMarchaBean> buscarTipoMarchaPorString(TipoMarchaBean tipoMarchaBean);

    List<TipoMarchaBean> listarTipoMarcha();

}
