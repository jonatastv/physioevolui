
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.ApvLateralBean;
import com.projetointegrador.physioevolui.entity.ApvLateralEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class ApvLateralBuilder {
    
    
    
    public ApvLateralBean montarApvLateralBean(ApvLateralEntity apvLateralEntity) {

        ApvLateralBean apvLateralBean = new ApvLateralBean();

        if (apvLateralEntity != null) {

            apvLateralBean.setInt_id_apv_lateral(apvLateralEntity.getInt_id_apv_lateral());
            apvLateralBean.setStr_angulo_tibia_tarsico_apv_lateral(apvLateralEntity.getStr_angulo_tibia_tarsico_apv_lateral());
            apvLateralBean.setStr_coluna_cervical_apv_lateral(apvLateralEntity.getStr_coluna_cervical_apv_lateral());
            apvLateralBean.setStr_coluna_lombar_apv_lateral(apvLateralEntity.getStr_coluna_lombar_apv_lateral());
            apvLateralBean.setStr_coluna_toracica_apv_lateral(apvLateralEntity.getStr_coluna_toracica_apv_lateral());
            apvLateralBean.setStr_joelhos_apv_lateral(apvLateralEntity.getStr_joelhos_apv_lateral());
            apvLateralBean.setStr_quadril_apv_lateral(apvLateralEntity.getStr_quadril_apv_lateral());

        }

        return apvLateralBean;
    }

    public ApvLateralEntity montarApvLateralEntity(ApvLateralBean bean) {

        ApvLateralEntity apvLateralEntity = new ApvLateralEntity();

        if (bean != null) {
   
            apvLateralEntity.setInt_id_apv_lateral(bean.getInt_id_apv_lateral());
            apvLateralEntity.setStr_angulo_tibia_tarsico_apv_lateral(bean.getStr_angulo_tibia_tarsico_apv_lateral());
            apvLateralEntity.setStr_coluna_cervical_apv_lateral(bean.getStr_coluna_cervical_apv_lateral());
            apvLateralEntity.setStr_coluna_lombar_apv_lateral(bean.getStr_coluna_lombar_apv_lateral());
            apvLateralEntity.setStr_coluna_toracica_apv_lateral(bean.getStr_coluna_toracica_apv_lateral());
            apvLateralEntity.setStr_joelhos_apv_lateral(bean.getStr_joelhos_apv_lateral());
            apvLateralEntity.setStr_quadril_apv_lateral(bean.getStr_quadril_apv_lateral());


        }

        return apvLateralEntity;
    }

    public List<ApvLateralBean> montarListApvLateralBean(List<ApvLateralEntity> apvLateralEntityList) {

        List<ApvLateralBean> apvLateralBeanList = new ArrayList<>();

        for (ApvLateralEntity entity : apvLateralEntityList) {
            apvLateralBeanList.add(montarApvLateralBean(entity));
        }

        return apvLateralBeanList;
    }

    public List<ApvLateralEntity> montarListApvLateralEntity(List<ApvLateralBean> apvLateralBeanList) {

        List<ApvLateralEntity> apvLateralEntityList = new ArrayList<>();

        for (ApvLateralBean bean : apvLateralBeanList) {
            apvLateralEntityList.add(montarApvLateralEntity(bean));
        }

        return apvLateralEntityList;
    }

    public List<JSONObject> montarJsonListApvLateralBean(List<ApvLateralBean> apvLateralBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (ApvLateralBean apvLateralBean : apvLateralBeans) {
            jsonObjectList.add(montarJsonApvLateralBean(apvLateralBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonApvLateralBean(ApvLateralBean apvLateralBean) {
        JSONObject jsonObject = new JSONObject();

        if (apvLateralBean != null) {
            jsonObject.put("int_id_apv_lateral", apvLateralBean.getInt_id_apv_lateral());
            jsonObject.put("str_angulo_tibia_tarsico_apv_lateral", apvLateralBean.getStr_angulo_tibia_tarsico_apv_lateral());
            jsonObject.put("str_coluna_cervical_apv_lateral", apvLateralBean.getStr_coluna_cervical_apv_lateral());
            jsonObject.put("str_coluna_lombar_apv_lateral", apvLateralBean.getStr_coluna_lombar_apv_lateral());
            jsonObject.put("str_coluna_toracica_apv_lateral", apvLateralBean.getStr_coluna_toracica_apv_lateral());
            jsonObject.put("str_joelhos_apv_lateral", apvLateralBean.getStr_joelhos_apv_lateral());
            jsonObject.put("str_quadril_apv_lateral", apvLateralBean.getStr_quadril_apv_lateral());

        }

        return jsonObject;
    }
}
