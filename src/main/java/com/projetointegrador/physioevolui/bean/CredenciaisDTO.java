/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.bean;

import java.io.Serializable;

/**
 *
 * @author Mauro
 */

public class CredenciaisDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String str_login;
	private String senha;
	
	public CredenciaisDTO() {
	}
	
	public String getStr_login() {
		return str_login;
	}
	public void setStr_login(String str_login) {
		this.str_login = str_login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}