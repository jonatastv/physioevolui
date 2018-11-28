
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.CidadeBean;
import com.projetointegrador.physioevolui.entity.CidadeEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class CidadeBuilder {
    
    
    
    public CidadeBean montarCidadeBean(CidadeEntity cidadeEntity) {

        CidadeBean cidadeBean = new CidadeBean();

        if (cidadeEntity != null) {

            cidadeBean.setCidade_id(cidadeEntity.getCidade_id());
            cidadeBean.setNome_cidade(cidadeEntity.getNome_cidade());
            cidadeBean.setUf_id(cidadeEntity.getUf_id());
            
        }

        return cidadeBean;
    }

    public CidadeEntity montarCidadeEntity(CidadeBean bean) {

        CidadeEntity cidadeEntity = new CidadeEntity();

        if (bean != null) {
   
            cidadeEntity.setCidade_id(bean.getCidade_id());
            cidadeEntity.setNome_cidade(bean.getNome_cidade());
            cidadeEntity.setUf_id(bean.getUf_id());

        }

        return cidadeEntity;
    }

    public List<CidadeBean> montarListCidadeBean(List<CidadeEntity> cidadeEntityList) {

        List<CidadeBean> cidadeBeanList = new ArrayList<>();

        for (CidadeEntity entity : cidadeEntityList) {
            cidadeBeanList.add(montarCidadeBean(entity));
        }

        return cidadeBeanList;
    }

    public List<CidadeEntity> montarListCidadeEntity(List<CidadeBean> cidadeBeanList) {

        List<CidadeEntity> cidadeEntityList = new ArrayList<>();

        for (CidadeBean bean : cidadeBeanList) {
            cidadeEntityList.add(montarCidadeEntity(bean));
        }

        return cidadeEntityList;
    }

    public List<JSONObject> montarJsonListCidadeBean(List<CidadeBean> cidadeBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (CidadeBean cidadeBean : cidadeBeans) {
            jsonObjectList.add(montarJsonCidadeBean(cidadeBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonCidadeBean(CidadeBean cidadeBean) {
        JSONObject jsonObject = new JSONObject();

        if (cidadeBean != null) {
            jsonObject.put("cidade_id", cidadeBean.getCidade_id());
            jsonObject.put("nome_cidade", cidadeBean.getNome_cidade());
            jsonObject.put("uf_id", cidadeBean.getUf_id());

            
        }

        return jsonObject;
    }
}
