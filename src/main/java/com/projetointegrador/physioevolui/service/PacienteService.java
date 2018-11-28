/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.PacienteBean;

import java.util.List;

public interface PacienteService {

    PacienteBean criarPaciente(PacienteBean pacienteBean);
    
    void deletarPaciente(PacienteBean pacienteBean);

    PacienteBean alterarPaciente(PacienteBean pacienteBean);

    PacienteBean buscarPacientePorId(PacienteBean pacienteBean);

    List<PacienteBean> buscarPacientePorString(PacienteBean pacienteBean);

    List<PacienteBean> listarPaciente();

}
