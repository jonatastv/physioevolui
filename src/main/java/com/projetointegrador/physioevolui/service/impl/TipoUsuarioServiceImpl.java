/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.TipoUsuarioDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.TipoUsuarioBean;
import com.projetointegrador.physioevolui.builder.TipoUsuarioBuilder;
import com.projetointegrador.physioevolui.service.TipoUsuarioService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@Transactional
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

    @Autowired
    private TipoUsuarioDAO tipoUsuarioDAO;

    @Autowired
    private TipoUsuarioBuilder tipoUsuarioBuilder;

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public TipoUsuarioBean criarTipoUsuario(TipoUsuarioBean tipoUsuarioBean){
        try {
            return tipoUsuarioBuilder.montarTipoUsuarioBean(tipoUsuarioDAO.incluir(tipoUsuarioBuilder.montarTipoUsuarioEntity(tipoUsuarioBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
     @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
     public void deletarTipoUsuario(TipoUsuarioBean tipoUsuarioBean){
        
        try {
            tipoUsuarioDAO.excluir(tipoUsuarioBean.getInt_tipo_usuario_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(TipoUsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public TipoUsuarioBean alterarTipoUsuario(TipoUsuarioBean tipoUsuarioBean){
        try {
            return tipoUsuarioBuilder.montarTipoUsuarioBean(tipoUsuarioDAO.alterar(tipoUsuarioBuilder.montarTipoUsuarioEntity(tipoUsuarioBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public TipoUsuarioBean buscarTipoUsuarioPorId(TipoUsuarioBean tipoUsuarioBean) {
        try {
            tipoUsuarioBean = tipoUsuarioBuilder.montarTipoUsuarioBean(tipoUsuarioDAO.consultarPorId(tipoUsuarioBean.getInt_tipo_usuario_id()));
            if (tipoUsuarioBean.getStr_desc_usuario() == null){
                tipoUsuarioBean.setStr_desc_usuario("Não encontrado");
            }
            return tipoUsuarioBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.REQUIRED)
    public List<TipoUsuarioBean> buscarTipoUsuarioPorString(TipoUsuarioBean tipoUsuarioBean) {
        try {

            List<TipoUsuarioBean> usuarioBeanList = tipoUsuarioBuilder.montarListTipoUsuarioBean(tipoUsuarioDAO.consultarPorString("str_desc_usuario",tipoUsuarioBean.getStr_desc_usuario()));

            if (tipoUsuarioBean.getStr_desc_usuario() == null){
                tipoUsuarioBean.setStr_desc_usuario("Não encontrado");
            }

            return usuarioBeanList;

        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public List<TipoUsuarioBean> listarTiposUsuarios() {
        try {
            return tipoUsuarioBuilder.montarListTipoUsuarioBean(tipoUsuarioDAO.listar());
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    private List<TipoUsuarioBean> montarListaErro(Exception e) {
        List<TipoUsuarioBean> beans = new ArrayList<>();
        beans.add(new TipoUsuarioBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    private TipoUsuarioBean montarErro(Exception e) {
        return new TipoUsuarioBean(new ErroBean(true, e.getStackTrace()));
    }
}
