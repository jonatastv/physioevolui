
package com.projetointegrador.physioevolui.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class ApvLateralBean {
   
    
    private Integer int_id_apv_lateral;

    private String str_coluna_cervical_apv_lateral;

    private String str_coluna_toracica_apv_lateral;

    private String str_coluna_lombar_apv_lateral;

    private String str_quadril_apv_lateral;

    private String str_joelhos_apv_lateral;

    private String str_angulo_tibia_tarsico_apv_lateral;
    
    private ErroBean erroBean;

    public ApvLateralBean() {
    }

    public ApvLateralBean(Integer int_id_apv_lateral) {
        this.int_id_apv_lateral = int_id_apv_lateral;
    }
    
    

    public ApvLateralBean(Integer int_id_apv_lateral, String str_coluna_cervical_apv_lateral, String str_coluna_toracica_apv_lateral, String str_coluna_lombar_apv_lateral, String str_quadril_apv_lateral, String str_joelhos_apv_lateral, String str_angulo_tibia_tarsico_apv_lateral) {
        this.int_id_apv_lateral = int_id_apv_lateral;
        this.str_coluna_cervical_apv_lateral = str_coluna_cervical_apv_lateral;
        this.str_coluna_toracica_apv_lateral = str_coluna_toracica_apv_lateral;
        this.str_coluna_lombar_apv_lateral = str_coluna_lombar_apv_lateral;
        this.str_quadril_apv_lateral = str_quadril_apv_lateral;
        this.str_joelhos_apv_lateral = str_joelhos_apv_lateral;
        this.str_angulo_tibia_tarsico_apv_lateral = str_angulo_tibia_tarsico_apv_lateral;
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

    public ErroBean getErroBean() {
        return erroBean;
    }

    public void setErroBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }

    public ApvLateralBean(ErroBean erroBean) {
        this.erroBean = erroBean;
    }
    
    
    
    
}
