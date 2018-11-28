
package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class ApvAnteriorBean {
    
    private Integer int_id_apv_anterior;
    private String str_cabeca_apv_anterior;
    private String str_ombro_apv_anterior; 
    private String str_clavicula_apv_anterior;
    private String str_angulo_tales_apv_anterior;
    private String str_espinha_iliaca_antero_superior_apv_anterior;
    private String str_joelho_apv_anterior;
    private String str_patela_apv_anterior;
    private String str_tornozelo_pe_apv_anterior;
    private ErroBean erroBean;
      
    public ApvAnteriorBean() {
    }

    public ApvAnteriorBean(Integer int_id_apv_anterior) {
        this.int_id_apv_anterior = int_id_apv_anterior;
    }

    public ApvAnteriorBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public ApvAnteriorBean(Integer int_id_apv_anterior, String str_cabeca_apv_anterior, String str_ombro_apv_anterior, String str_clavicula_apv_anterior, String str_angulo_tales_apv_anterior, String str_espinha_iliaca_antero_superior_apv_anterior, String str_joelho_apv_anterior, String str_patela_apv_anterior, String str_tornozelo_pe_apv_anterior, ErroBean erroBean) {
        this.int_id_apv_anterior = int_id_apv_anterior;
        this.str_cabeca_apv_anterior = str_cabeca_apv_anterior;
        this.str_ombro_apv_anterior = str_ombro_apv_anterior;
        this.str_clavicula_apv_anterior = str_clavicula_apv_anterior;
        this.str_angulo_tales_apv_anterior = str_angulo_tales_apv_anterior;
        this.str_espinha_iliaca_antero_superior_apv_anterior = str_espinha_iliaca_antero_superior_apv_anterior;
        this.str_joelho_apv_anterior = str_joelho_apv_anterior;
        this.str_patela_apv_anterior = str_patela_apv_anterior;
        this.str_tornozelo_pe_apv_anterior = str_tornozelo_pe_apv_anterior;
        this.erroBean = erroBean;
    }

    public Integer getInt_id_apv_anterior() {
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

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }
    

    
    
}
