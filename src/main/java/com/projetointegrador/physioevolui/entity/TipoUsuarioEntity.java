/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_tipo_usuario_id")
    private Integer int_tipo_usuario_id;

    @Column(name = "int_tipo_usuario", nullable = false, length = 1)
    private Integer int_tipo_usuario;

    @Column(name = "str_desc_usuario", nullable = false, length = 80)
    private String str_desc_usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoUsuarioEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = UsuarioEntity.class)
    private Collection<UsuarioEntity> usuarioEntities;


    public TipoUsuarioEntity() {
    }

    public TipoUsuarioEntity(Integer int_tipo_usuario, String str_desc_usuario) {
        this.int_tipo_usuario = int_tipo_usuario;
        this.str_desc_usuario = str_desc_usuario;
    }

    public Collection<UsuarioEntity> getUsuarioEntities() {
        return usuarioEntities;
    }

    public void setUsuarioEntities(Collection<UsuarioEntity> usuarioEntities) {
        this.usuarioEntities = usuarioEntities;
    }

    public Integer getInt_tipo_usuario_id() {
        return int_tipo_usuario_id;
    }

    public void setInt_tipo_usuario_id(Integer usuario_id) {
        this.int_tipo_usuario_id = usuario_id;
    }

    public Integer getInt_tipo_usuario() {
        return int_tipo_usuario;
    }

    public void setInt_tipo_usuario(Integer tipo_usuario) {
        this.int_tipo_usuario = tipo_usuario;
    }

    public String getStr_desc_usuario() {
        return str_desc_usuario;
    }

    public void setStr_desc_usuario(String desc_usuario) {
        this.str_desc_usuario = desc_usuario;
    }
}
