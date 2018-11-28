
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.UfBean;
import com.projetointegrador.physioevolui.entity.UfEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class UfBuilder {
    
    
    
    public UfBean montarUfBean(UfEntity ufEntity) {

        UfBean ufBean = new UfBean();

        if (ufEntity != null) {

            ufBean.setUf_id(ufEntity.getUf_id());
            ufBean.setNome_uf(ufEntity.getNome_uf());
            ufBean.setSigla_uf(ufEntity.getSigla_uf());
            ufBean.setPais_id(ufEntity.getPais_id());


        }

        return ufBean;
    }

    public UfEntity montarUfEntity(UfBean bean) {

        UfEntity ufEntity = new UfEntity();

        if (bean != null) {
   
            ufEntity.setUf_id(bean.getUf_id());
            ufEntity.setNome_uf(bean.getNome_uf());
            ufEntity.setSigla_uf(bean.getSigla_uf());
            ufEntity.setPais_id(bean.getPais_id());

        }

        return ufEntity;
    }

    public List<UfBean> montarListUfBean(List<UfEntity> ufEntityList) {

        List<UfBean> ufBeanList = new ArrayList<>();

        for (UfEntity entity : ufEntityList) {
            ufBeanList.add(montarUfBean(entity));
        }

        return ufBeanList;
    }

    public List<UfEntity> montarListUfEntity(List<UfBean> ufBeanList) {

        List<UfEntity> ufEntityList = new ArrayList<>();

        for (UfBean bean : ufBeanList) {
            ufEntityList.add(montarUfEntity(bean));
        }

        return ufEntityList;
    }

    public List<JSONObject> montarJsonListUfBean(List<UfBean> ufBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (UfBean ufBean : ufBeans) {
            jsonObjectList.add(montarJsonUfBean(ufBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonUfBean(UfBean ufBean) {
        JSONObject jsonObject = new JSONObject();

        if (ufBean != null) {
            jsonObject.put("uf_id", ufBean.getUf_id());
            jsonObject.put("nome_uf", ufBean.getNome_uf());
            jsonObject.put("pais_id", ufBean.getPais_id());
            jsonObject.put("sigla_uf", ufBean.getSigla_uf());

        }

        return jsonObject;
    }
}

