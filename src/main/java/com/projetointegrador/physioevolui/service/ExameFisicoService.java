/*
 * Copyright (c) Criado por: jonatas  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.ExameFisicoBean;

import java.util.List;

public interface ExameFisicoService {

    ExameFisicoBean criarExameFisico(ExameFisicoBean exameFisicoBean);
    
    void deletarExameFisico(ExameFisicoBean exameFisicoBean);

    ExameFisicoBean alterarExameFisico(ExameFisicoBean exameFisicoBean);

    ExameFisicoBean buscarExameFisicoPorId(ExameFisicoBean exameFisicoBean);

    List<ExameFisicoBean> buscarExameFisicoPorString(ExameFisicoBean exameFisicoBean);

    List<ExameFisicoBean> listarExameFisico();

}
