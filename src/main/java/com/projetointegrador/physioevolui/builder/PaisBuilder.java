
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.PaisBean;
import com.projetointegrador.physioevolui.entity.PaisEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class PaisBuilder {
    
    
    
    public PaisBean montarPaisBean(PaisEntity paisEntity) {

        PaisBean paisBean = new PaisBean();

        if (paisEntity != null) {

            paisBean.setPais_id(paisEntity.getPais_id());
            paisBean.setNome_pais(paisEntity.getNome_pais());
            
        }

        return paisBean;
    }

    public PaisEntity montarPaisEntity(PaisBean bean) {

        PaisEntity paisEntity = new PaisEntity();

        if (bean != null) {

            paisEntity.setPais_id(bean.getPais_id());
            paisEntity.setNome_pais(bean.getNome_pais());

        }

        return paisEntity;
    }

    public List<PaisBean> montarListPaisBean(List<PaisEntity> paisEntityList) {

        List<PaisBean> paisBeanList = new ArrayList<>();

        for (PaisEntity entity : paisEntityList) {
            paisBeanList.add(montarPaisBean(entity));
        }

        return paisBeanList;
    }

    public List<PaisEntity> montarListPaisEntity(List<PaisBean> paisBeanList) {

        List<PaisEntity> paisEntityList = new ArrayList<>();

        for (PaisBean bean : paisBeanList) {
            paisEntityList.add(montarPaisEntity(bean));
        }

        return paisEntityList;
    }

    public List<JSONObject> montarJsonListPaisBean(List<PaisBean> paisBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (PaisBean paisBean : paisBeans) {
            jsonObjectList.add(montarJsonPaisBean(paisBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonPaisBean(PaisBean paisBean) {
        JSONObject jsonObject = new JSONObject();

        if (paisBean != null) {
            jsonObject.put("pais_id", paisBean.getPais_id());
            jsonObject.put("nome_pais", paisBean.getNome_pais());

        }

        return jsonObject;
    }
}
