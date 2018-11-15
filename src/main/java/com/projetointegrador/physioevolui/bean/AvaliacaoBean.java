/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.bean;
import org.springframework.stereotype.Component;

@Component
public class AvaliacaoBean {

    private Integer avaliacao_Id;
    private Integer usuario_id;
    private Integer paciente_id;
    private Integer medico_responsavel_id;
    private String diagnostico_clinico;
    private String queixa_principal;
    private String queixa_secundaria;
    private String hma_hmp;
    private String historico_familiar;
    private String fc;
    private String fr;
    private String pressao_arterial;
    private String temperatura_corporal;

    public AvaliacaoBean() {
    }

    public AvaliacaoBean(Integer avaliacao_Id, Integer usuario_id, Integer paciente_id, Integer medico_responsavel_id, String diagnostico_clinico, String queixa_principal, String queixa_secundaria, String hma_hmp, String historico_familiar, String fc, String fr, String pressao_arterial, String temperatura_corporal) {
        this.avaliacao_Id = avaliacao_Id;
        this.usuario_id = usuario_id;
        this.paciente_id = paciente_id;
        this.medico_responsavel_id = medico_responsavel_id;
        this.diagnostico_clinico = diagnostico_clinico;
        this.queixa_principal = queixa_principal;
        this.queixa_secundaria = queixa_secundaria;
        this.hma_hmp = hma_hmp;
        this.historico_familiar = historico_familiar;
        this.fc = fc;
        this.fr = fr;
        this.pressao_arterial = pressao_arterial;
        this.temperatura_corporal = temperatura_corporal;
    }

    public Integer getAvaliacao_Id() {
        return avaliacao_Id;
    }

    public void setAvaliacao_Id(Integer avaliacao_Id) {
        this.avaliacao_Id = avaliacao_Id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Integer paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Integer getMedico_responsavel_id() {
        return medico_responsavel_id;
    }

    public void setMedico_responsavel_id(Integer medico_responsavel_id) {
        this.medico_responsavel_id = medico_responsavel_id;
    }

    public String getDiagnostico_clinico() {
        return diagnostico_clinico;
    }

    public void setDiagnostico_clinico(String diagnostico_clinico) {
        this.diagnostico_clinico = diagnostico_clinico;
    }

    public String getQueixa_principal() {
        return queixa_principal;
    }

    public void setQueixa_principal(String queixa_principal) {
        this.queixa_principal = queixa_principal;
    }

    public String getQueixa_secundaria() {
        return queixa_secundaria;
    }

    public void setQueixa_secundaria(String queixa_secundaria) {
        this.queixa_secundaria = queixa_secundaria;
    }

    public String getHma_hmp() {
        return hma_hmp;
    }

    public void setHma_hmp(String hma_hmp) {
        this.hma_hmp = hma_hmp;
    }

    public String getHistorico_familiar() {
        return historico_familiar;
    }

    public void setHistorico_familiar(String historico_familiar) {
        this.historico_familiar = historico_familiar;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getPressao_arterial() {
        return pressao_arterial;
    }

    public void setPressao_arterial(String pressao_arterial) {
        this.pressao_arterial = pressao_arterial;
    }

    public String getTemperatura_corporal() {
        return temperatura_corporal;
    }

    public void setTemperatura_corporal(String temperatura_corporal) {
        this.temperatura_corporal = temperatura_corporal;
    }
}
