
package com.projetointegrador.physioevolui.service;


import com.projetointegrador.physioevolui.bean.PerimetriaBean;
import java.util.List;

/**
 *
 * @author Jonatas
 */
public interface PerimetriaService {
    
    
    PerimetriaBean criarPerimetria(PerimetriaBean perimetriaBean);
    
    void deletarPerimetria(PerimetriaBean perimetriaBean);

    PerimetriaBean alterarPerimetria(PerimetriaBean perimetriaBean);

    PerimetriaBean buscarPerimetriaPorId(PerimetriaBean perimetriaBean);

    List<PerimetriaBean> buscarPerimetriaPorString(PerimetriaBean perimetriaBean);

    List<PerimetriaBean> listarPerimetria();
}
