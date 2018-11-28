/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.AvaliacaoBean;

import java.util.List;

public interface AvaliacaoService {

    AvaliacaoBean criarAvaliacao(AvaliacaoBean avaliacaoBean);
    
    void deletarAvaliacao(AvaliacaoBean avaliacaoBean);

    AvaliacaoBean alterarAvaliacao(AvaliacaoBean avaliacaoBean);

    AvaliacaoBean buscarAvaliacaoPorId(AvaliacaoBean avaliacaoBean);

    List<AvaliacaoBean> buscarAvaliacaoPorString(AvaliacaoBean avaliacaoBean);

    List<AvaliacaoBean> listarAvaliacao();

}
