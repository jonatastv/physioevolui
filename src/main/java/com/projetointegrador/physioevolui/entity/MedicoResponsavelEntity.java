/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

public class MedicoResponsavelEntity {

    private Integer medico_responsavel_id;
    private String medico_responsavel;
    private String telefone_medico;

    public MedicoResponsavelEntity() {
    }

    public MedicoResponsavelEntity(Integer medico_responsavel_id, String medico_responsavel, String telefone_medico) {
        this.medico_responsavel_id = medico_responsavel_id;
        this.medico_responsavel = medico_responsavel;
        this.telefone_medico = telefone_medico;
    }

    public Integer getMedico_responsavel_id() {
        return medico_responsavel_id;
    }

    public void setMedico_responsavel_id(Integer medico_responsavel_id) {
        this.medico_responsavel_id = medico_responsavel_id;
    }

    public String getMedico_responsavel() {
        return medico_responsavel;
    }

    public void setMedico_responsavel(String medico_responsavel) {
        this.medico_responsavel = medico_responsavel;
    }

    public String getTelefone_medico() {
        return telefone_medico;
    }

    public void setTelefone_medico(String telefone_medico) {
        this.telefone_medico = telefone_medico;
    }
}
