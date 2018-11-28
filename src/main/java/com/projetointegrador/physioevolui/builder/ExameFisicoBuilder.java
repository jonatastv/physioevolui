
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.ExameFisicoBean;
import com.projetointegrador.physioevolui.entity.ExameFisicoEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class ExameFisicoBuilder {
    
    
    
    public ExameFisicoBean montarExameFisicoBean(ExameFisicoEntity exameFisicoEntity) {

        ExameFisicoBean exameFisicoBean = new ExameFisicoBean();

        if (exameFisicoEntity != null) {

            exameFisicoBean.setInt_id_exame_fisico(exameFisicoEntity.getInt_id_exame_fisico());
            exameFisicoBean.setInt_escada_dor_lanns_exame_fisico(exameFisicoEntity.getInt_escada_dor_lanns_exame_fisico());
            exameFisicoBean.setStr_inspecao_exame_fisico(exameFisicoEntity.getStr_inspecao_exame_fisico());
            exameFisicoBean.setStr_observacoes_eva_exame_fisico(exameFisicoEntity.getStr_observacoes_eva_exame_fisico());
            exameFisicoBean.setStr_palpacao_exame_fisico(exameFisicoEntity.getStr_palpacao_exame_fisico());

        }

        return exameFisicoBean;
    }

    public ExameFisicoEntity montarExameFisicoEntity(ExameFisicoBean bean) {

        ExameFisicoEntity exameFisicoEntity = new ExameFisicoEntity();

        if (bean != null) {
   
            exameFisicoEntity.setInt_id_exame_fisico(bean.getInt_id_exame_fisico());
            exameFisicoEntity.setInt_escada_dor_lanns_exame_fisico(bean.getInt_escada_dor_lanns_exame_fisico());
            exameFisicoEntity.setStr_inspecao_exame_fisico(bean.getStr_inspecao_exame_fisico());
            exameFisicoEntity.setStr_observacoes_eva_exame_fisico(bean.getStr_observacoes_eva_exame_fisico());
            exameFisicoEntity.setStr_palpacao_exame_fisico(bean.getStr_palpacao_exame_fisico());


        }

        return exameFisicoEntity;
    }

    public List<ExameFisicoBean> montarListExameFisicoBean(List<ExameFisicoEntity> exameFisicoEntityList) {

        List<ExameFisicoBean> exameFisicoBeanList = new ArrayList<>();

        for (ExameFisicoEntity entity : exameFisicoEntityList) {
            exameFisicoBeanList.add(montarExameFisicoBean(entity));
        }

        return exameFisicoBeanList;
    }

    public List<ExameFisicoEntity> montarListExameFisicoEntity(List<ExameFisicoBean> exameFisicoBeanList) {

        List<ExameFisicoEntity> exameFisicoEntityList = new ArrayList<>();

        for (ExameFisicoBean bean : exameFisicoBeanList) {
            exameFisicoEntityList.add(montarExameFisicoEntity(bean));
        }

        return exameFisicoEntityList;
    }

    public List<JSONObject> montarJsonListExameFisicoBean(List<ExameFisicoBean> exameFisicoBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (ExameFisicoBean exameFisicoBean : exameFisicoBeans) {
            jsonObjectList.add(montarJsonExameFisicoBean(exameFisicoBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonExameFisicoBean(ExameFisicoBean exameFisicoBean) {
        JSONObject jsonObject = new JSONObject();

        if (exameFisicoBean != null) {
            jsonObject.put("int_id_exame_fisico", exameFisicoBean.getInt_id_exame_fisico());
            jsonObject.put("int_escada_dor_lanns_exame_fisico", exameFisicoBean.getInt_escada_dor_lanns_exame_fisico());
            jsonObject.put("str_inspecao_exame_fisico", exameFisicoBean.getStr_inspecao_exame_fisico());
            jsonObject.put("str_observacoes_eva_exame_fisico", exameFisicoBean.getStr_observacoes_eva_exame_fisico());
            jsonObject.put("str_palpacao_exame_fisico", exameFisicoBean.getStr_palpacao_exame_fisico());

        }

        return jsonObject;
    }
}
