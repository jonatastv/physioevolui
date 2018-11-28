
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.PerimetriaDAO;
import com.projetointegrador.physioevolui.bean.PerimetriaBean;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.PerimetriaBuilder;
import com.projetointegrador.physioevolui.service.PerimetriaService;
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
public class PerimetriaServiceImpl implements PerimetriaService {
    
    
        
    @Autowired
    private PerimetriaDAO perimetriaDAO;

    @Autowired
    private PerimetriaBuilder perimetriaBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param perimetriaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PerimetriaBean criarPerimetria(PerimetriaBean perimetriaBean) {
        try {
            return perimetriaBuilder.montarPerimetriaBean(perimetriaDAO.incluir(perimetriaBuilder.montarPerimetriaEntity(perimetriaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deletarPerimetria(PerimetriaBean perimetriaBean){
        
        try {
            perimetriaDAO.excluir(perimetriaBean.getInt_id_perimetria());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(PerimetriaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param perimetriaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PerimetriaBean alterarPerimetria(PerimetriaBean perimetriaBean) {
        try {
            return perimetriaBuilder.montarPerimetriaBean(perimetriaDAO.alterar(perimetriaBuilder.montarPerimetriaEntity(perimetriaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param perimetriaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public PerimetriaBean buscarPerimetriaPorId(PerimetriaBean perimetriaBean) {
        try {
            perimetriaBean = perimetriaBuilder.montarPerimetriaBean(perimetriaDAO.consultarPorId(perimetriaBean.getInt_id_perimetria()));
            if (perimetriaBean.getInt_id_perimetria()== null) {
              //  perimetriaBean.setStr_login("Não encontrado");
            }
            return perimetriaBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param perimetriaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<PerimetriaBean> buscarPerimetriaPorString(PerimetriaBean perimetriaBean) {
        try {

            List<PerimetriaBean> perimetriaBeanList = perimetriaBuilder.montarListPerimetriaBean(perimetriaDAO.consultarPorString("str_login", "teste"));

            if (perimetriaBeanList.size() == 0) {
                throw new ExceptionTratada("Perimetria não encontrado");
            }
            return perimetriaBeanList;
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
    public List<PerimetriaBean> listarPerimetria() {
        try {
            return perimetriaBuilder.montarListPerimetriaBean(perimetriaDAO.listar());
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
    private List<PerimetriaBean> montarListaErro(ExceptionTratada e) {
        List<PerimetriaBean> beans = new ArrayList<>();
        beans.add(new PerimetriaBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<PerimetriaBean> montarListaErro(Exception e) {
        List<PerimetriaBean> beans = new ArrayList<>();
        beans.add(new PerimetriaBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private PerimetriaBean montarErro(Exception e) {
        return new PerimetriaBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private PerimetriaBean montarErro(ExceptionTratada e) {
        return new PerimetriaBean(new ErroBean(true, e.getStackTrace()));
        
    }
}
