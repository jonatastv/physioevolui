/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.ApvLateralDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.ApvLateralBean;
import com.projetointegrador.physioevolui.builder.ApvLateralBuilder;
import com.projetointegrador.physioevolui.service.ApvLateralService;
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
public class ApvLateralServiceImpl implements ApvLateralService {

    @Autowired
    private ApvLateralDAO apvLateralDAO;

    @Autowired
    private ApvLateralBuilder apvLateralBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param apvLateralBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ApvLateralBean criarApvLateral(ApvLateralBean apvLateralBean) {
        try {
            return apvLateralBuilder.montarApvLateralBean(apvLateralDAO.incluir(apvLateralBuilder.montarApvLateralEntity(apvLateralBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
        public void deletarApvLateral(ApvLateralBean apvLateralBean){

        try {
            apvLateralDAO.excluir(apvLateralBean.getInt_id_apv_lateral());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(ApvLateralServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param apvLateralBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ApvLateralBean alterarApvLateral(ApvLateralBean apvLateralBean) {
        try {
            return apvLateralBuilder.montarApvLateralBean(apvLateralDAO.alterar(apvLateralBuilder.montarApvLateralEntity(apvLateralBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param apvLateralBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public ApvLateralBean buscarApvLateralPorId(ApvLateralBean apvLateralBean) {
        try {
            apvLateralBean = apvLateralBuilder.montarApvLateralBean(apvLateralDAO.consultarPorId(apvLateralBean.getInt_id_apv_lateral()));
            if (apvLateralBean.getInt_id_apv_lateral()== null) {
              //  apvLateralBean.getErroBean("Não encontrado");
            }
            return apvLateralBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param apvLateralBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<ApvLateralBean> buscarApvLateralPorString(ApvLateralBean apvLateralBean) {
        try {

            List<ApvLateralBean> apvLateralBeanList = apvLateralBuilder.montarListApvLateralBean(apvLateralDAO.consultarPorString("str_quadril_apv_lateral", apvLateralBean.getStr_quadril_apv_lateral()));

            if (apvLateralBeanList.size() == 0) {
                throw new ExceptionTratada("ApvLateral não encontrado");
            }
            return apvLateralBeanList;
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
    public List<ApvLateralBean> listarApvLateral() {
        try {
            return apvLateralBuilder.montarListApvLateralBean(apvLateralDAO.listar());
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
    private List<ApvLateralBean> montarListaErro(ExceptionTratada e) {
        List<ApvLateralBean> beans = new ArrayList<>();
        beans.add(new ApvLateralBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<ApvLateralBean> montarListaErro(Exception e) {
        List<ApvLateralBean> beans = new ArrayList<>();
        beans.add(new ApvLateralBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private ApvLateralBean montarErro(Exception e) {
        return new ApvLateralBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private ApvLateralBean montarErro(ExceptionTratada e) {
        return new ApvLateralBean(new ErroBean(true, e.getStackTrace()));
    }
}
