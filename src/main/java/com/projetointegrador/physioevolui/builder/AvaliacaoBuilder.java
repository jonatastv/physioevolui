/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.AvaliacaoBean;
import com.projetointegrador.physioevolui.bean.MedicoResponsavelBean;
import com.projetointegrador.physioevolui.bean.PacienteBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.entity.AvaliacaoEntity;
import com.projetointegrador.physioevolui.utils.Utils;
import org.springframework.stereotype.Component;

@Component
public class AvaliacaoBuilder {

    private Utils utils;
    
    public AvaliacaoEntity montarAvaliacaoEntity(AvaliacaoBean avaliacaoBean, UsuarioBean usuarioBean, PacienteBean pacienteBean, MedicoResponsavelBean medicoResponsavelBean){
        AvaliacaoEntity entity = new AvaliacaoEntity();
//        if (!utils.isEmpty(String.valueOf(avaliacaoBean.getAvaliacao_Id())))
//            entity.setAvaliacao_Id(avaliacaoBean.getAvaliacao_Id());
//        if (!utils.isEmpty(String.valueOf(usuarioBean.getUsuario_id())))
//            entity.setUsuario_id(usuarioBean.getUsuario_id());
//        if (!utils.isEmpty(String.valueOf(pacienteBean.getPaciente_id())))
//            entity.setPaciente_id(pacienteBean.getPaciente_id());
//        if (!utils.isEmpty(String.valueOf(medicoResponsavelBean.getMedico_responsavel_id())))
//            entity.setMedico_responsavel_id(medicoResponsavelBean.getMedico_responsavel_id());
//        if (!utils.isEmpty(avaliacaoBean.getQueixa_principal()))
//            entity.setQueixa_principal(avaliacaoBean.getQueixa_principal());
//        if (!utils.isEmpty(avaliacaoBean.getQueixa_secundaria()))
//            entity.setQueixa_secundaria(avaliacaoBean.getQueixa_secundaria());
//        if (!utils.isEmpty(avaliacaoBean.getPressao_arterial()))
//            entity.setPressao_arterial(avaliacaoBean.getPressao_arterial());
//        if (!utils.isEmpty(avaliacaoBean.getTemperatura_corporal()))
//            entity.setTemperatura_corporal(avaliacaoBean.getTemperatura_corporal());

        return entity;
    }
}
