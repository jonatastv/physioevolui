
package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.TipoMarchaBean;
import com.projetointegrador.physioevolui.entity.TipoMarchaEntity;
import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonatas
 */
@Component
public class TipoMarchaBuilder {
    
    
    
    public TipoMarchaBean montarTipoMarchaBean(TipoMarchaEntity tipoMarchaEntity) {

        TipoMarchaBean tipoMarchaBean = new TipoMarchaBean();

        if (tipoMarchaEntity != null) {

            tipoMarchaBean.setInt_id_tipo_marcha(tipoMarchaEntity.getInt_id_tipo_marcha());
            tipoMarchaBean.setStr_tipo_marcha_tipo_marcha(tipoMarchaEntity.getStr_tipo_marcha_tipo_marcha());
            tipoMarchaBean.setStr_arquivo_tipo_marcha(tipoMarchaEntity.getStr_arquivo_tipo_marcha());


        }

        return tipoMarchaBean;
    }

    public TipoMarchaEntity montarTipoMarchaEntity(TipoMarchaBean bean) {

        TipoMarchaEntity tipoMarchaEntity = new TipoMarchaEntity();

        if (bean != null) {
   
            tipoMarchaEntity.setInt_id_tipo_marcha(bean.getInt_id_tipo_marcha());
            tipoMarchaEntity.setStr_tipo_marcha_tipo_marcha(bean.getStr_tipo_marcha_tipo_marcha());
            tipoMarchaEntity.setStr_arquivo_tipo_marcha(bean.getStr_arquivo_tipo_marcha());

        }

        return tipoMarchaEntity;
    }

    public List<TipoMarchaBean> montarListTipoMarchaBean(List<TipoMarchaEntity> tipoMarchaEntityList) {

        List<TipoMarchaBean> tipoMarchaBeanList = new ArrayList<>();

        for (TipoMarchaEntity entity : tipoMarchaEntityList) {
            tipoMarchaBeanList.add(montarTipoMarchaBean(entity));
        }

        return tipoMarchaBeanList;
    }

    public List<TipoMarchaEntity> montarListTipoMarchaEntity(List<TipoMarchaBean> tipoMarchaBeanList) {

        List<TipoMarchaEntity> tipoMarchaEntityList = new ArrayList<>();

        for (TipoMarchaBean bean : tipoMarchaBeanList) {
            tipoMarchaEntityList.add(montarTipoMarchaEntity(bean));
        }

        return tipoMarchaEntityList;
    }

    public List<JSONObject> montarJsonListTipoMarchaBean(List<TipoMarchaBean> tipoMarchaBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (TipoMarchaBean tipoMarchaBean : tipoMarchaBeans) {
            jsonObjectList.add(montarJsonTipoMarchaBean(tipoMarchaBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonTipoMarchaBean(TipoMarchaBean tipoMarchaBean) {
        JSONObject jsonObject = new JSONObject();

        if (tipoMarchaBean != null) {
            jsonObject.put("int_id_tipo_marcha", tipoMarchaBean.getInt_id_tipo_marcha());
            jsonObject.put("str_tipo_marcha_tipo_marcha", tipoMarchaBean.getStr_tipo_marcha_tipo_marcha());
            jsonObject.put("str_arquivo_tipo_marcha", tipoMarchaBean.getStr_arquivo_tipo_marcha());

        }

        return jsonObject;
    }
}

