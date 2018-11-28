
package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */

@Component
public class ExameFisicoBean {
    
    private Integer int_id_exame_fisico;
    private Integer int_escada_dor_lanns_exame_fisico;
    private String str_observacoes_eva_exame_fisico;
    private String str_inspecao_exame_fisico;
    private String str_palpacao_exame_fisico;
    private ErroBean erroBean;

    public ExameFisicoBean() {
    }

    public ExameFisicoBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public ExameFisicoBean(Integer int_id_exame_fisico, Integer int_escada_dor_lanns_exame_fisico, String str_observacoes_eva_exame_fisico, String str_inspecao_exame_fisico, String str_palpacao_exame_fisico) {
        this.int_id_exame_fisico = int_id_exame_fisico;
        this.int_escada_dor_lanns_exame_fisico = int_escada_dor_lanns_exame_fisico;
        this.str_observacoes_eva_exame_fisico = str_observacoes_eva_exame_fisico;
        this.str_inspecao_exame_fisico = str_inspecao_exame_fisico;
        this.str_palpacao_exame_fisico = str_palpacao_exame_fisico;
    }
    
    
     public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }
    
    
     public ExameFisicoBean(Integer int_id_exame_fisico) {
     this.int_id_exame_fisico = int_id_exame_fisico;
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
