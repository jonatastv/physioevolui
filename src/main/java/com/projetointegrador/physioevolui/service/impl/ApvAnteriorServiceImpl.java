/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.ApvAnteriorDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.ApvAnteriorBean;
import com.projetointegrador.physioevolui.builder.ApvAnteriorBuilder;
import com.projetointegrador.physioevolui.service.ApvAnteriorService;
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
public class ApvAnteriorServiceImpl implements ApvAnteriorService {

    @Autowired
    private ApvAnteriorDAO apvAnteriorDAO;

    @Autowired
    private ApvAnteriorBuilder apvAnteriorBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param apvAnteriorBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ApvAnteriorBean criarApvAnterior(ApvAnteriorBean apvAnteriorBean) {
        try {
            return apvAnteriorBuilder.montarApvAnteriorBean(apvAnteriorDAO.incluir(apvAnteriorBuilder.montarApvAnteriorEntity(apvAnteriorBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
        public void deletarApvAnterior(ApvAnteriorBean apvAnteriorBean){
        
        try {
            apvAnteriorDAO.excluir(apvAnteriorBean.getInt_id_apv_anterior());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(ApvAnteriorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param apvAnteriorBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ApvAnteriorBean alterarApvAnterior(ApvAnteriorBean apvAnteriorBean) {
        try {
            return apvAnteriorBuilder.montarApvAnteriorBean(apvAnteriorDAO.alterar(apvAnteriorBuilder.montarApvAnteriorEntity(apvAnteriorBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param apvAnteriorBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public ApvAnteriorBean buscarApvAnteriorPorId(ApvAnteriorBean apvAnteriorBean) {
        try {
            apvAnteriorBean = apvAnteriorBuilder.montarApvAnteriorBean(apvAnteriorDAO.consultarPorId(apvAnteriorBean.getInt_id_apv_anterior()));
            if (apvAnteriorBean.getInt_id_apv_anterior()== null) {
              //  apvAnteriorBean.getErroBean("Não encontrado");
            }
            return apvAnteriorBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param apvAnteriorBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<ApvAnteriorBean> buscarApvAnteriorPorString(ApvAnteriorBean apvAnteriorBean) {
        try {

            List<ApvAnteriorBean> apvAnteriorBeanList = apvAnteriorBuilder.montarListApvAnteriorBean(apvAnteriorDAO.consultarPorString("str_cabeca_apv_anterior", apvAnteriorBean.getStr_cabeca_apv_anterior()));

            if (apvAnteriorBeanList.size() == 0) {
                throw new ExceptionTratada("ApvAnterior não encontrado");
            }
            return apvAnteriorBeanList;
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
    public List<ApvAnteriorBean> listarApvAnterior() {
        try {
            return apvAnteriorBuilder.montarListApvAnteriorBean(apvAnteriorDAO.listar());
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
    private List<ApvAnteriorBean> montarListaErro(ExceptionTratada e) {
        List<ApvAnteriorBean> beans = new ArrayList<>();
        beans.add(new ApvAnteriorBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<ApvAnteriorBean> montarListaErro(Exception e) {
        List<ApvAnteriorBean> beans = new ArrayList<>();
        beans.add(new ApvAnteriorBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private ApvAnteriorBean montarErro(Exception e) {
        return new ApvAnteriorBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private ApvAnteriorBean montarErro(ExceptionTratada e) {
        return new ApvAnteriorBean(new ErroBean(true, e.getStackTrace()));
    }
}
