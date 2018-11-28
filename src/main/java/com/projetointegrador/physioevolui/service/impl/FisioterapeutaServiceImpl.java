/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.FisioterapeutaDAO;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.FisioterapeutaBean;
import com.projetointegrador.physioevolui.builder.FisioterapeutaBuilder;
import com.projetointegrador.physioevolui.service.FisioterapeutaService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@Transactional
public class FisioterapeutaServiceImpl implements FisioterapeutaService{

    @Autowired
    private FisioterapeutaDAO fisioterapeutaDAO;

    @Autowired
    private FisioterapeutaBuilder fisioterapeutaBuilder;

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public FisioterapeutaBean  criarFisioterapeuta(FisioterapeutaBean  fisioterapeutaBean){
        try {
            return fisioterapeutaBuilder.montarFisioterapeutaBean(fisioterapeutaDAO.incluir(fisioterapeutaBuilder.montarFisioterapeutaEntity(fisioterapeutaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
        @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
            public void deletarFisioterapeuta(FisioterapeutaBean fisioterapeutaBean){
        
        try {
            fisioterapeutaDAO.excluir(fisioterapeutaBean.getInt_fisioterapeuta_id());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(FisioterapeutaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public FisioterapeutaBean  alterarFisioterapeuta(FisioterapeutaBean  fisioterapeutaBean){
        try {
            return fisioterapeutaBuilder.montarFisioterapeutaBean (fisioterapeutaDAO.alterar(fisioterapeutaBuilder.montarFisioterapeutaEntity(fisioterapeutaBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public FisioterapeutaBean  buscarFisioterapeutaPorId(FisioterapeutaBean  fisioterapeutaBean) {
        try {
            fisioterapeutaBean = fisioterapeutaBuilder.montarFisioterapeutaBean (fisioterapeutaDAO.consultarPorId(fisioterapeutaBean.getInt_fisioterapeuta_id()));
            if (fisioterapeutaBean.getStr_fisioterapeuta_nome() == null){
                fisioterapeutaBean.setStr_fisioterapeuta_nome("Não encontrado");
            }
            return fisioterapeutaBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.REQUIRED)
    public List<FisioterapeutaBean > buscarFisioterapeutaPorString(FisioterapeutaBean  fisioterapeutaBean) {
        try {

            List<FisioterapeutaBean > fisioterapeutaBeanList = fisioterapeutaBuilder.montarListFisioterapeutaBean (fisioterapeutaDAO.consultarPorString("str_fisioterapeuta_nome",fisioterapeutaBean.getStr_fisioterapeuta_nome()));

            if (fisioterapeutaBean.getStr_fisioterapeuta_nome() == null){
                fisioterapeutaBean.setStr_fisioterapeuta_nome("Não encontrado");
            }
            return fisioterapeutaBeanList;
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    @Transactional(readOnly=true, propagation = Propagation.SUPPORTS)
    public List<FisioterapeutaBean > listarFisioterapeutas() {
        try {
            return fisioterapeutaBuilder.montarListFisioterapeutaBean (fisioterapeutaDAO.listar());
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    private List<FisioterapeutaBean> montarListaErro(Exception e) {
        List<FisioterapeutaBean> beans = new ArrayList<>();
        beans.add(new FisioterapeutaBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    private FisioterapeutaBean montarErro(Exception e) {
        return new FisioterapeutaBean(new ErroBean(true, e.getStackTrace()));
    }
}
