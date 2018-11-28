/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.ExameFisicoDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.ExameFisicoBean;
import com.projetointegrador.physioevolui.builder.ExameFisicoBuilder;
import com.projetointegrador.physioevolui.service.ExameFisicoService;
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
public class ExameFisicoServiceImpl implements ExameFisicoService {

    @Autowired
    private ExameFisicoDAO exameFisicoDAO;

    @Autowired
    private ExameFisicoBuilder exameFisicoBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param exameFisicoBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ExameFisicoBean criarExameFisico(ExameFisicoBean exameFisicoBean) {
        try {
            return exameFisicoBuilder.montarExameFisicoBean(exameFisicoDAO.incluir(exameFisicoBuilder.montarExameFisicoEntity(exameFisicoBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarExameFisico(ExameFisicoBean exameFisicoBean){
        
        try {
            exameFisicoDAO.excluir(exameFisicoBean.getInt_id_exame_fisico());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(ExameFisicoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param exameFisicoBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ExameFisicoBean alterarExameFisico(ExameFisicoBean exameFisicoBean) {
        try {
            return exameFisicoBuilder.montarExameFisicoBean(exameFisicoDAO.alterar(exameFisicoBuilder.montarExameFisicoEntity(exameFisicoBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param exameFisicoBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public ExameFisicoBean buscarExameFisicoPorId(ExameFisicoBean exameFisicoBean) {
        try {
            exameFisicoBean = exameFisicoBuilder.montarExameFisicoBean(exameFisicoDAO.consultarPorId(exameFisicoBean.getInt_id_exame_fisico()));
            if (exameFisicoBean.getInt_id_exame_fisico()== null) {
              //  exameFisicoBean.getErroBean("Não encontrado");
            }
            return exameFisicoBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param exameFisicoBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<ExameFisicoBean> buscarExameFisicoPorString(ExameFisicoBean exameFisicoBean) {
        try {

            List<ExameFisicoBean> exameFisicoBeanList = exameFisicoBuilder.montarListExameFisicoBean(exameFisicoDAO.consultarPorString("str_palpacao_exame_fisico", exameFisicoBean.getStr_palpacao_exame_fisico()));

            if (exameFisicoBeanList.size() == 0) {
                throw new ExceptionTratada("ExameFisico não encontrado");
            }
            return exameFisicoBeanList;
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
    public List<ExameFisicoBean> listarExameFisico() {
        try {
            return exameFisicoBuilder.montarListExameFisicoBean(exameFisicoDAO.listar());
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
    private List<ExameFisicoBean> montarListaErro(ExceptionTratada e) {
        List<ExameFisicoBean> beans = new ArrayList<>();
        beans.add(new ExameFisicoBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<ExameFisicoBean> montarListaErro(Exception e) {
        List<ExameFisicoBean> beans = new ArrayList<>();
        beans.add(new ExameFisicoBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private ExameFisicoBean montarErro(Exception e) {
        return new ExameFisicoBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private ExameFisicoBean montarErro(ExceptionTratada e) {
        return new ExameFisicoBean(new ErroBean(true, e.getStackTrace()));
    }
}
