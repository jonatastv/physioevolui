/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.DAO.Impl;

import com.projetointegrador.physioevolui.DAO.UsuarioDAO;
import com.projetointegrador.physioevolui.entity.UsuarioEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOImpl extends GenericoDAOImpl<UsuarioEntity, Integer> implements UsuarioDAO{
}

