
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.AvaliacaoPosturalVistaPosteriorBean;

import com.projetointegrador.physioevolui.entity.AvaliacaoPosturalVistaPosteriorEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author jonatas
 */
@Component
public class AvaliacaoPosturalVistaPosteriorBuilder {
    
    
    
    public AvaliacaoPosturalVistaPosteriorBean montarAvaliacaoPosturalVistaPosteriorBean(AvaliacaoPosturalVistaPosteriorEntity avaliacaoPosturalVistaPosteriorEntity){
        
        AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean = new AvaliacaoPosturalVistaPosteriorBean();
        
        if (avaliacaoPosturalVistaPosteriorEntity != null) {
            
            avaliacaoPosturalVistaPosteriorBean.setAvaliacaoposturalvistaposterior_id(avaliacaoPosturalVistaPosteriorEntity.getAvaliacaoposturalvistaposterior_id());
            avaliacaoPosturalVistaPosteriorBean.setAngulo_tales(avaliacaoPosturalVistaPosteriorEntity.getAngulo_tales());
            avaliacaoPosturalVistaPosteriorBean.setCabeca(avaliacaoPosturalVistaPosteriorEntity.getCabeca());
            avaliacaoPosturalVistaPosteriorBean.setColuna_lombar(avaliacaoPosturalVistaPosteriorEntity.getColuna_lombar());
            avaliacaoPosturalVistaPosteriorBean.setColuna_servical(avaliacaoPosturalVistaPosteriorEntity.getColuna_servical());
            avaliacaoPosturalVistaPosteriorBean.setColuna_toracica(avaliacaoPosturalVistaPosteriorEntity.getColuna_toracica());
            avaliacaoPosturalVistaPosteriorBean.setEscapula(avaliacaoPosturalVistaPosteriorEntity.getEscapula());
            avaliacaoPosturalVistaPosteriorBean.setEspinha_iliaca_antero(avaliacaoPosturalVistaPosteriorEntity.getEspinha_iliaca_antero());
            avaliacaoPosturalVistaPosteriorBean.setJoelho(avaliacaoPosturalVistaPosteriorEntity.getJoelho());
            avaliacaoPosturalVistaPosteriorBean.setOmbro(avaliacaoPosturalVistaPosteriorEntity.getOmbro());
            avaliacaoPosturalVistaPosteriorBean.setTornozelo_pe(avaliacaoPosturalVistaPosteriorEntity.getTornozelo_pe());
        }
        return avaliacaoPosturalVistaPosteriorBean;
    }
    
    public AvaliacaoPosturalVistaPosteriorEntity montarAvaliacaoPosturalVistaPosteriorEntity(AvaliacaoPosturalVistaPosteriorBean bean){
        
        AvaliacaoPosturalVistaPosteriorEntity  avaliacaoPosturalVistaPosteriorEntity = new AvaliacaoPosturalVistaPosteriorEntity();
        
        if (bean != null) {
            
            avaliacaoPosturalVistaPosteriorEntity.setAvaliacaoposturalvistaposterior_id(bean.getAvaliacaoposturalvistaposterior_id());
            avaliacaoPosturalVistaPosteriorEntity.setAngulo_tales(bean.getAngulo_tales());
            avaliacaoPosturalVistaPosteriorEntity.setCabeca(bean.getCabeca());
            avaliacaoPosturalVistaPosteriorEntity.setColuna_lombar(bean.getColuna_lombar());
            avaliacaoPosturalVistaPosteriorEntity.setColuna_servical(bean.getColuna_servical());
            avaliacaoPosturalVistaPosteriorEntity.setColuna_toracica(bean.getColuna_toracica());
            avaliacaoPosturalVistaPosteriorEntity.setEscapula(bean.getEscapula());
            avaliacaoPosturalVistaPosteriorEntity.setEspinha_iliaca_antero(bean.getEspinha_iliaca_antero());
            avaliacaoPosturalVistaPosteriorEntity.setJoelho(bean.getJoelho());
            avaliacaoPosturalVistaPosteriorEntity.setOmbro(bean.getOmbro());
            avaliacaoPosturalVistaPosteriorEntity.setTornozelo_pe(bean.getTornozelo_pe());
        }
        return avaliacaoPosturalVistaPosteriorEntity;
    }
    
    public List<AvaliacaoPosturalVistaPosteriorBean> montarListAvaliacaoPosturalVistaPosteriorBean (List<AvaliacaoPosturalVistaPosteriorEntity> avaliacaoPosturalVistaPosteriorEntityList) {
        
        
        List<AvaliacaoPosturalVistaPosteriorBean> avaliacaoPosturalVistaPosteriorBeanList = new ArrayList<>();

        for (AvaliacaoPosturalVistaPosteriorEntity entity : avaliacaoPosturalVistaPosteriorEntityList) {
            avaliacaoPosturalVistaPosteriorBeanList.add(montarAvaliacaoPosturalVistaPosteriorBean(entity));
        }

        return avaliacaoPosturalVistaPosteriorBeanList;
    }
    
      public List<AvaliacaoPosturalVistaPosteriorEntity> montarAvaliacaoPosturalVistaPosteriorEntity(List<AvaliacaoPosturalVistaPosteriorBean> avaliacaoPosturalVistaPosteriorBeanList) {

        List<AvaliacaoPosturalVistaPosteriorEntity> avaliacaoPosturalVistaPosteriorEntityList = new ArrayList<>();

        for (AvaliacaoPosturalVistaPosteriorBean bean : avaliacaoPosturalVistaPosteriorBeanList) {
            avaliacaoPosturalVistaPosteriorEntityList.add(montarAvaliacaoPosturalVistaPosteriorEntity(bean));
        }

        return avaliacaoPosturalVistaPosteriorEntityList;
    }
      
        public List<JSONObject> montarJsonListAvaliacaoPosturalVistaPosteriorBean(List<AvaliacaoPosturalVistaPosteriorBean> avaliacaoPosturalVistaPosteriorBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean : avaliacaoPosturalVistaPosteriorBeans) {
            jsonObjectList.add(montarJsonListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorBean));
        }

        return jsonObjectList;
    }
        
          public JSONObject montarJsonListAvaliacaoPosturalVistaPosteriorBean(AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {
        JSONObject jsonObject = new JSONObject();

        if (avaliacaoPosturalVistaPosteriorBean != null) {
            jsonObject.put("avaliacao_postural_vista_posterior", avaliacaoPosturalVistaPosteriorBean.getAvaliacaoposturalvistaposterior_id());
            jsonObject.put("angulo_tales", avaliacaoPosturalVistaPosteriorBean.getAngulo_tales());
            jsonObject.put("cabeca", avaliacaoPosturalVistaPosteriorBean.getCabeca());
            jsonObject.put("coluna_lombar", avaliacaoPosturalVistaPosteriorBean.getColuna_lombar());
            jsonObject.put("coluna_servical", avaliacaoPosturalVistaPosteriorBean.getColuna_servical());
            jsonObject.put("coluna_toracica", avaliacaoPosturalVistaPosteriorBean.getColuna_toracica());
            jsonObject.put("escapula", avaliacaoPosturalVistaPosteriorBean.getEscapula());
            jsonObject.put("espinha_iliaca_antero", avaliacaoPosturalVistaPosteriorBean.getEspinha_iliaca_antero());
            jsonObject.put("joelho", avaliacaoPosturalVistaPosteriorBean.getJoelho());
            jsonObject.put("ombro", avaliacaoPosturalVistaPosteriorBean.getOmbro());
            jsonObject.put("tornozelo_pe", avaliacaoPosturalVistaPosteriorBean.getTornozelo_pe());
            
        }

        return jsonObject;
    }

    }

