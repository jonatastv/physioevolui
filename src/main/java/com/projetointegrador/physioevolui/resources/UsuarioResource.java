/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.UsuarioBuilder;
import com.projetointegrador.physioevolui.service.UsuarioService;
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
 * classe responsavel pelos links das requisições pertencentes ao usuario
 */
@RestController
@RequestMapping(value = "/usuario")
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioBuilder usuarioBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirUsuario(@Valid @RequestBody UsuarioBean bean) {

        bean = usuarioService.criarUsuario(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_usuario_id().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarUsuario(@Valid @RequestBody UsuarioBean bean) {

        bean = usuarioService.alterarUsuario(bean);

        return new ResponseEntity<>(usuarioBuilder.montarJsonUsuarioBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarUsuarioID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(usuarioBuilder.montarJsonUsuarioBean(usuarioService.buscarUsuarioPorId(new UsuarioBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param usuarioBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarUsuarioString(@Valid @RequestBody UsuarioBean usuarioBean) {

        return new ResponseEntity<>(usuarioBuilder.montarJsonListUsuarioBean(usuarioService.buscarUsuarioPorString(usuarioBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(usuarioBuilder.montarJsonListUsuarioBean(usuarioService.listarUsuarios()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarUsuario(@Valid @RequestBody UsuarioBean bean) {

        usuarioService.deletarUsuario(bean);

        return ResponseEntity.ok().build();
    }
}
