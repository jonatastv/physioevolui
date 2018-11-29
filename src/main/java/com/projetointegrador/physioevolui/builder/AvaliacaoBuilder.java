/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.AvaliacaoBean;
import com.projetointegrador.physioevolui.entity.AvaliacaoEntity;
import com.projetointegrador.physioevolui.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AvaliacaoBuilder {

    private Utils utils;
    @Autowired
    private FisioterapeutaBuilder fisioterapeutaBuilder;
    
    @Autowired
    private AvaliacaoPosturalVistaPosteriorBuilder avaliacaoPosturalVistaPosteriorBuilder;
    
    @Autowired
    private TipoMarchaBuilder tipoMarchaBuilder;
    
    @Autowired
    private PacienteBuilder pacienteBuilder;
    
    @Autowired
    private GoniometriaBuilder goniometriaBuilder;
    
    @Autowired
    private PerimetriaBuilder perimetriaBuilder;
    
    @Autowired
    private ExameFisicoBuilder exameFisicoBuilder;
    
    @Autowired
    private ApvLateralBuilder apvLateralBuilder;
    
    @Autowired
    private ApvAnteriorBuilder apvanteriorBuilder;
            
    
    //public AvaliacaoEntity montarAvaliacaoEntity(AvaliacaoBean avaliacaoBean, UsuarioBean usuarioBean, PacienteBean pacienteBean, MedicoResponsavelBean medicoResponsavelBean){
     //   AvaliacaoEntity entity = new AvaliacaoEntity();
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

    //    return entity;
   // }
    
        public AvaliacaoBean montarAvaliacaoBean(AvaliacaoEntity avaliacaoEntity) {
        AvaliacaoBean avaliacaoBean = new AvaliacaoBean();
        if (avaliacaoEntity != null) {
            avaliacaoBean.setInt_avaliacao_id(avaliacaoEntity.getInt_avaliacao_id());
            avaliacaoBean.setAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean(avaliacaoEntity.getAvaliacaoPosturalVistaPosteriorEntity()));
             avaliacaoBean.setFisioterapeutaBean(fisioterapeutaBuilder.montarFisioterapeutaBean(avaliacaoEntity.getFisioterapeutaEntity()));
             avaliacaoBean.setTipoMarchaBean(tipoMarchaBuilder.montarTipoMarchaBean(avaliacaoEntity.getTipoMarchaEntity()));
             avaliacaoBean.setApvAnteriorBean(apvanteriorBuilder.montarApvAnteriorBean(avaliacaoEntity.getApvAnteriorEntity()));
             avaliacaoBean.setApvLateralBean(apvLateralBuilder.montarApvLateralBean(avaliacaoEntity.getApvLateralEntity()));
             avaliacaoBean.setExameFisicoBean(exameFisicoBuilder.montarExameFisicoBean(avaliacaoEntity.getExameFisicoEntity()));
             avaliacaoBean.setGoniometriaBean(goniometriaBuilder.montarGoniometriaBean(avaliacaoEntity.getGoniometriaEntity()));
             avaliacaoBean.setPacienteBean(pacienteBuilder.montarPacienteBean(avaliacaoEntity.getPacienteEntity()));
             avaliacaoBean.setPerimetriaBean(perimetriaBuilder.montarPerimetriaBean(avaliacaoEntity.getPerimetriaEntity()));
          
          /*  if (avaliacaoEntity.getAvaliacaoPosturalVistaPosteriorEntity()!= null)
                avaliacaoBean.setAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorBean(avaliacaoEntity.getAvaliacaoPosturalVistaPosteriorEntity()));
        
        
            if (avaliacaoEntity.getFisioterapeutaEntity()!= null)
                avaliacaoBean.setFisioterapeutaBean(fisioterapeutaBuilder.montarFisioterapeutaBean(avaliacaoEntity.getFisioterapeutaEntity()));
        */
             }
        return avaliacaoBean;
    }
    
       public AvaliacaoEntity montarAvaliacaoEntity(AvaliacaoBean bean) {

        AvaliacaoEntity avaliacaoEntity = new AvaliacaoEntity();

        avaliacaoEntity.setInt_avaliacao_id(bean.getInt_avaliacao_id());
        avaliacaoEntity.setFisioterapeutaEntity(fisioterapeutaBuilder.montarFisioterapeutaEntity(bean.getFisioterapeutaBean()));
        avaliacaoEntity.setAvaliacaoPosturalVistaPosteriorEntity(avaliacaoPosturalVistaPosteriorBuilder.montarAvaliacaoPosturalVistaPosteriorEntity(bean.getAvaliacaoPosturalVistaPosteriorBean()));
             avaliacaoEntity.setTipoMarchaEntity(tipoMarchaBuilder.montarTipoMarchaEntity(bean.getTipoMarchaBean()));
             avaliacaoEntity.setApvAnteriorEntity(apvanteriorBuilder.montarApvAnteriorEntity(bean.getApvAnteriorBean()));
             avaliacaoEntity.setApvLateralEntity(apvLateralBuilder.montarApvLateralEntity(bean.getApvLateralBean()));
             avaliacaoEntity.setExameFisicoEntity(exameFisicoBuilder.montarExameFisicoEntity(bean.getExameFisicoBean()));
             avaliacaoEntity.setGoniometriaEntity(goniometriaBuilder.montarGoniometriaEntity(bean.getGoniometriaBean()));
             avaliacaoEntity.setPacienteEntity(pacienteBuilder.montarPacienteEntity(bean.getPacienteBean()));
             avaliacaoEntity.setPerimetriaEntity(perimetriaBuilder.montarPerimetriaEntity(bean.getPerimetriaBean()));
        
        
        return avaliacaoEntity;
    }
       
       
       
        public List<AvaliacaoBean> montarListAvaliacaoBean(List<AvaliacaoEntity> avaliacaoEntityList) {

        List<AvaliacaoBean> avaliacaoBeanList = new ArrayList<>();

        for (AvaliacaoEntity entity : avaliacaoEntityList) {
            avaliacaoBeanList.add(montarAvaliacaoBean(entity));
        }

        return avaliacaoBeanList;
    }
       
        
        public List<AvaliacaoEntity> montarListAvaliacaoEntity(List<AvaliacaoBean> avaliacaoBeanList) {

        List<AvaliacaoEntity> avaliacaoEntityList = new ArrayList<>();

        for (AvaliacaoBean bean : avaliacaoBeanList) {
            avaliacaoEntityList.add(montarAvaliacaoEntity(bean));
        }

        return avaliacaoEntityList;
    } 
        
        
         public List<JSONObject> montarJsonListAvaliacaoBean(List<AvaliacaoBean> avaliacaoBeanList) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (AvaliacaoBean avaliacaoBean : avaliacaoBeanList) {
                jsonObjectList.add(montarJsonAvaliacaoBean(avaliacaoBean));
        }

        return jsonObjectList;
    }  
         
             public JSONObject montarJsonAvaliacaoBean(AvaliacaoBean avaliacaoBean) {
        JSONObject jsonObject = new JSONObject();
        if (avaliacaoBean != null) {
            if (avaliacaoBean.getErroBean() != null) {
                jsonObject.put("is_erro", avaliacaoBean.getErroBean().getErro());
                if (avaliacaoBean.getErroBean().getStackTrace() != null)
                jsonObject.put("stack_trace", avaliacaoBean.getErroBean().getStackTrace());
                if (!avaliacaoBean.getErroBean().getMessage().isEmpty())
                    jsonObject.put("msg", avaliacaoBean.getErroBean().getMessage());
            } else {
                jsonObject.put("int_avaliacao_id", avaliacaoBean.getInt_avaliacao_id());
            //    jsonObject.put("int_fisioterapeuta_id", avaliacaoBean.getFisioterapeutaBean());
           //    jsonObject.put("avaliacaoposturalvistaposterior_id", avaliacaoBean.getAvaliacaoPosturalVistaPosteriorBean());

                if (avaliacaoBean.getFisioterapeutaBean() != null)
                    jsonObject.put("int_fisioterapeuta_id", avaliacaoBean.getFisioterapeutaBean());
                if (avaliacaoBean.getAvaliacaoPosturalVistaPosteriorBean() != null)
                    jsonObject.put("avaliacaoposturalvistaposterior_id", avaliacaoBean.getAvaliacaoPosturalVistaPosteriorBean());
                if (avaliacaoBean.getApvAnteriorBean()!= null)
                    jsonObject.put("int_id_apv_anterior", avaliacaoBean.getApvAnteriorBean());
                
                if (avaliacaoBean.getApvLateralBean()!= null)
                    jsonObject.put("int_id_apv_lateral", avaliacaoBean.getApvLateralBean());
                
                if (avaliacaoBean.getGoniometriaBean()!= null)
                    jsonObject.put("int_id_goniometria", avaliacaoBean.getGoniometriaBean());
                
                if (avaliacaoBean.getExameFisicoBean()!= null)
                    jsonObject.put("int_id_exame_fisico", avaliacaoBean.getExameFisicoBean());
                
                if (avaliacaoBean.getPerimetriaBean()!= null)
                    jsonObject.put("int_id_perimetria", avaliacaoBean.getPerimetriaBean());
                
                if (avaliacaoBean.getTipoMarchaBean()!= null)
                    jsonObject.put("int_id_tipo_marcha", avaliacaoBean.getTipoMarchaBean());
                
                if (avaliacaoBean.getPacienteBean()!= null)
                    jsonObject.put("int_id_paciente", avaliacaoBean.getPacienteBean());
                
                
            }
        }

        return jsonObject;
         
            
        }
       
}
