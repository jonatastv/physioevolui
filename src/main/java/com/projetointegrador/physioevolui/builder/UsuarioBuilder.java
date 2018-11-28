/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.builder;

import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.entity.UsuarioEntity;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe utilizada para converter dados da tela para a entidade, entidade para tela e para montar o Json de retorno
 */
@Component
public class UsuarioBuilder {

    @Autowired
    private TipoUsuarioBuilder tipoUsuarioBuilder;

    /**
     * método para converter o dado que vem da entidade para a tela
     * @param usuarioEntity
     * @return
     */
    public UsuarioBean montarUsuarioBean(UsuarioEntity usuarioEntity) {
        UsuarioBean usuarioBean = new UsuarioBean();
        if (usuarioEntity != null) {
            usuarioBean.setInt_usuario_id(usuarioEntity.getInt_usuario_id());
            usuarioBean.setStr_login(usuarioEntity.getStr_login());
            usuarioBean.setStr_password(usuarioEntity.getStr_password());
            if (usuarioEntity.getTipoUsuarioEntity() != null)
                usuarioBean.setTipoUsuarioBean(tipoUsuarioBuilder.montarTipoUsuarioBean(usuarioEntity.getTipoUsuarioEntity()));
        }
        return usuarioBean;
    }

    /**
     * método para converter o dado que vem da tela para a entidade
     * @param bean
     * @return
     */
    public UsuarioEntity montarUsuarioEntity(UsuarioBean bean) {

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setInt_usuario_id(bean.getInt_usuario_id());
        usuarioEntity.setStr_login(bean.getStr_login());
        usuarioEntity.setStr_password(bean.getStr_password());
        usuarioEntity.setTipoUsuarioEntity(tipoUsuarioBuilder.montarTipoUsuarioEntity(bean.getTipoUsuarioBean()));

        return usuarioEntity;
    }

    /**
     * método para converter dados que vem da entidade para a tela
     * @param usuarioEntityList
     * @return
     */
    public List<UsuarioBean> montarListUsuarioBean(List<UsuarioEntity> usuarioEntityList) {

        List<UsuarioBean> usuarioBeanList = new ArrayList<>();

        for (UsuarioEntity entity : usuarioEntityList) {
            usuarioBeanList.add(montarUsuarioBean(entity));
        }

        return usuarioBeanList;
    }

    /**
     * método para converter dados que vem da tela para a entidade
     * @param usuarioBeanList
     * @return
     */
    public List<UsuarioEntity> montarListUsuarioEntity(List<UsuarioBean> usuarioBeanList) {

        List<UsuarioEntity> usuarioEntityList = new ArrayList<>();

        for (UsuarioBean bean : usuarioBeanList) {
            usuarioEntityList.add(montarUsuarioEntity(bean));
        }

        return usuarioEntityList;
    }

    /**
     * método para montar uma lista de Json de retorno
     * @param usuarioBeanList
     * @return
     */
         public List<JSONObject> montarJsonListUsuarioBean(List<UsuarioBean> usuarioBeanList) {
        List<JSONObject> jsonObjectList = new ArrayList<>();

        for (UsuarioBean usuarioBean : usuarioBeanList) {
            jsonObjectList.add(montarJsonUsuarioBean(usuarioBean));
        }

        return jsonObjectList;
    }

    /**
     * método para montar um objeto Json para o retorno
     * @param usuarioBean
     * @return
     */
    public JSONObject montarJsonUsuarioBean(UsuarioBean usuarioBean) {
        JSONObject jsonObject = new JSONObject();
        if (usuarioBean != null) {
            if (usuarioBean.getErroBean() != null) {
                jsonObject.put("is_erro", usuarioBean.getErroBean().getErro());
                if (usuarioBean.getErroBean().getStackTrace() != null)
                jsonObject.put("stack_trace", usuarioBean.getErroBean().getStackTrace());
                if (!usuarioBean.getErroBean().getMessage().isEmpty())
                    jsonObject.put("msg", usuarioBean.getErroBean().getMessage());
            } else {
                jsonObject.put("int_usuario_id", usuarioBean.getInt_usuario_id());
                jsonObject.put("str_login", usuarioBean.getStr_login());
                jsonObject.put("str_password", usuarioBean.getStr_password());

                if (usuarioBean.getTipoUsuarioBean() != null)
                    jsonObject.put("tipoUsuarioBean", usuarioBean.getTipoUsuarioBean().getInt_tipo_usuario());
                if (usuarioBean.getFisioterapeutaBean() != null)
                    jsonObject.put("fisioterapeutaBean", usuarioBean.getFisioterapeutaBean().getInt_fisioterapeuta_id());
            }
        }

        return jsonObject;
    }
}
