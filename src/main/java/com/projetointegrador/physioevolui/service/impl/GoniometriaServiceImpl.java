/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.GoniometriaDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.GoniometriaBean;
import com.projetointegrador.physioevolui.builder.GoniometriaBuilder;
import com.projetointegrador.physioevolui.service.GoniometriaService;
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
public class GoniometriaServiceImpl implements GoniometriaService {

    @Autowired
    private GoniometriaDAO goniometriaDAO;

    @Autowired
    private GoniometriaBuilder goniometriaBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param goniometriaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public GoniometriaBean criarGoniometria(GoniometriaBean goniometriaBean) {
        try {
            return goniometriaBuilder.montarGoniometriaBean(goniometriaDAO.incluir(goniometriaBuilder.montarGoniometriaEntity(goniometriaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarGoniometria(GoniometriaBean goniometriaBean){
        
        try {
            goniometriaDAO.excluir(goniometriaBean.getInt_id_goniometria());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(GoniometriaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param goniometriaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public GoniometriaBean alterarGoniometria(GoniometriaBean goniometriaBean) {
        try {
            return goniometriaBuilder.montarGoniometriaBean(goniometriaDAO.alterar(goniometriaBuilder.montarGoniometriaEntity(goniometriaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param goniometriaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public GoniometriaBean buscarGoniometriaPorId(GoniometriaBean goniometriaBean) {
        try {
            goniometriaBean = goniometriaBuilder.montarGoniometriaBean(goniometriaDAO.consultarPorId(goniometriaBean.getInt_id_goniometria()));
            if (goniometriaBean.getInt_id_goniometria()== null) {
              //  goniometriaBean.getErroBean("Não encontrado");
            }
            return goniometriaBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param goniometriaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<GoniometriaBean> buscarGoniometriaPorString(GoniometriaBean goniometriaBean) {
        try {

            List<GoniometriaBean> goniometriaBeanList = goniometriaBuilder.montarListGoniometriaBean(goniometriaDAO.consultarPorString("1", "1"));

            if (goniometriaBeanList.size() == 0) {
                throw new ExceptionTratada("Goniometria não encontrado");
            }
            return goniometriaBeanList;
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
    public List<GoniometriaBean> listarGoniometria() {
        try {
            return goniometriaBuilder.montarListGoniometriaBean(goniometriaDAO.listar());
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
    private List<GoniometriaBean> montarListaErro(ExceptionTratada e) {
        List<GoniometriaBean> beans = new ArrayList<>();
        beans.add(new GoniometriaBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<GoniometriaBean> montarListaErro(Exception e) {
        List<GoniometriaBean> beans = new ArrayList<>();
        beans.add(new GoniometriaBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private GoniometriaBean montarErro(Exception e) {
        return new GoniometriaBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private GoniometriaBean montarErro(ExceptionTratada e) {
        return new GoniometriaBean(new ErroBean(true, e.getStackTrace()));
    }
}
