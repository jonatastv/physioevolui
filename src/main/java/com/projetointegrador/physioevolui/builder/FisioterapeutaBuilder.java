/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.FisioterapeutaBean;
import com.projetointegrador.physioevolui.entity.FisioterapeutaEntity;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FisioterapeutaBuilder {

    public FisioterapeutaBean montarFisioterapeutaBean(FisioterapeutaEntity fisioterapeutaEntity) {

        FisioterapeutaBean fisioterapeutaBean = new FisioterapeutaBean();

        if (fisioterapeutaEntity != null) {

            fisioterapeutaBean.setInt_fisioterapeuta_id(fisioterapeutaEntity.getInt_fisioterapeuta_id());
            fisioterapeutaBean.setStr_fisioterapeuta_nome(fisioterapeutaEntity.getStr_fisioterapeuta_nome());
            fisioterapeutaBean.setStr_rg(fisioterapeutaEntity.getStr_rg());
            fisioterapeutaBean.setStr_cpf(fisioterapeutaEntity.getStr_cpf());
            fisioterapeutaBean.setStr_cretito(fisioterapeutaEntity.getStr_cretito());
            fisioterapeutaBean.setStr_email(fisioterapeutaEntity.getStr_email());
            fisioterapeutaBean.setStr_telefone(fisioterapeutaEntity.getStr_telefone());
        }

        return fisioterapeutaBean;
    }

    public FisioterapeutaEntity montarFisioterapeutaEntity(FisioterapeutaBean bean) {

        FisioterapeutaEntity fisioterapeutaEntity = new FisioterapeutaEntity();

        if (bean != null) {

            fisioterapeutaEntity.setInt_fisioterapeuta_id(bean.getInt_fisioterapeuta_id());
            fisioterapeutaEntity.setStr_fisioterapeuta_nome(bean.getStr_fisioterapeuta_nome());
            fisioterapeutaEntity.setStr_rg(bean.getStr_rg());
            fisioterapeutaEntity.setStr_cpf(bean.getStr_cpf());
            fisioterapeutaEntity.setStr_cretito(bean.getStr_cretito());
            fisioterapeutaEntity.setStr_email(bean.getStr_email());
            fisioterapeutaEntity.setStr_telefone(bean.getStr_telefone());

        }

        return fisioterapeutaEntity;
    }

    public List<FisioterapeutaBean> montarListFisioterapeutaBean(List<FisioterapeutaEntity> fisioterapeutaEntityList) {

        List<FisioterapeutaBean> fisioterapeutaBeanList = new ArrayList<>();

        for (FisioterapeutaEntity entity : fisioterapeutaEntityList) {
            fisioterapeutaBeanList.add(montarFisioterapeutaBean(entity));
        }

        return fisioterapeutaBeanList;
    }

    public List<FisioterapeutaEntity> montarListFisioterapeutaEntity(List<FisioterapeutaBean> fisioterapeutaBeanList) {

        List<FisioterapeutaEntity> fisioterapeutaEntityList = new ArrayList<>();

        for (FisioterapeutaBean bean : fisioterapeutaBeanList) {
            fisioterapeutaEntityList.add(montarFisioterapeutaEntity(bean));
        }

        return fisioterapeutaEntityList;
    }

    public List<JSONObject> montarJsonListFisioterapeutaBean(List<FisioterapeutaBean> fisioterapeutaBeans) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (FisioterapeutaBean fisioterapeutaBean : fisioterapeutaBeans) {
            jsonObjectList.add(montarJsonFisioterapeutaBean(fisioterapeutaBean));
        }

        return jsonObjectList;
    }

    public JSONObject montarJsonFisioterapeutaBean(FisioterapeutaBean fisioterapeutaBean) {
        JSONObject jsonObject = new JSONObject();

        if (fisioterapeutaBean != null) {
            jsonObject.put("int_fisioterapeuta_id", fisioterapeutaBean.getInt_fisioterapeuta_id());
            jsonObject.put("str_fisioterapeuta_nome", fisioterapeutaBean.getStr_fisioterapeuta_nome());
            jsonObject.put("str_rg", fisioterapeutaBean.getStr_rg());
            jsonObject.put("str_cpf", fisioterapeutaBean.getStr_cpf());
            jsonObject.put("str_cretito", fisioterapeutaBean.getStr_cretito());
            jsonObject.put("str_email", fisioterapeutaBean.getStr_email());
            jsonObject.put("str_telefone", fisioterapeutaBean.getStr_telefone());
        }

        return jsonObject;
    }
}
