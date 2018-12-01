/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;


import com.projetointegrador.physioevolui.bean.UsuarioBean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collection;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetointegrador.physioevolui.enums.Perfil;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * classe utilzada para mapear o banco no hibernate
 */
@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_usuario_id")
    private Integer int_usuario_id;

    @Column(name = "str_login", nullable = false, length = 80)
    private String str_login;

    @JsonIgnore
    @Column(name = "str_password", nullable = false, length = 80)
    private String str_password;
    
    @Column(name = "str_email", nullable = false, length = 100)
    private String str_email;
    
    
    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="PERFIS")
    private Set<Integer> perfis = new HashSet<>();
    
    /**
     * mapeando registro 1-n
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_tipo_usuario_id", referencedColumnName = "int_tipo_usuario_id", nullable = false)
    private TipoUsuarioEntity tipoUsuarioEntity;
    /**
     * mapeando registro 1-1
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_fisioterapeuta_id", referencedColumnName = "int_fisioterapeuta_id", nullable = true)
    private FisioterapeutaEntity fisioterapeutaEntity;

    public UsuarioEntity() {
        addPerfil(Perfil.CLIENTE);
    }

    public UsuarioEntity(String str_login, String str_password, TipoUsuarioEntity tipoUsuarioEntity, FisioterapeutaEntity fisioterapeutaEntity , String str_email) {
        this.str_login = str_login;
        this.str_password = str_password;
        this.tipoUsuarioEntity = tipoUsuarioEntity;
        this.fisioterapeutaEntity = fisioterapeutaEntity;
        this.str_email = str_email;
        addPerfil(Perfil.CLIENTE);
    }

    public FisioterapeutaEntity getFisioterapeutaEntity() {
        return fisioterapeutaEntity;
    }

    public void setFisioterapeutaEntity(FisioterapeutaEntity fisioterapeutaEntity) {
        this.fisioterapeutaEntity = fisioterapeutaEntity;
    }

    public Integer getInt_usuario_id() {
        return int_usuario_id;
    }

    public void setInt_usuario_id(Integer int_usuario_id) {
        this.int_usuario_id = int_usuario_id;
    }

    public String getStr_login() {
        return str_login;
    }

    public void setStr_login(String str_login) {
        this.str_login = str_login;
    }

    public String getStr_password() {
        return str_password;
    }

    public void setStr_password(String str_password) {
        this.str_password = str_password;
    }

    public TipoUsuarioEntity getTipoUsuarioEntity() {
        return tipoUsuarioEntity;
    }

    public void setTipoUsuarioEntity(TipoUsuarioEntity tipoUsuarioEntity) {
        this.tipoUsuarioEntity = tipoUsuarioEntity;
    }

    public String getStr_email() {
        return str_email;
    }

    public void setStr_email(String str_email) {
        this.str_email = str_email;
    }
    
    
    	public Set<Perfil> getPerfis() {
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}
	
	public void addPerfil(Perfil perfil) {
		perfis.add(perfil.getCod());
	}
    
}
