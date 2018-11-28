
package com.projetointegrador.physioevolui.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * @author Jonatas
 */
@Entity
@Table(name = "apv_lateral")
public class ApvLateralEntity {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_apv_lateral")
    private Integer int_id_apv_lateral;
    
    @Column(name = "str_coluna_cervical_apv_lateral")
    private String str_coluna_cervical_apv_lateral;
    
    @Column(name = "str_coluna_toracica_apv_lateral")
    private String str_coluna_toracica_apv_lateral;
    
    @Column(name = "str_coluna_lombar_apv_lateral")
    private String str_coluna_lombar_apv_lateral;
    
    @Column(name = "str_quadril_apv_lateral")
    private String str_quadril_apv_lateral;
    
    @Column(name = "str_joelhos_apv_lateral")
    private String str_joelhos_apv_lateral;
    
    @Column(name = "str_angulo_tibia_tarsico_apv_lateral")
    private String str_angulo_tibia_tarsico_apv_lateral;
    

    @JsonIgnore
    @OneToMany(mappedBy = "int_avaliacao_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = AvaliacaoEntity.class)
    private Collection<AvaliacaoEntity> avaliacaoEntities;

    public ApvLateralEntity() {
    }

    public ApvLateralEntity(Integer int_id_apv_lateral, String str_coluna_cervical_apv_lateral, String str_coluna_toracica_apv_lateral, String str_coluna_lombar_apv_lateral, String str_quadril_apv_lateral, String str_joelhos_apv_lateral, String str_angulo_tibia_tarsico_apv_lateral, Collection<AvaliacaoEntity> avaliacaoEntities) {
        this.int_id_apv_lateral = int_id_apv_lateral;
        this.str_coluna_cervical_apv_lateral = str_coluna_cervical_apv_lateral;
        this.str_coluna_toracica_apv_lateral = str_coluna_toracica_apv_lateral;
        this.str_coluna_lombar_apv_lateral = str_coluna_lombar_apv_lateral;
        this.str_quadril_apv_lateral = str_quadril_apv_lateral;
        this.str_joelhos_apv_lateral = str_joelhos_apv_lateral;
        this.str_angulo_tibia_tarsico_apv_lateral = str_angulo_tibia_tarsico_apv_lateral;
        this.avaliacaoEntities = avaliacaoEntities;
    }

    public Integer getInt_id_apv_lateral() {
        return int_id_apv_lateral;
    }

    public void setInt_id_apv_lateral(Integer int_id_apv_lateral) {
        this.int_id_apv_lateral = int_id_apv_lateral;
    }

    public String getStr_coluna_cervical_apv_lateral() {
        return str_coluna_cervical_apv_lateral;
    }

    public void setStr_coluna_cervical_apv_lateral(String str_coluna_cervical_apv_lateral) {
        this.str_coluna_cervical_apv_lateral = str_coluna_cervical_apv_lateral;
    }

    public String getStr_coluna_toracica_apv_lateral() {
        return str_coluna_toracica_apv_lateral;
    }

    public void setStr_coluna_toracica_apv_lateral(String str_coluna_toracica_apv_lateral) {
        this.str_coluna_toracica_apv_lateral = str_coluna_toracica_apv_lateral;
    }

    public String getStr_coluna_lombar_apv_lateral() {
        return str_coluna_lombar_apv_lateral;
    }

    public void setStr_coluna_lombar_apv_lateral(String str_coluna_lombar_apv_lateral) {
        this.str_coluna_lombar_apv_lateral = str_coluna_lombar_apv_lateral;
    }

    public String getStr_quadril_apv_lateral() {
        return str_quadril_apv_lateral;
    }

    public void setStr_quadril_apv_lateral(String str_quadril_apv_lateral) {
        this.str_quadril_apv_lateral = str_quadril_apv_lateral;
    }

    public String getStr_joelhos_apv_lateral() {
        return str_joelhos_apv_lateral;
    }

    public void setStr_joelhos_apv_lateral(String str_joelhos_apv_lateral) {
        this.str_joelhos_apv_lateral = str_joelhos_apv_lateral;
    }

    public String getStr_angulo_tibia_tarsico_apv_lateral() {
        return str_angulo_tibia_tarsico_apv_lateral;
    }

    public void setStr_angulo_tibia_tarsico_apv_lateral(String str_angulo_tibia_tarsico_apv_lateral) {
        this.str_angulo_tibia_tarsico_apv_lateral = str_angulo_tibia_tarsico_apv_lateral;
    }

    public Collection<AvaliacaoEntity> getAvaliacaoEntities() {
        return avaliacaoEntities;
    }

    public void setAvaliacaoEntities(Collection<AvaliacaoEntity> avaliacaoEntities) {
        this.avaliacaoEntities = avaliacaoEntities;
    }
    
    
}
