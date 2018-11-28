
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.PacienteBean;
import com.projetointegrador.physioevolui.entity.PacienteEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class PacienteBuilder {
    
    
    
    public PacienteBean montarPacienteBean(PacienteEntity pacienteEntity) {

        PacienteBean pacienteBean = new PacienteBean();

        if (pacienteEntity != null) {

            pacienteBean.setInt_id_paciente(pacienteEntity.getInt_id_paciente());
            pacienteBean.setDate_data_nascimento_paciente(pacienteEntity.getDate_data_nascimento_paciente());
            pacienteBean.setInt_cep_paciente(pacienteEntity.getInt_cep_paciente());
            pacienteBean.setInt_estado_civil_paciente(pacienteEntity.getInt_estado_civil_paciente());
            pacienteBean.setInt_sexo_paciente(pacienteEntity.getInt_sexo_paciente());
            pacienteBean.setStr_bairro_paciente(pacienteEntity.getStr_bairro_paciente());
            pacienteBean.setStr_convenio_paciente(pacienteEntity.getStr_convenio_paciente());
            pacienteBean.setStr_cpf_paciente(pacienteEntity.getStr_cpf_paciente());
            pacienteBean.setStr_email_paciente(pacienteEntity.getStr_email_paciente());
            pacienteBean.setStr_endereco_paciente(pacienteEntity.getStr_email_paciente());
            pacienteBean.setStr_nome_paciente(pacienteEntity.getStr_nome_paciente());
            pacienteBean.setStr_profissao_paciente(pacienteEntity.getStr_profissao_paciente());
            pacienteBean.setStr_rg_paciente(pacienteEntity.getStr_rg_paciente());
            pacienteBean.setStr_telefone_paciente(pacienteEntity.getStr_telefone_paciente());

        }

        return pacienteBean;
    }

    public PacienteEntity montarPacienteEntity(PacienteBean bean) {

        PacienteEntity pacienteEntity = new PacienteEntity();

        if (bean != null) {
   
            
            pacienteEntity.setInt_id_paciente(bean.getInt_id_paciente());
            pacienteEntity.setDate_data_nascimento_paciente(bean.getDate_data_nascimento_paciente());
            pacienteEntity.setInt_cep_paciente(bean.getInt_cep_paciente());
            pacienteEntity.setInt_estado_civil_paciente(bean.getInt_estado_civil_paciente());
            pacienteEntity.setInt_sexo_paciente(bean.getInt_sexo_paciente());
            pacienteEntity.setStr_bairro_paciente(bean.getStr_bairro_paciente());
            pacienteEntity.setStr_convenio_paciente(bean.getStr_convenio_paciente());
            pacienteEntity.setStr_cpf_paciente(bean.getStr_cpf_paciente());
            pacienteEntity.setStr_email_paciente(bean.getStr_email_paciente());
            pacienteEntity.setStr_endereco_paciente(bean.getStr_endereco_paciente());
            pacienteEntity.setStr_nome_paciente(bean.getStr_nome_paciente());
            pacienteEntity.setStr_profissao_paciente(bean.getStr_profissao_paciente());
            pacienteEntity.setStr_rg_paciente(bean.getStr_rg_paciente());
            pacienteEntity.setStr_telefone_paciente(bean.getStr_telefone_paciente());

        }

        return pacienteEntity;
    }

    public List<PacienteBean> montarListPacienteBean(List<PacienteEntity> pacienteEntityList) {

        List<PacienteBean> pacienteBeanList = new ArrayList<>();

        for (PacienteEntity entity : pacienteEntityList) {
            pacienteBeanList.add(montarPacienteBean(entity));
        }

        return pacienteBeanList;
    }

    public List<PacienteEntity> montarListPacienteEntity(List<PacienteBean> pacienteBeanList) {

        List<PacienteEntity> pacienteEntityList = new ArrayList<>();

        for (PacienteBean bean : pacienteBeanList) {
            pacienteEntityList.add(montarPacienteEntity(bean));
        }

        return pacienteEntityList;
    }

    public List<JSONObject> montarJsonListPacienteBean(List<PacienteBean> pacienteBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (PacienteBean pacienteBean : pacienteBeans) {
            jsonObjectList.add(montarJsonPacienteBean(pacienteBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonPacienteBean(PacienteBean pacienteBean) {
        JSONObject jsonObject = new JSONObject();

        if (pacienteBean != null) {
            jsonObject.put("int_id_paciente", pacienteBean.getInt_id_paciente());
            jsonObject.put("date_data_nascimento_paciente", pacienteBean.getDate_data_nascimento_paciente());
            jsonObject.put("int_cep_paciente", pacienteBean.getInt_cep_paciente());
            jsonObject.put("str_nome_paciente", pacienteBean.getStr_nome_paciente());
            jsonObject.put("int_estado_civil_paciente", pacienteBean.getInt_estado_civil_paciente());
            jsonObject.put("int_sexo_paciente", pacienteBean.getInt_sexo_paciente());
            jsonObject.put("str_bairro_paciente", pacienteBean.getStr_bairro_paciente());
            jsonObject.put("str_convenio_paciente", pacienteBean.getStr_convenio_paciente());
            jsonObject.put("str_cpf_paciente", pacienteBean.getStr_cpf_paciente());
            jsonObject.put("str_email_paciente", pacienteBean.getStr_email_paciente());
            jsonObject.put("str_endereco_paciente", pacienteBean.getStr_endereco_paciente());
            jsonObject.put("str_profissao_paciente", pacienteBean.getStr_profissao_paciente());
            jsonObject.put("str_rg_paciente", pacienteBean.getStr_rg_paciente());
            jsonObject.put("str_telefone_paciente", pacienteBean.getStr_telefone_paciente());




        }

        return jsonObject;
    }
}
