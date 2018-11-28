
package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class PerimetriaBean {
    
    private Integer int_id_perimetria;
    private Integer int_braco_perimetria;
    private Integer int_antebraco_perimetria;
    private Integer int_punho_mao_perimetria;
    private Integer int_coxa_perimetria;
    private Integer int_perna_perimetria;
    private Integer int_tornozelo_pe_perimetria;
    private ErroBean erroBean;
    
    
    public PerimetriaBean() {
    }

    public PerimetriaBean(Integer int_id_perimetria, Integer int_braco_perimetria, Integer int_antebraco_perimetria, Integer int_punho_mao_perimetria, Integer int_coxa_perimetria, Integer int_perna_perimetria, Integer int_tornozelo_pe_perimetria, ErroBean erroBean) {
        this.int_id_perimetria = int_id_perimetria;
        this.int_braco_perimetria = int_braco_perimetria;
        this.int_antebraco_perimetria = int_antebraco_perimetria;
        this.int_punho_mao_perimetria = int_punho_mao_perimetria;
        this.int_coxa_perimetria = int_coxa_perimetria;
        this.int_perna_perimetria = int_perna_perimetria;
        this.int_tornozelo_pe_perimetria = int_tornozelo_pe_perimetria;
        this.erroBean = erroBean;
    }

    public PerimetriaBean(Integer int_id_perimetria) {
         this.int_id_perimetria = int_id_perimetria;
    }

    public Integer getInt_id_perimetria() {
        return int_id_perimetria;
    }

    public void setInt_id_perimetria(Integer int_id_perimetria) {
        this.int_id_perimetria = int_id_perimetria;
    }

    public int getInt_braco_perimetria() {
        return int_braco_perimetria;
    }

    public void setInt_braco_perimetria(Integer int_braco_perimetria) {
        this.int_braco_perimetria = int_braco_perimetria;
    }

    public int getInt_antebraco_perimetria() {
        return int_antebraco_perimetria;
    }

    public void setInt_antebraco_perimetria(Integer int_antebraco_perimetria) {
        this.int_antebraco_perimetria = int_antebraco_perimetria;
    }

    public int getInt_punho_mao_perimetria() {
        return int_punho_mao_perimetria;
    }

    public void setInt_punho_mao_perimetria(Integer int_punho_mao_perimetria) {
        this.int_punho_mao_perimetria = int_punho_mao_perimetria;
    }

    public int getInt_coxa_perimetria() {
        return int_coxa_perimetria;
    }

    public void setInt_coxa_perimetria(Integer int_coxa_perimetria) {
        this.int_coxa_perimetria = int_coxa_perimetria;
    }

    public int getInt_perna_perimetria() {
        return int_perna_perimetria;
    }

    public void setInt_perna_perimetria(Integer int_perna_perimetria) {
        this.int_perna_perimetria = int_perna_perimetria;
    }

    public int getInt_tornozelo_pe_perimetria() {
        return int_tornozelo_pe_perimetria;
    }

    public void setInt_tornozelo_pe_perimetria(Integer int_tornozelo_pe_perimetria) {
        this.int_tornozelo_pe_perimetria = int_tornozelo_pe_perimetria;
    }

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }
    
        public PerimetriaBean(ErroBean erroBean) {
       this.erroBean = erroBean;
    }
    
}
