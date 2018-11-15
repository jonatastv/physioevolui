/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.FisioterapeutaBean;

import java.util.List;

public interface FisioterapeutaService {

    FisioterapeutaBean criarFisioterapeuta(FisioterapeutaBean fisioterapeutaBean);

    FisioterapeutaBean alterarFisioterapeuta(FisioterapeutaBean fisioterapeutaBean);

    FisioterapeutaBean buscarFisioterapeutaPorId(FisioterapeutaBean fisioterapeutaBean);

    List<FisioterapeutaBean> buscarFisioterapeutaPorString(FisioterapeutaBean fisioterapeutaBean);

    List<FisioterapeutaBean> listarFisioterapeutas();

}
