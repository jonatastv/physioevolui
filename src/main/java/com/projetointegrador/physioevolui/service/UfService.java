
package com.projetointegrador.physioevolui.service;


import com.projetointegrador.physioevolui.bean.UfBean;
import java.util.List;

/**
 *
 * @author Jonatas
 */
public interface UfService {
    
    
    UfBean criarUf(UfBean ufBean);
    
    void deletarUf(UfBean ufBean);

    UfBean alterarUf(UfBean ufBean);

    UfBean buscarUfPorId(UfBean ufBean);

    List<UfBean> buscarUfPorString(UfBean ufBean);

    List<UfBean> listarUf();
}
