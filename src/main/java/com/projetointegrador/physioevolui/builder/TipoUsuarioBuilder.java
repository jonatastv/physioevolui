/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.TipoUsuarioBean;
import com.projetointegrador.physioevolui.entity.TipoUsuarioEntity;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoUsuarioBuilder {

    public TipoUsuarioBean montarTipoUsuarioBean(TipoUsuarioEntity tipoUsuarioEntity) {

        TipoUsuarioBean tipoUsuarioBean = new TipoUsuarioBean();

        if (tipoUsuarioEntity != null) {
            tipoUsuarioBean.setInt_tipo_usuario_id(tipoUsuarioEntity.getInt_tipo_usuario_id());
            tipoUsuarioBean.setInt_tipo_usuario(tipoUsuarioEntity.getInt_tipo_usuario());
            tipoUsuarioBean.setStr_desc_usuario(tipoUsuarioEntity.getStr_desc_usuario());
        }

        return tipoUsuarioBean;
    }

    public TipoUsuarioEntity montarTipoUsuarioEntity(TipoUsuarioBean tipoUsuarioBean) {

        TipoUsuarioEntity tipoUsuarioEntity = new TipoUsuarioEntity();

        if (tipoUsuarioBean != null) {
            tipoUsuarioEntity.setInt_tipo_usuario_id(tipoUsuarioBean.getInt_tipo_usuario_id());
            tipoUsuarioEntity.setInt_tipo_usuario(tipoUsuarioBean.getInt_tipo_usuario());
            tipoUsuarioEntity.setStr_desc_usuario(tipoUsuarioBean.getStr_desc_usuario());
        }

        return tipoUsuarioEntity;
    }

    public List<TipoUsuarioBean> montarListTipoUsuarioBean(List<TipoUsuarioEntity> tipoUsuarioEntities){

        List<TipoUsuarioBean> tipoUsuarioBeanList = new ArrayList<>();

        for (TipoUsuarioEntity entity : tipoUsuarioEntities){
            tipoUsuarioBeanList.add(montarTipoUsuarioBean(entity));
        }

        return tipoUsuarioBeanList;
    }

    public List<TipoUsuarioEntity> montarListTipoUsuarioEntity(List<TipoUsuarioBean> tipoUsuarioBeanList){

        List<TipoUsuarioEntity> usuarioEntityList= new ArrayList<>();

        for (TipoUsuarioBean bean : tipoUsuarioBeanList){
            usuarioEntityList.add(montarTipoUsuarioEntity(bean));
        }

        return usuarioEntityList;
    }

    public List<JSONObject> montarJsonListTipoUsuarioBean(List<TipoUsuarioBean> tipoUsuarioBeanList) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (TipoUsuarioBean tipoUsuarioBean : tipoUsuarioBeanList) {
            jsonObjectList.add(montarJsonTipoUsuarioBean(tipoUsuarioBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonTipoUsuarioBean(TipoUsuarioBean tipoUsuarioBean) {
        JSONObject jsonObject = new JSONObject();

            jsonObject.put("int_tipo_usuario_id", tipoUsuarioBean.getInt_tipo_usuario_id());
            jsonObject.put("int_tipo_usuario", tipoUsuarioBean.getInt_tipo_usuario());
            jsonObject.put("str_desc_usuario", tipoUsuarioBean.getStr_desc_usuario());

            return jsonObject;
    }
}
