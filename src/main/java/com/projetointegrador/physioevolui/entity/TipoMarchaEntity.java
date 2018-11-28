/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mauro
 */

@Entity
@Table(name = "tipo_marcha")
public class TipoMarchaEntity implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_tipo_marcha")
    private Integer int_id_tipo_marcha;
    
    @Column(name = "str_tipo_marcha_tipo_marcha")
    private String str_tipo_marcha_tipo_marcha;
    
    @Column(name = "str_arquivo_tipo_marcha")
    private String str_arquivo_tipo_marcha;
    
  /*  @JsonIgnore
    @OneToMany(mappedBy = "int_avaliacao_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = AvaliacaoEntity.class)
    private Collection<AvaliacaoEntity> avaliacaoEntities;
*/
    public TipoMarchaEntity() {
    }

    public TipoMarchaEntity(Integer int_id_tipo_marcha, String str_tipo_marcha_tipo_marcha, String str_arquivo_tipo_marcha) {
        this.int_id_tipo_marcha = int_id_tipo_marcha;
        this.str_tipo_marcha_tipo_marcha = str_tipo_marcha_tipo_marcha;
        this.str_arquivo_tipo_marcha = str_arquivo_tipo_marcha;
    }

    public Integer getInt_id_tipo_marcha() {
        return int_id_tipo_marcha;
    }

    public void setInt_id_tipo_marcha(Integer int_id_tipo_marcha) {
        this.int_id_tipo_marcha = int_id_tipo_marcha;
    }

    public String getStr_tipo_marcha_tipo_marcha() {
        return str_tipo_marcha_tipo_marcha;
    }

    public void setStr_tipo_marcha_tipo_marcha(String str_tipo_marcha_tipo_marcha) {
        this.str_tipo_marcha_tipo_marcha = str_tipo_marcha_tipo_marcha;
    }

    public String getStr_arquivo_tipo_marcha() {
        return str_arquivo_tipo_marcha;
    }

    public void setStr_arquivo_tipo_marcha(String str_arquivo_tipo_marcha) {
        this.str_arquivo_tipo_marcha = str_arquivo_tipo_marcha;
    }
/*
    public Collection<AvaliacaoEntity> getAvaliacaoEntities() {
        return avaliacaoEntities;
    }

    public void setAvaliacaoEntities(Collection<AvaliacaoEntity> avaliacaoEntities) {
        this.avaliacaoEntities = avaliacaoEntities;
    }
    
  */  
    
    
    
}
