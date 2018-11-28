/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.UfDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.UfBean;
import com.projetointegrador.physioevolui.builder.UfBuilder;
import com.projetointegrador.physioevolui.service.UfService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * classe responsável pela implementação das regras de negócio da aplicação
 */
@Service
@Transactional
public class UfServiceImpl implements UfService {

    @Autowired
    private UfDAO ufDAO;

    @Autowired
    private UfBuilder ufBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param ufBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UfBean criarUf(UfBean ufBean) {
        try {
            return ufBuilder.montarUfBean(ufDAO.incluir(ufBuilder.montarUfEntity(ufBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
     @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarUf(UfBean ufBean){
        
        try {
            ufDAO.excluir(ufBean.getUf_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(UfServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param ufBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UfBean alterarUf(UfBean ufBean) {
        try {
            return ufBuilder.montarUfBean(ufDAO.alterar(ufBuilder.montarUfEntity(ufBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param ufBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public UfBean buscarUfPorId(UfBean ufBean) {
        try {
            ufBean = ufBuilder.montarUfBean(ufDAO.consultarPorId(ufBean.getUf_id()));
            if (ufBean.getUf_id()== null) {
              //  ufBean.getErroBean("Não encontrado");
            }
            return ufBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param ufBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<UfBean> buscarUfPorString(UfBean ufBean) {
        try {

            List<UfBean> ufBeanList = ufBuilder.montarListUfBean(ufDAO.consultarPorString("str_tipo_marcha_tipo_marcha", ufBean.getNome_uf()));

            if (ufBeanList.size() == 0) {
                throw new ExceptionTratada("Uf não encontrado");
            }
            return ufBeanList;
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
    public List<UfBean> listarUf() {
        try {
            return ufBuilder.montarListUfBean(ufDAO.listar());
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
    private List<UfBean> montarListaErro(ExceptionTratada e) {
        List<UfBean> beans = new ArrayList<>();
        beans.add(new UfBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<UfBean> montarListaErro(Exception e) {
        List<UfBean> beans = new ArrayList<>();
        beans.add(new UfBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private UfBean montarErro(Exception e) {
        return new UfBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private UfBean montarErro(ExceptionTratada e) {
        return new UfBean(new ErroBean(true, e.getStackTrace()));
    }
}
