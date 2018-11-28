/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_avaliacao_id")
    private Integer int_avaliacao_id;
   

   
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_fisioterapeuta_id", referencedColumnName = "int_fisioterapeuta_id", nullable = false)
    private FisioterapeutaEntity fisioterapeutaEntity;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "avaliacaoposturalvistaposterior_id", referencedColumnName = "avaliacaoposturalvistaposterior_id", nullable = false)
    private AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity;
    
  /*  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "int_id_tipo_marcha", referencedColumnName = "int_id_tipo_marcha", nullable = false)
    private TipoMarchaEntity tipoMarchaEntity;
*/
  /*  public AvaliacaoEntity(Integer int_avaliacao_id, FisioterapeutaEntity fisioterapeutaEntity, AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity, TipoMarchaEntity tipoMarchaEntity) {
        this.int_avaliacao_id = int_avaliacao_id;
        this.fisioterapeutaEntity = fisioterapeutaEntity;
        this.avaliacaoPosturalVistaPosteriorEntity = avaliacaoPosturalVistaPosteriorEntity;
        this.tipoMarchaEntity = tipoMarchaEntity;
    }
    */
    

    public AvaliacaoEntity() {
    }

    public AvaliacaoEntity(Integer int_avaliacao_id, FisioterapeutaEntity fisioterapeutaEntity, AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity) {
        this.int_avaliacao_id = int_avaliacao_id;
        this.fisioterapeutaEntity = fisioterapeutaEntity;
        this.avaliacaoPosturalVistaPosteriorEntity = avaliacaoPosturalVistaPosteriorEntity;
    }

    public Integer getInt_avaliacao_id() {
        return int_avaliacao_id;
    }

    public void setInt_avaliacao_id(Integer int_avaliacao_id) {
        this.int_avaliacao_id = int_avaliacao_id;
    }

    public FisioterapeutaEntity getFisioterapeutaEntity() {
        return fisioterapeutaEntity;
    }

    public void setFisioterapeutaEntity(FisioterapeutaEntity fisioterapeutaEntity) {
        this.fisioterapeutaEntity = fisioterapeutaEntity;
    }

    public AvaliacaoPosturalVistaPosteriorEntity getAvaliacaoPosturalVistaPosteriorEntity() {
        return avaliacaoPosturalVistaPosteriorEntity;
    }

    public void setAvaliacaoPosturalVistaPosteriorEntity(AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity) {
        this.avaliacaoPosturalVistaPosteriorEntity = avaliacaoPosturalVistaPosteriorEntity;
    }

   /* public TipoMarchaEntity getTipoMarchaEntity() {
        return tipoMarchaEntity;
    }

    public void setTipoMarchaEntity(TipoMarchaEntity tipoMarchaEntity) {
        this.tipoMarchaEntity = tipoMarchaEntity;
    }
    */
    
    
   
}
