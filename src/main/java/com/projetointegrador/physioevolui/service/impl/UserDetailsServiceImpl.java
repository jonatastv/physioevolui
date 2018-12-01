/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.UsuarioDAO;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.entity.UsuarioEntity;
import com.projetointegrador.physioevolui.security.UserSS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonatas
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioDAO dao;
    
    @Override
    public UserDetails loadUserByUsername(String str_login) throws UsernameNotFoundException {
        
      UsuarioEntity usu = dao.findByStr_login(str_login);
		if (usu == null) {
			throw new UsernameNotFoundException(str_login);
		}
                
		return new UserSS(usu.getInt_usuario_id(), usu.getStr_login(), usu.getStr_password(), usu.getPerfis());

    }
    
     
}
