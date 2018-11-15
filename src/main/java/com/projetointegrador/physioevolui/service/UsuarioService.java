/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service;

import com.projetointegrador.physioevolui.bean.UsuarioBean;

import java.util.List;

public interface UsuarioService {

    UsuarioBean criarUsuario(UsuarioBean usuarioBean);

    UsuarioBean alterarUsuario(UsuarioBean usuarioBean);

    UsuarioBean buscarUsuarioPorId(UsuarioBean usuarioBean);

    List<UsuarioBean> buscarUsuarioPorString(UsuarioBean usuarioBean);

    List<UsuarioBean> listarUsuarios();

}
