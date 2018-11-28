
package com.projetointegrador.physioevolui.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jonatas
 */


@Entity
@Table(name = "exame_fisico")
public class ExameFisicoEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_exame_fisico")
    private Integer int_id_exame_fisico;
    
    @Column(name = "int_escada_dor_lanns_exame_fisico")
    private Integer int_escada_dor_lanns_exame_fisico;
    
    @Column(name = "str_observacoes_eva_exame_fisico")
    private String str_observacoes_eva_exame_fisico;
    
    @Column(name = "str_inspecao_exame_fisico")
    private String str_inspecao_exame_fisico;
    
    @Column(name = "str_palpacao_exame_fisico")
    private String str_palpacao_exame_fisico;

    public ExameFisicoEntity() {
    }

    public ExameFisicoEntity(Integer int_id_exame_fisico, Integer int_escada_dor_lanns_exame_fisico, String str_observacoes_eva_exame_fisico, String str_inspecao_exame_fisico, String str_palpacao_exame_fisico) {
        this.int_id_exame_fisico = int_id_exame_fisico;
        this.int_escada_dor_lanns_exame_fisico = int_escada_dor_lanns_exame_fisico;
        this.str_observacoes_eva_exame_fisico = str_observacoes_eva_exame_fisico;
        this.str_inspecao_exame_fisico = str_inspecao_exame_fisico;
        this.str_palpacao_exame_fisico = str_palpacao_exame_fisico;
    }

    public Integer getInt_id_exame_fisico() {
        return int_id_exame_fisico;
    }

    public void setInt_id_exame_fisico(Integer int_id_exame_fisico) {
        this.int_id_exame_fisico = int_id_exame_fisico;
    }

    public Integer getInt_escada_dor_lanns_exame_fisico() {
        return int_escada_dor_lanns_exame_fisico;
    }

    public void setInt_escada_dor_lanns_exame_fisico(Integer int_escada_dor_lanns_exame_fisico) {
        this.int_escada_dor_lanns_exame_fisico = int_escada_dor_lanns_exame_fisico;
    }

    public String getStr_observacoes_eva_exame_fisico() {
        return str_observacoes_eva_exame_fisico;
    }

    public void setStr_observacoes_eva_exame_fisico(String str_observacoes_eva_exame_fisico) {
        this.str_observacoes_eva_exame_fisico = str_observacoes_eva_exame_fisico;
    }

    public String getStr_inspecao_exame_fisico() {
        return str_inspecao_exame_fisico;
    }

    public void setStr_inspecao_exame_fisico(String str_inspecao_exame_fisico) {
        this.str_inspecao_exame_fisico = str_inspecao_exame_fisico;
    }

    public String getStr_palpacao_exame_fisico() {
        return str_palpacao_exame_fisico;
    }

    public void setStr_palpacao_exame_fisico(String str_palpacao_exame_fisico) {
        this.str_palpacao_exame_fisico = str_palpacao_exame_fisico;
    }
    
    
    
}
