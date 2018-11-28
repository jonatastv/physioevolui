
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.GoniometriaBean;
import com.projetointegrador.physioevolui.entity.GoniometriaEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class GoniometriaBuilder {
    
    
    
    public GoniometriaBean montarGoniometriaBean(GoniometriaEntity goniometriaEntity) {

        GoniometriaBean goniometriaBean = new GoniometriaBean();

        if (goniometriaEntity != null) {

            goniometriaBean.setInt_id_goniometria(goniometriaEntity.getInt_id_goniometria());
            goniometriaBean.setInt_ombro_goniometria(goniometriaEntity.getInt_ombro_goniometria());
            goniometriaBean.setInt_cotovelo_goniometria(goniometriaEntity.getInt_cotovelo_goniometria());
            goniometriaBean.setInt_punho_goniometria(goniometriaEntity.getInt_punho_goniometria());
            goniometriaBean.setInt_quadril_goniometria(goniometriaEntity.getInt_quadril_goniometria());
            goniometriaBean.setInt_joelho_goniometria(goniometriaEntity.getInt_joelho_goniometria());
            goniometriaBean.setInt_tornozelo_goniometria(goniometriaEntity.getInt_tornozelo_goniometria());
            goniometriaBean.setInt_coluna_vertebral_goniometria(goniometriaEntity.getInt_coluna_vertebral_goniometria());
            goniometriaBean.setInt_articulacao_temporomandibular_goniometria(goniometriaEntity.getInt_articulacao_temporomandibular_goniometria());
            
        }

        return goniometriaBean;
    }

    public GoniometriaEntity montarGoniometriaEntity(GoniometriaBean bean) {

        GoniometriaEntity goniometriaEntity = new GoniometriaEntity();

        if (bean != null) {
   

            
            goniometriaEntity.setInt_id_goniometria(bean.getInt_id_goniometria());
            goniometriaEntity.setInt_articulacao_temporomandibular_goniometria(bean.getInt_articulacao_temporomandibular_goniometria());
            goniometriaEntity.setInt_coluna_vertebral_goniometria(bean.getInt_coluna_vertebral_goniometria());
            goniometriaEntity.setInt_cotovelo_goniometria(bean.getInt_cotovelo_goniometria());
            goniometriaEntity.setInt_joelho_goniometria(bean.getInt_joelho_goniometria());
            goniometriaEntity.setInt_ombro_goniometria(bean.getInt_ombro_goniometria());
            goniometriaEntity.setInt_punho_goniometria(bean.getInt_punho_goniometria());
            goniometriaEntity.setInt_quadril_goniometria(bean.getInt_quadril_goniometria());
            goniometriaEntity.setInt_tornozelo_goniometria(bean.getInt_tornozelo_goniometria());

        }

        return goniometriaEntity;
    }

    public List<GoniometriaBean> montarListGoniometriaBean(List<GoniometriaEntity> goniometriaEntityList) {

        List<GoniometriaBean> goniometriaBeanList = new ArrayList<>();

        for (GoniometriaEntity entity : goniometriaEntityList) {
            goniometriaBeanList.add(montarGoniometriaBean(entity));
        }

        return goniometriaBeanList;
    }

    public List<GoniometriaEntity> montarListGoniometriaEntity(List<GoniometriaBean> goniometriaBeanList) {

        List<GoniometriaEntity> goniometriaEntityList = new ArrayList<>();

        for (GoniometriaBean bean : goniometriaBeanList) {
            goniometriaEntityList.add(montarGoniometriaEntity(bean));
        }

        return goniometriaEntityList;
    }

    public List<JSONObject> montarJsonListGoniometriaBean(List<GoniometriaBean> goniometriaBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (GoniometriaBean goniometriaBean : goniometriaBeans) {
            jsonObjectList.add(montarJsonGoniometriaBean(goniometriaBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonGoniometriaBean(GoniometriaBean goniometriaBean) {
        JSONObject jsonObject = new JSONObject();

        if (goniometriaBean != null) {
            jsonObject.put("int_id_goniometria", goniometriaBean.getInt_id_goniometria());
            jsonObject.put("int_articulacao_temporomandibular_goniometria", goniometriaBean.getInt_articulacao_temporomandibular_goniometria());
            jsonObject.put("int_coluna_vertebral_goniometria", goniometriaBean.getInt_coluna_vertebral_goniometria());
            jsonObject.put("int_cotovelo_goniometria", goniometriaBean.getInt_cotovelo_goniometria());
            jsonObject.put("int_joelho_goniometria", goniometriaBean.getInt_joelho_goniometria());
            jsonObject.put("int_ombro_goniometria", goniometriaBean.getInt_ombro_goniometria());
            jsonObject.put("int_punho_goniometria", goniometriaBean.getInt_punho_goniometria());
            jsonObject.put("int_quadril_goniometria", goniometriaBean.getInt_quadril_goniometria());
            jsonObject.put("int_tornozelo_goniometria", goniometriaBean.getInt_tornozelo_goniometria());
            
        }

        return jsonObject;
    }
}
