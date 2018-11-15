/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.UsuarioDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.UsuarioBuilder;
import com.projetointegrador.physioevolui.service.UsuarioService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * classe responsável pela implementação das regras de negócio da aplicação
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private UsuarioBuilder usuarioBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param usuarioBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UsuarioBean criarUsuario(UsuarioBean usuarioBean) {
        try {
            return usuarioBuilder.montarUsuarioBean(usuarioDAO.incluir(usuarioBuilder.montarUsuarioEntity(usuarioBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param usuarioBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UsuarioBean alterarUsuario(UsuarioBean usuarioBean) {
        try {
            return usuarioBuilder.montarUsuarioBean(usuarioDAO.alterar(usuarioBuilder.montarUsuarioEntity(usuarioBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param usuarioBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public UsuarioBean buscarUsuarioPorId(UsuarioBean usuarioBean) {
        try {
            usuarioBean = usuarioBuilder.montarUsuarioBean(usuarioDAO.consultarPorId(usuarioBean.getInt_usuario_id()));
            if (usuarioBean.getStr_login() == null) {
                usuarioBean.setStr_login("Não encontrado");
            }
            return usuarioBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param usuarioBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<UsuarioBean> buscarUsuarioPorString(UsuarioBean usuarioBean) {
        try {

            List<UsuarioBean> usuarioBeanList = usuarioBuilder.montarListUsuarioBean(usuarioDAO.consultarPorString("str_login", usuarioBean.getStr_login()));

            if (usuarioBeanList.size() == 0) {
                throw new ExceptionTratada("Usuario não encontrado");
            }
            return usuarioBeanList;
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
    public List<UsuarioBean> listarUsuarios() {
        try {
            return usuarioBuilder.montarListUsuarioBean(usuarioDAO.listar());
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
    private List<UsuarioBean> montarListaErro(ExceptionTratada e) {
        List<UsuarioBean> beans = new ArrayList<>();
        beans.add(new UsuarioBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<UsuarioBean> montarListaErro(Exception e) {
        List<UsuarioBean> beans = new ArrayList<>();
        beans.add(new UsuarioBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private UsuarioBean montarErro(Exception e) {
        return new UsuarioBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private UsuarioBean montarErro(ExceptionTratada e) {
        return new UsuarioBean(new ErroBean(true, e.getStackTrace()));
    }
}
