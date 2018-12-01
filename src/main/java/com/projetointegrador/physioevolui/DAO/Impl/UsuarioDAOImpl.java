/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.DAO.Impl;

import com.projetointegrador.physioevolui.DAO.UsuarioDAO;
import com.projetointegrador.physioevolui.entity.UsuarioEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UsuarioDAOImpl extends GenericoDAOImpl<UsuarioEntity, Integer> implements UsuarioDAO{

    @Override
    public UsuarioEntity findByStr_login(String str_login) {
        
        throw new UnsupportedOperationException("deu ruim aqui."); //To change body of generated methods, choose Tools | Templates.
    }

 

}

