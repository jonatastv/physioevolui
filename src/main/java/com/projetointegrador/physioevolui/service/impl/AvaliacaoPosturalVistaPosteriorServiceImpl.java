
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.AvaliacaoPosturalVistaPosteriorDAO;
import com.projetointegrador.physioevolui.bean.AvaliacaoPosturalVistaPosteriorBean;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.builder.AvaliacaoPosturalVistaPosteriorBuilder;
import com.projetointegrador.physioevolui.service.AvaliacaoPosturalVistaPosteriorService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonatas
 */

@Service
@Transactional
public class AvaliacaoPosturalVistaPosteriorServiceImpl implements AvaliacaoPosturalVistaPosteriorService{
    
        @Autowired
    private AvaliacaoPosturalVistaPosteriorDAO avaliacaoPosturalVistaPosteriorDAO;

    @Autowired
    private AvaliacaoPosturalVistaPosteriorBuilder avaliacaoPosturalVistaPosteriorBuilder;

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public AvaliacaoPosturalVistaPosteriorBean  criarFisioterapeuta(AvaliacaoPosturalVistaPosteriorBean  avaliacaoPosturalVistaPosteriorBean){
        try {
            return avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorDAO.incluir(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorEntity(avaliacaoPosturalVistaPosteriorBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    
    
     @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
     public void deletarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean){
        
        try {
            avaliacaoPosturalVistaPosteriorDAO.excluir(avaliacaoPosturalVistaPosteriorBean.getAvaliacaoposturalvistaposterior_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(AvaliacaoPosturalVistaPosteriorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    


    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public AvaliacaoPosturalVistaPosteriorBean criarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
        try {
            return avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean (avaliacaoPosturalVistaPosteriorDAO.incluir(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorEntity(avaliacaoPosturalVistaPosteriorBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    
    }

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public AvaliacaoPosturalVistaPosteriorBean alterarAvaliacaoPosturalVistaPosterior(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
          try {
            return avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean (avaliacaoPosturalVistaPosteriorDAO.alterar(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorEntity(avaliacaoPosturalVistaPosteriorBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public AvaliacaoPosturalVistaPosteriorBean buscarAvaliacaoPosturalVistaPosteriorPorId(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
          try {
            avaliacaoPosturalVistaPosteriorBean = avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean (avaliacaoPosturalVistaPosteriorDAO.consultarPorId(avaliacaoPosturalVistaPosteriorBean.getAvaliacaoposturalvistaposterior_id()));
            if (avaliacaoPosturalVistaPosteriorBean.getCabeca()== null){
                avaliacaoPosturalVistaPosteriorBean.setCabeca("Não encontrado");
            }
            return avaliacaoPosturalVistaPosteriorBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

      @Transactional(readOnly=true, propagation = Propagation.REQUIRED)
    public List<AvaliacaoPosturalVistaPosteriorBean> buscarAvaliacaoPosturalVistaPosteriorPorString(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
        try {

            List<AvaliacaoPosturalVistaPosteriorBean > avaliacaoPosturalVistaPosteriorBeanList = avaliacaoPosturalVistaPosteriorBuilder.montarListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorDAO.consultarPorString("cabeca",avaliacaoPosturalVistaPosteriorBean.getCabeca()));

            if (avaliacaoPosturalVistaPosteriorBean.getCabeca()== null){
                avaliacaoPosturalVistaPosteriorBean.setCabeca("Não encontrado");
            }
            return avaliacaoPosturalVistaPosteriorBeanList;
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }
    
    
    
    private List<AvaliacaoPosturalVistaPosteriorBean> montarListaErro(Exception e) {
        List<AvaliacaoPosturalVistaPosteriorBean> beans = new ArrayList<>();
        beans.add(new AvaliacaoPosturalVistaPosteriorBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

     @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public List<AvaliacaoPosturalVistaPosteriorBean> listarAvaliacaoPosturalVistaPosterior() {
            try {
            return avaliacaoPosturalVistaPosteriorBuilder.montarListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorDAO.listar());
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }
    
            private AvaliacaoPosturalVistaPosteriorBean montarErro(Exception e) {
        return new AvaliacaoPosturalVistaPosteriorBean(new ErroBean(true, e.getStackTrace()));
    }
    
    
}
