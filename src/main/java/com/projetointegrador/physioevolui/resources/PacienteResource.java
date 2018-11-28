/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.PacienteBean;
import com.projetointegrador.physioevolui.builder.PacienteBuilder;
import com.projetointegrador.physioevolui.service.PacienteService;
import com.projetointegrador.physioevolui.utils.Utils;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * classe responsavel pelos links das requisições pertencentes ao paciente
 */
@RestController
@RequestMapping(value = "/paciente")
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PacienteResource {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private PacienteBuilder pacienteBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirPaciente(@Valid @RequestBody PacienteBean bean) {

        bean = pacienteService.criarPaciente(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_paciente().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarPaciente(@Valid @RequestBody PacienteBean bean) {

        bean = pacienteService.alterarPaciente(bean);

        return new ResponseEntity<>(pacienteBuilder.montarJsonPacienteBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarPacienteID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(pacienteBuilder.montarJsonPacienteBean(pacienteService.buscarPacientePorId(new PacienteBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param pacienteBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarPacienteString(@Valid @RequestBody PacienteBean pacienteBean) {

        return new ResponseEntity<>(pacienteBuilder.montarJsonListPacienteBean(pacienteService.buscarPacientePorString(pacienteBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(pacienteBuilder.montarJsonListPacienteBean(pacienteService.listarPaciente()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarPaciente(@Valid @RequestBody PacienteBean bean) {

        pacienteService.deletarPaciente(bean);

        return ResponseEntity.ok().build();
    }
}
