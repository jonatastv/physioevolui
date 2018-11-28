
package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.AvaliacaoPosturalVistaPosteriorBean;
import java.util.List;

/**
 *
 * @author Jonatas
 */
public interface AvaliacaoPosturalVistaPosteriorService {
    
    
    
    AvaliacaoPosturalVistaPosteriorBean criarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean);
    
    void deletarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean);

    AvaliacaoPosturalVistaPosteriorBean alterarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean);

    AvaliacaoPosturalVistaPosteriorBean buscarAvaliacaoPosturalVistaPosteriorPorId(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean);

    List<AvaliacaoPosturalVistaPosteriorBean> buscarAvaliacaoPosturalVistaPosteriorPorString(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean);

    List<AvaliacaoPosturalVistaPosteriorBean> listarAvaliacaoPosturalVistaPosterior();
}
