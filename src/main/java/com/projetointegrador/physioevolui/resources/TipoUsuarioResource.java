/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.TipoUsuarioBean;
import com.projetointegrador.physioevolui.builder.TipoUsuarioBuilder;
import com.projetointegrador.physioevolui.service.TipoUsuarioService;
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
@RequestMapping(value = "/tipousuario")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class TipoUsuarioResource {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @Autowired
    private TipoUsuarioBuilder tipoUsuarioBuilder;

    @Autowired
    private Utils utils;

    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirTipoUsuario(@Valid @RequestBody TipoUsuarioBean bean) {

        bean = tipoUsuarioService.criarTipoUsuario(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_tipo_usuario_id().toString())).build();
    }

    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarTipoUsuario(@Valid @RequestBody TipoUsuarioBean bean) {

        bean = tipoUsuarioService.alterarTipoUsuario(bean);

        return new ResponseEntity<>(tipoUsuarioBuilder.montarJsonTipoUsuarioBean(bean), HttpStatus.OK);
    }

    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarTipoUsuarioID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(tipoUsuarioBuilder.montarJsonTipoUsuarioBean(tipoUsuarioService.buscarTipoUsuarioPorId(new TipoUsuarioBean(id))), HttpStatus.OK);
    }

    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarTipoUsuarioString(@Valid @RequestBody TipoUsuarioBean TipoUsuarioBean) {

        return new ResponseEntity<>(tipoUsuarioBuilder.montarJsonListTipoUsuarioBean(tipoUsuarioService.buscarTipoUsuarioPorString(TipoUsuarioBean)), HttpStatus.OK);
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos() {

        return new ResponseEntity<>(tipoUsuarioBuilder.montarJsonListTipoUsuarioBean(tipoUsuarioService.listarTiposUsuarios()), HttpStatus.OK);
    }

}
