/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.CidadeDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.CidadeBean;
import com.projetointegrador.physioevolui.builder.CidadeBuilder;
import com.projetointegrador.physioevolui.service.CidadeService;
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
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeDAO cidadeDAO;

    @Autowired
    private CidadeBuilder cidadeBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param cidadeBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CidadeBean criarCidade(CidadeBean cidadeBean) {
        try {
            return cidadeBuilder.montarCidadeBean(cidadeDAO.incluir(cidadeBuilder.montarCidadeEntity(cidadeBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarCidade(CidadeBean cidadeBean){
        
        try {
            cidadeDAO.excluir(cidadeBean.getCidade_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(CidadeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param cidadeBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CidadeBean alterarCidade(CidadeBean cidadeBean) {
        try {
            return cidadeBuilder.montarCidadeBean(cidadeDAO.alterar(cidadeBuilder.montarCidadeEntity(cidadeBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param cidadeBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public CidadeBean buscarCidadePorId(CidadeBean cidadeBean) {
        try {
            cidadeBean = cidadeBuilder.montarCidadeBean(cidadeDAO.consultarPorId(cidadeBean.getCidade_id()));
            if (cidadeBean.getCidade_id()== null) {
               cidadeBean.setNome_cidade("Não encontrado");
            }
            return cidadeBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param cidadeBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<CidadeBean> buscarCidadePorString(CidadeBean cidadeBean) {
        try {

            List<CidadeBean> cidadeBeanList = cidadeBuilder.montarListCidadeBean(cidadeDAO.consultarPorString("nome_cidade", cidadeBean.getNome_cidade()));

            if (cidadeBeanList.size() == 0) {
                throw new ExceptionTratada("Cidade não encontrado");
            }
            return cidadeBeanList;
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
    public List<CidadeBean> listarCidade() {
        try {
            return cidadeBuilder.montarListCidadeBean(cidadeDAO.listar());
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
    private List<CidadeBean> montarListaErro(ExceptionTratada e) {
        List<CidadeBean> beans = new ArrayList<>();
        beans.add(new CidadeBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<CidadeBean> montarListaErro(Exception e) {
        List<CidadeBean> beans = new ArrayList<>();
        beans.add(new CidadeBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private CidadeBean montarErro(Exception e) {
        return new CidadeBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private CidadeBean montarErro(ExceptionTratada e) {
        return new CidadeBean(new ErroBean(true, e.getStackTrace()));
    }
}
