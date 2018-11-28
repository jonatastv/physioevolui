
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.ApvAnteriorBean;
import com.projetointegrador.physioevolui.entity.ApvAnteriorEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class ApvAnteriorBuilder {
    
    
    
    public ApvAnteriorBean montarApvAnteriorBean(ApvAnteriorEntity apvAnteriorEntity) {

        ApvAnteriorBean apvAnteriorBean = new ApvAnteriorBean();

        if (apvAnteriorEntity != null) {

            apvAnteriorBean.setInt_id_apv_anterior(apvAnteriorEntity.getInt_id_apv_anterior());
            apvAnteriorBean.setStr_cabeca_apv_anterior(apvAnteriorEntity.getStr_cabeca_apv_anterior());
            apvAnteriorBean.setStr_clavicula_apv_anterior(apvAnteriorEntity.getStr_clavicula_apv_anterior());
            apvAnteriorBean.setStr_angulo_tales_apv_anterior(apvAnteriorEntity.getStr_angulo_tales_apv_anterior());
            apvAnteriorBean.setStr_espinha_iliaca_antero_superior_apv_anterior(apvAnteriorEntity.getStr_espinha_iliaca_antero_superior_apv_anterior());
            apvAnteriorBean.setStr_joelho_apv_anterior(apvAnteriorEntity.getStr_joelho_apv_anterior());
            apvAnteriorBean.setStr_ombro_apv_anterior(apvAnteriorEntity.getStr_ombro_apv_anterior());
            apvAnteriorBean.setStr_patela_apv_anterior(apvAnteriorEntity.getStr_patela_apv_anterior());
            apvAnteriorBean.setStr_tornozelo_pe_apv_anterior(apvAnteriorEntity.getStr_tornozelo_pe_apv_anterior());
        }

        return apvAnteriorBean;
    }

    public ApvAnteriorEntity montarApvAnteriorEntity(ApvAnteriorBean bean) {

        ApvAnteriorEntity apvAnteriorEntity = new ApvAnteriorEntity();

        if (bean != null) {
   
 
            apvAnteriorEntity.setInt_id_apv_anterior(bean.getInt_id_apv_anterior());
            apvAnteriorEntity.setStr_cabeca_apv_anterior(bean.getStr_cabeca_apv_anterior());
            apvAnteriorEntity.setStr_clavicula_apv_anterior(bean.getStr_clavicula_apv_anterior());
            apvAnteriorEntity.setStr_angulo_tales_apv_anterior(bean.getStr_angulo_tales_apv_anterior());
            apvAnteriorEntity.setStr_espinha_iliaca_antero_superior_apv_anterior(bean.getStr_espinha_iliaca_antero_superior_apv_anterior());
            apvAnteriorEntity.setStr_joelho_apv_anterior(bean.getStr_joelho_apv_anterior());
            apvAnteriorEntity.setStr_ombro_apv_anterior(bean.getStr_ombro_apv_anterior());
            apvAnteriorEntity.setStr_patela_apv_anterior(bean.getStr_patela_apv_anterior());
            apvAnteriorEntity.setStr_tornozelo_pe_apv_anterior(bean.getStr_tornozelo_pe_apv_anterior());

        }

        return apvAnteriorEntity;
    }

    public List<ApvAnteriorBean> montarListApvAnteriorBean(List<ApvAnteriorEntity> apvAnteriorEntityList) {

        List<ApvAnteriorBean> apvAnteriorBeanList = new ArrayList<>();

        for (ApvAnteriorEntity entity : apvAnteriorEntityList) {
            apvAnteriorBeanList.add(montarApvAnteriorBean(entity));
        }

        return apvAnteriorBeanList;
    }

    public List<ApvAnteriorEntity> montarListApvAnteriorEntity(List<ApvAnteriorBean> apvAnteriorBeanList) {

        List<ApvAnteriorEntity> apvAnteriorEntityList = new ArrayList<>();

        for (ApvAnteriorBean bean : apvAnteriorBeanList) {
            apvAnteriorEntityList.add(montarApvAnteriorEntity(bean));
        }

        return apvAnteriorEntityList;
    }

    public List<JSONObject> montarJsonListApvAnteriorBean(List<ApvAnteriorBean> apvAnteriorBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (ApvAnteriorBean apvAnteriorBean : apvAnteriorBeans) {
            jsonObjectList.add(montarJsonApvAnteriorBean(apvAnteriorBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonApvAnteriorBean(ApvAnteriorBean apvAnteriorBean) {
        JSONObject jsonObject = new JSONObject();

        if (apvAnteriorBean != null) {
            jsonObject.put("int_id_apv_anterior", apvAnteriorBean.getInt_id_apv_anterior());
            jsonObject.put("str_cabeca_apv_anterior", apvAnteriorBean.getStr_cabeca_apv_anterior());
            jsonObject.put("str_clavicula_apv_anterior", apvAnteriorBean.getStr_clavicula_apv_anterior());
            jsonObject.put("str_angulo_tales_apv_anterior", apvAnteriorBean.getStr_angulo_tales_apv_anterior());
            jsonObject.put("str_espinha_iliaca_antero_superior_apv_anterior", apvAnteriorBean.getStr_espinha_iliaca_antero_superior_apv_anterior());
            jsonObject.put("str_joelho_apv_anterior", apvAnteriorBean.getStr_joelho_apv_anterior());
            jsonObject.put("str_ombro_apv_anterior", apvAnteriorBean.getStr_ombro_apv_anterior());
            jsonObject.put("str_patela_apv_anterior", apvAnteriorBean.getStr_patela_apv_anterior());
            jsonObject.put("str_tornozelo_pe_apv_anterior", apvAnteriorBean.getStr_tornozelo_pe_apv_anterior());

        }

        return jsonObject;
    }
}
