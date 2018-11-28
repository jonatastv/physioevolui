
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.PaisDAO;
import com.projetointegrador.physioevolui.bean.PaisBean;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.PaisBuilder;
import com.projetointegrador.physioevolui.service.PaisService;
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
public class PaisServiceImpl implements PaisService {
    
    
        
    @Autowired
    private PaisDAO paisDAO;

    @Autowired
    private PaisBuilder paisBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param paisBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PaisBean criarPais(PaisBean paisBean) {
        try {
            return paisBuilder.montarPaisBean(paisDAO.incluir(paisBuilder.montarPaisEntity(paisBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deletarPais(PaisBean paisBean){
        
        try {
            paisDAO.excluir(paisBean.getPais_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(PaisServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param paisBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PaisBean alterarPais(PaisBean paisBean) {
        try {
            return paisBuilder.montarPaisBean(paisDAO.alterar(paisBuilder.montarPaisEntity(paisBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param paisBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public PaisBean buscarPaisPorId(PaisBean paisBean) {
        try {
            paisBean = paisBuilder.montarPaisBean(paisDAO.consultarPorId(paisBean.getPais_id()));
            if (paisBean.getPais_id()== null) {
              //  paisBean.setStr_login("Não encontrado");
            }
            return paisBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param paisBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<PaisBean> buscarPaisPorString(PaisBean paisBean) {
        try {

            List<PaisBean> paisBeanList = paisBuilder.montarListPaisBean(paisDAO.consultarPorString("str_login", "teste"));

            if (paisBeanList.size() == 0) {
                throw new ExceptionTratada("Pais não encontrado");
            }
            return paisBeanList;
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
    public List<PaisBean> listarPais() {
        try {
            return paisBuilder.montarListPaisBean(paisDAO.listar());
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
    private List<PaisBean> montarListaErro(ExceptionTratada e) {
        List<PaisBean> beans = new ArrayList<>();
        beans.add(new PaisBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<PaisBean> montarListaErro(Exception e) {
        List<PaisBean> beans = new ArrayList<>();
        beans.add(new PaisBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private PaisBean montarErro(Exception e) {
        return new PaisBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private PaisBean montarErro(ExceptionTratada e) {
        return new PaisBean(new ErroBean(true, e.getStackTrace()));
        
    }
}
