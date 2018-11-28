
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.PerimetriaBean;
import com.projetointegrador.physioevolui.entity.PerimetriaEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class PerimetriaBuilder {
    
    
    
    public PerimetriaBean montarPerimetriaBean(PerimetriaEntity perimetriaEntity) {

        PerimetriaBean perimetriaBean = new PerimetriaBean();

        if (perimetriaEntity != null) {

            perimetriaBean.setInt_id_perimetria(perimetriaEntity.getInt_id_perimetria());
            perimetriaBean.setInt_antebraco_perimetria(perimetriaEntity.getInt_antebraco_perimetria());
            perimetriaBean.setInt_braco_perimetria(perimetriaEntity.getInt_braco_perimetria());
            perimetriaBean.setInt_coxa_perimetria(perimetriaEntity.getInt_coxa_perimetria());
            perimetriaBean.setInt_perna_perimetria(perimetriaEntity.getInt_perna_perimetria());
            perimetriaBean.setInt_punho_mao_perimetria(perimetriaEntity.getInt_punho_mao_perimetria());
            perimetriaBean.setInt_tornozelo_pe_perimetria(perimetriaEntity.getInt_tornozelo_pe_perimetria());
        }

        return perimetriaBean;
    }

    public PerimetriaEntity montarPerimetriaEntity(PerimetriaBean bean) {

        PerimetriaEntity perimetriaEntity = new PerimetriaEntity();

        if (bean != null) {

            perimetriaEntity.setInt_id_perimetria(bean.getInt_id_perimetria());
            perimetriaEntity.setInt_antebraco_perimetria(bean.getInt_antebraco_perimetria());
            perimetriaEntity.setInt_braco_perimetria(bean.getInt_braco_perimetria());
            perimetriaEntity.setInt_coxa_perimetria(bean.getInt_coxa_perimetria());
            perimetriaEntity.setInt_perna_perimetria(bean.getInt_perna_perimetria());
            perimetriaEntity.setInt_punho_mao_perimetria(bean.getInt_punho_mao_perimetria());
            perimetriaEntity.setInt_tornozelo_pe_perimetria(bean.getInt_tornozelo_pe_perimetria());

        }

        return perimetriaEntity;
    }

    public List<PerimetriaBean> montarListPerimetriaBean(List<PerimetriaEntity> perimetriaEntityList) {

        List<PerimetriaBean> perimetriaBeanList = new ArrayList<>();

        for (PerimetriaEntity entity : perimetriaEntityList) {
            perimetriaBeanList.add(montarPerimetriaBean(entity));
        }

        return perimetriaBeanList;
    }

    public List<PerimetriaEntity> montarListPerimetriaEntity(List<PerimetriaBean> perimetriaBeanList) {

        List<PerimetriaEntity> perimetriaEntityList = new ArrayList<>();

        for (PerimetriaBean bean : perimetriaBeanList) {
            perimetriaEntityList.add(montarPerimetriaEntity(bean));
        }

        return perimetriaEntityList;
    }

    public List<JSONObject> montarJsonListPerimetriaBean(List<PerimetriaBean> perimetriaBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (PerimetriaBean perimetriaBean : perimetriaBeans) {
            jsonObjectList.add(montarJsonPerimetriaBean(perimetriaBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonPerimetriaBean(PerimetriaBean perimetriaBean) {
        JSONObject jsonObject = new JSONObject();

        if (perimetriaBean != null) {
            jsonObject.put("int_id_perimetria", perimetriaBean.getInt_id_perimetria());
            jsonObject.put("int_antebraco_perimetria", perimetriaBean.getInt_antebraco_perimetria());
            jsonObject.put("int_braco_perimetria", perimetriaBean.getInt_braco_perimetria());
            jsonObject.put("int_coxa_perimetria", perimetriaBean.getInt_coxa_perimetria());
            jsonObject.put("int_perna_perimetria", perimetriaBean.getInt_perna_perimetria());
            jsonObject.put("int_punho_mao_perimetria", perimetriaBean.getInt_punho_mao_perimetria());
            jsonObject.put("int_tornozelo_pe_perimetria", perimetriaBean.getInt_tornozelo_pe_perimetria());
        }

        return jsonObject;
    }
}
