/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.DAO;

import com.projetointegrador.physioevolui.entity.UsuarioEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface UsuarioDAO extends GenericoDAO<UsuarioEntity, Integer> {
       
        @Transactional(readOnly=true)
	UsuarioEntity findByStr_login(String str_login);

}
