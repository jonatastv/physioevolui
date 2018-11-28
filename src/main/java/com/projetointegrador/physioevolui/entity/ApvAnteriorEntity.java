
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
 * @author Jonatas
 */
@Entity
@Table(name = "apv_anterior")
public class ApvAnteriorEntity implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_apv_anterior")
    private Integer int_id_apv_anterior;
    
    @Column(name = "str_cabeca_apv_anterior")
    private String str_cabeca_apv_anterior;
    
    @Column(name = "str_ombro_apv_anterior")
    private String str_ombro_apv_anterior;
    
    @Column(name = "str_clavicula_apv_anterior")
    private String str_clavicula_apv_anterior;
    
    @Column(name = "str_angulo_tales_apv_anterior")
    private String str_angulo_tales_apv_anterior;
    
    @Column(name = "str_espinha_iliaca_antero_superior_apv_anterior")
    private String str_espinha_iliaca_antero_superior_apv_anterior;
    
    @Column(name = "str_joelho_apv_anterior")
    private String str_joelho_apv_anterior;
    
    @Column(name = "str_patela_apv_anterior")
    private String str_patela_apv_anterior;
    
    @Column(name = "str_tornozelo_pe_apv_anterior")
    private String str_tornozelo_pe_apv_anterior;
    
    @JsonIgnore
    @OneToMany(mappedBy = "int_avaliacao_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = AvaliacaoEntity.class)
    private Collection<AvaliacaoEntity> avaliacaoEntities;

    public ApvAnteriorEntity() {
    }

    public ApvAnteriorEntity(Integer int_id_apv_anterior, String str_cabeca_apv_anterior, String str_ombro_apv_anterior, String str_clavicula_apv_anterior, String str_angulo_tales_apv_anterior, String str_espinha_iliaca_antero_superior_apv_anterior, String str_joelho_apv_anterior, String str_patela_apv_anterior, String str_tornozelo_pe_apv_anterior) {
        this.int_id_apv_anterior = int_id_apv_anterior;
        this.str_cabeca_apv_anterior = str_cabeca_apv_anterior;
        this.str_ombro_apv_anterior = str_ombro_apv_anterior;
        this.str_clavicula_apv_anterior = str_clavicula_apv_anterior;
        this.str_angulo_tales_apv_anterior = str_angulo_tales_apv_anterior;
        this.str_espinha_iliaca_antero_superior_apv_anterior = str_espinha_iliaca_antero_superior_apv_anterior;
        this.str_joelho_apv_anterior = str_joelho_apv_anterior;
        this.str_patela_apv_anterior = str_patela_apv_anterior;
        this.str_tornozelo_pe_apv_anterior = str_tornozelo_pe_apv_anterior;
        
    }

    public Collection<AvaliacaoEntity> getUsuarioEntities() {
        return avaliacaoEntities;
    }

    public void setAvaliacaoEntities(Collection<AvaliacaoEntity> avaliacaoEntities) {
        this.avaliacaoEntities = avaliacaoEntities;     
    
    }

    public int getInt_id_apv_anterior() {
        return int_id_apv_anterior;
    }

    public void setInt_id_apv_anterior(Integer int_id_apv_anterior) {
        this.int_id_apv_anterior = int_id_apv_anterior;
    }

    public String getStr_cabeca_apv_anterior() {
        return str_cabeca_apv_anterior;
    }

    public void setStr_cabeca_apv_anterior(String str_cabeca_apv_anterior) {
        this.str_cabeca_apv_anterior = str_cabeca_apv_anterior;
    }

    public String getStr_ombro_apv_anterior() {
        return str_ombro_apv_anterior;
    }

    public void setStr_ombro_apv_anterior(String str_ombro_apv_anterior) {
        this.str_ombro_apv_anterior = str_ombro_apv_anterior;
    }

    public String getStr_clavicula_apv_anterior() {
        return str_clavicula_apv_anterior;
    }

    public void setStr_clavicula_apv_anterior(String str_clavicula_apv_anterior) {
        this.str_clavicula_apv_anterior = str_clavicula_apv_anterior;
    }

    public String getStr_angulo_tales_apv_anterior() {
        return str_angulo_tales_apv_anterior;
    }

    public void setStr_angulo_tales_apv_anterior(String str_angulo_tales_apv_anterior) {
        this.str_angulo_tales_apv_anterior = str_angulo_tales_apv_anterior;
    }

    public String getStr_espinha_iliaca_antero_superior_apv_anterior() {
        return str_espinha_iliaca_antero_superior_apv_anterior;
    }

    public void setStr_espinha_iliaca_antero_superior_apv_anterior(String str_espinha_iliaca_antero_superior_apv_anterior) {
        this.str_espinha_iliaca_antero_superior_apv_anterior = str_espinha_iliaca_antero_superior_apv_anterior;
    }

    public String getStr_joelho_apv_anterior() {
        return str_joelho_apv_anterior;
    }

    public void setStr_joelho_apv_anterior(String str_joelho_apv_anterior) {
        this.str_joelho_apv_anterior = str_joelho_apv_anterior;
    }

    public String getStr_patela_apv_anterior() {
        return str_patela_apv_anterior;
    }

    public void setStr_patela_apv_anterior(String str_patela_apv_anterior) {
        this.str_patela_apv_anterior = str_patela_apv_anterior;
    }

    public String getStr_tornozelo_pe_apv_anterior() {
        return str_tornozelo_pe_apv_anterior;
    }

    public void setStr_tornozelo_pe_apv_anterior(String str_tornozelo_pe_apv_anterior) {
        this.str_tornozelo_pe_apv_anterior = str_tornozelo_pe_apv_anterior;
    }
    
  }
