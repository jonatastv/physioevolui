
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.TipoMarchaBean;
import com.projetointegrador.physioevolui.builder.TipoMarchaBuilder;
import com.projetointegrador.physioevolui.service.TipoMarchaService;
import com.projetointegrador.physioevolui.utils.Utils;
import java.util.List;
import javax.validation.Valid;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jonatas
 */
@RestController
@RequestMapping(value = "/tipomarcha")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class TipoMarchaResource {
    
    @Autowired
    private TipoMarchaService tipoMarchaService;

    @Autowired
    private TipoMarchaBuilder tipoMarchaBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirTipoMarcha(@Valid @RequestBody TipoMarchaBean bean) {

        bean = tipoMarchaService.criarTipoMarcha(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_tipo_marcha().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarTipoMarcha(@Valid @RequestBody TipoMarchaBean bean) {

        bean = tipoMarchaService.alterarTipoMarcha(bean);

        return new ResponseEntity<>(tipoMarchaBuilder.montarJsonTipoMarchaBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarTipoMarchaID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(tipoMarchaBuilder.montarJsonTipoMarchaBean(tipoMarchaService.buscarTipoMarchaPorId(new TipoMarchaBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param tipoMarchaBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarTipoMarchaString(@Valid @RequestBody TipoMarchaBean tipoMarchaBean) {

        return new ResponseEntity<>(tipoMarchaBuilder.montarJsonListTipoMarchaBean(tipoMarchaService.buscarTipoMarchaPorString(tipoMarchaBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(tipoMarchaBuilder.montarJsonListTipoMarchaBean(tipoMarchaService.listarTipoMarcha()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarTipoMarcha(@Valid @RequestBody TipoMarchaBean bean) {

        tipoMarchaService.deletarTipoMarcha(bean);

        return ResponseEntity.ok().build();
    }
}

