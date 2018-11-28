
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.CidadeBean;
import com.projetointegrador.physioevolui.builder.CidadeBuilder;
import com.projetointegrador.physioevolui.service.CidadeService;
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
@RequestMapping(value = "/cidade")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CidadeResource {
    
    @Autowired
    private CidadeService cidadeService;

    @Autowired
    private CidadeBuilder cidadeBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirCidade(@Valid @RequestBody CidadeBean bean) {

        bean = cidadeService.criarCidade(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getCidade_id().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarCidade(@Valid @RequestBody CidadeBean bean) {

        bean = cidadeService.alterarCidade(bean);

        return new ResponseEntity<>(cidadeBuilder.montarJsonCidadeBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarCidadeID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(cidadeBuilder.montarJsonCidadeBean(cidadeService.buscarCidadePorId(new CidadeBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param cidadeBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarCidadeString(@Valid @RequestBody CidadeBean cidadeBean) {

        return new ResponseEntity<>(cidadeBuilder.montarJsonListCidadeBean(cidadeService.buscarCidadePorString(cidadeBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(cidadeBuilder.montarJsonListCidadeBean(cidadeService.listarCidade()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarCidade(@Valid @RequestBody CidadeBean bean) {

        cidadeService.deletarCidade(bean);

        return ResponseEntity.ok().build();
    }    
}

