/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.TipoUsuarioBean;

import java.util.List;

public interface TipoUsuarioService {

    TipoUsuarioBean criarTipoUsuario(TipoUsuarioBean tipoUsuarioBean);

    TipoUsuarioBean alterarTipoUsuario(TipoUsuarioBean tipoUsuarioBean);

    TipoUsuarioBean buscarTipoUsuarioPorId(TipoUsuarioBean tipoUsuarioBean);

    List<TipoUsuarioBean> buscarTipoUsuarioPorString(TipoUsuarioBean tipoUsuarioBean);

    List<TipoUsuarioBean> listarTiposUsuarios();
}
