/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.FisioterapeutaBean;
import com.projetointegrador.physioevolui.builder.FisioterapeutaBuilder;
import com.projetointegrador.physioevolui.service.FisioterapeutaService;
import com.projetointegrador.physioevolui.utils.Utils;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/fisioterapeuta")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class FisioterapeutaResource {

    @Autowired
    private FisioterapeutaService fisioterapeutaService;

    @Autowired
    private FisioterapeutaBuilder fisioterapeutaBuilder;

    @Autowired
    private Utils utils;

    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirUsuario(@Valid @RequestBody FisioterapeutaBean bean) {

        bean = fisioterapeutaService.criarFisioterapeuta(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_fisioterapeuta_id().toString())).build();
    }

    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarUsuario(@Valid @RequestBody FisioterapeutaBean bean) {

        bean = fisioterapeutaService.alterarFisioterapeuta(bean);

        return new ResponseEntity<>(fisioterapeutaBuilder.montarJsonFisioterapeutaBean(bean), HttpStatus.OK);
    }

    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarUsuarioID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(fisioterapeutaBuilder.montarJsonFisioterapeutaBean(fisioterapeutaService.buscarFisioterapeutaPorId(new FisioterapeutaBean(id))), HttpStatus.OK);
    }

    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarUsuarioString(@Valid @RequestBody FisioterapeutaBean fisioterapeutaBean) {

        return new ResponseEntity<>(fisioterapeutaBuilder.montarJsonListFisioterapeutaBean(fisioterapeutaService.buscarFisioterapeutaPorString(fisioterapeutaBean)), HttpStatus.OK);
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(fisioterapeutaBuilder.montarJsonListFisioterapeutaBean(fisioterapeutaService.listarFisioterapeutas()), HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarFisioterapeuta(@Valid @RequestBody FisioterapeutaBean bean) {

        fisioterapeutaService.deletarFisioterapeuta(bean);

        return ResponseEntity.ok().build();
    }    
}
