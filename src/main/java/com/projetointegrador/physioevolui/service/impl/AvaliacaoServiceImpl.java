
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.AvaliacaoDAO;
import com.projetointegrador.physioevolui.bean.AvaliacaoBean;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.AvaliacaoBean;
import com.projetointegrador.physioevolui.builder.AvaliacaoBuilder;
import com.projetointegrador.physioevolui.service.AvaliacaoService;
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
public class AvaliacaoServiceImpl implements AvaliacaoService{

    
    @Autowired
    private AvaliacaoDAO avaliacaoDAO;

    @Autowired
    private AvaliacaoBuilder avaliacaoBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param avaliacaoBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public AvaliacaoBean criarAvaliacao(AvaliacaoBean avaliacaoBean) {
        try {
            return avaliacaoBuilder.montarAvaliacaoBean(avaliacaoDAO.incluir(avaliacaoBuilder.montarAvaliacaoEntity(avaliacaoBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deletarAvaliacao(AvaliacaoBean avaliacaoBean){
        
        try {
            avaliacaoDAO.excluir(avaliacaoBean.getInt_avaliacao_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(AvaliacaoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param avaliacaoBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public AvaliacaoBean alterarAvaliacao(AvaliacaoBean avaliacaoBean) {
        try {
            return avaliacaoBuilder.montarAvaliacaoBean(avaliacaoDAO.alterar(avaliacaoBuilder.montarAvaliacaoEntity(avaliacaoBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param avaliacaoBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public AvaliacaoBean buscarAvaliacaoPorId(AvaliacaoBean avaliacaoBean) {
        try {
            avaliacaoBean = avaliacaoBuilder.montarAvaliacaoBean(avaliacaoDAO.consultarPorId(avaliacaoBean.getInt_avaliacao_id()));
            if (avaliacaoBean.getInt_avaliacao_id()== null) {
              //  avaliacaoBean.setStr_login("Não encontrado");
            }
            return avaliacaoBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param avaliacaoBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<AvaliacaoBean> buscarAvaliacaoPorString(AvaliacaoBean avaliacaoBean) {
        try {

            List<AvaliacaoBean> avaliacaoBeanList = avaliacaoBuilder.montarListAvaliacaoBean(avaliacaoDAO.consultarPorString("str_login", "teste"));

            if (avaliacaoBeanList.size() == 0) {
                throw new ExceptionTratada("Avaliacao não encontrado");
            }
            return avaliacaoBeanList;
        } catch (ExceptionTratada e) {
            return montarListaErro(e);
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a listar todos os usuários
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<AvaliacaoBean> listarAvaliacao() {
        try {
            return avaliacaoBuilder.montarListAvaliacaoBean(avaliacaoDAO.listar());
        } catch (ExceptionTratada e) {
            return montarListaErro(e);
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    /**
     * método responsável por montar lista de objetos de retorno com erros tratados
     * @param e
     * @return
     */
    private List<AvaliacaoBean> montarListaErro(ExceptionTratada e) {
        List<AvaliacaoBean> beans = new ArrayList<>();
        beans.add(new AvaliacaoBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<AvaliacaoBean> montarListaErro(Exception e) {
        List<AvaliacaoBean> beans = new ArrayList<>();
        beans.add(new AvaliacaoBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private AvaliacaoBean montarErro(Exception e) {
        return new AvaliacaoBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private AvaliacaoBean montarErro(ExceptionTratada e) {
        return new AvaliacaoBean(new ErroBean(true, e.getStackTrace()));
        
    }
    
    
    


    
    
            
}

