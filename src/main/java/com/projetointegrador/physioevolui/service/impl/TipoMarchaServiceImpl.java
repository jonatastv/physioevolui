/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.TipoMarchaDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.TipoMarchaBean;
import com.projetointegrador.physioevolui.builder.TipoMarchaBuilder;
import com.projetointegrador.physioevolui.service.TipoMarchaService;
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
public class TipoMarchaServiceImpl implements TipoMarchaService {

    @Autowired
    private TipoMarchaDAO tipoMarchaDAO;

    @Autowired
    private TipoMarchaBuilder tipoMarchaBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param tipoMarchaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public TipoMarchaBean criarTipoMarcha(TipoMarchaBean tipoMarchaBean) {
        try {
            return tipoMarchaBuilder.montarTipoMarchaBean(tipoMarchaDAO.incluir(tipoMarchaBuilder.montarTipoMarchaEntity(tipoMarchaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
     @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarTipoMarcha(TipoMarchaBean tipoMarchaBean){
        
        try {
            tipoMarchaDAO.excluir(tipoMarchaBean.getInt_id_tipo_marcha());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(TipoMarchaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param tipoMarchaBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public TipoMarchaBean alterarTipoMarcha(TipoMarchaBean tipoMarchaBean) {
        try {
            return tipoMarchaBuilder.montarTipoMarchaBean(tipoMarchaDAO.alterar(tipoMarchaBuilder.montarTipoMarchaEntity(tipoMarchaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param tipoMarchaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public TipoMarchaBean buscarTipoMarchaPorId(TipoMarchaBean tipoMarchaBean) {
        try {
            tipoMarchaBean = tipoMarchaBuilder.montarTipoMarchaBean(tipoMarchaDAO.consultarPorId(tipoMarchaBean.getInt_id_tipo_marcha()));
            if (tipoMarchaBean.getInt_id_tipo_marcha()== null) {
              //  tipoMarchaBean.getErroBean("Não encontrado");
            }
            return tipoMarchaBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param tipoMarchaBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<TipoMarchaBean> buscarTipoMarchaPorString(TipoMarchaBean tipoMarchaBean) {
        try {

            List<TipoMarchaBean> tipoMarchaBeanList = tipoMarchaBuilder.montarListTipoMarchaBean(tipoMarchaDAO.consultarPorString("str_tipo_marcha_tipo_marcha", tipoMarchaBean.getStr_tipo_marcha_tipo_marcha()));

            if (tipoMarchaBeanList.size() == 0) {
                throw new ExceptionTratada("TipoMarcha não encontrado");
            }
            return tipoMarchaBeanList;
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
    public List<TipoMarchaBean> listarTipoMarcha() {
        try {
            return tipoMarchaBuilder.montarListTipoMarchaBean(tipoMarchaDAO.listar());
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
    private List<TipoMarchaBean> montarListaErro(ExceptionTratada e) {
        List<TipoMarchaBean> beans = new ArrayList<>();
        beans.add(new TipoMarchaBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<TipoMarchaBean> montarListaErro(Exception e) {
        List<TipoMarchaBean> beans = new ArrayList<>();
        beans.add(new TipoMarchaBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private TipoMarchaBean montarErro(Exception e) {
        return new TipoMarchaBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private TipoMarchaBean montarErro(ExceptionTratada e) {
        return new TipoMarchaBean(new ErroBean(true, e.getStackTrace()));
    }
}
