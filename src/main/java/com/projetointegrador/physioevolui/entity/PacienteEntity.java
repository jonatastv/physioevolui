/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.entity;

public class PacienteEntity {

    private Integer paciente_id;
    private Integer cidade_id;
    private String  nome_paciente;
    private String  data_nascimento;
    private String  cpf;
    private String  rg;
    private Boolean  sexo;
    private String  estado_civil;
    private String  email;
    private String  telefone;
    private String  convenio;
    private String  profissao;
    private String  endereco;


    public PacienteEntity() {
    }

    public PacienteEntity(Integer paciente_id, Integer cidade_id, String nome_paciente, String data_nascimento, String cpf, String rg, Boolean sexo, String estado_civil, String email, String telefone, String convenio, String profissao, String endereco) {
        this.paciente_id = paciente_id;
        this.cidade_id = cidade_id;
        this.nome_paciente = nome_paciente;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.email = email;
        this.telefone = telefone;
        this.convenio = convenio;
        this.profissao = profissao;
        this.endereco = endereco;
    }

    public Integer getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Integer paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Integer getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(Integer cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
