
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.GoniometriaBean;
import com.projetointegrador.physioevolui.builder.GoniometriaBuilder;
import com.projetointegrador.physioevolui.service.GoniometriaService;
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
@RequestMapping(value = "/goniometria")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class GoniometriaResource {
    
    @Autowired
    private GoniometriaService goniometriaService;

    @Autowired
    private GoniometriaBuilder goniometriaBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirGoniometria(@Valid @RequestBody GoniometriaBean bean) {

        bean = goniometriaService.criarGoniometria(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_goniometria().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarGoniometria(@Valid @RequestBody GoniometriaBean bean) {

        bean = goniometriaService.alterarGoniometria(bean);

        return new ResponseEntity<>(goniometriaBuilder.montarJsonGoniometriaBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarGoniometriaID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(goniometriaBuilder.montarJsonGoniometriaBean(goniometriaService.buscarGoniometriaPorId(new GoniometriaBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param goniometriaBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarGoniometriaString(@Valid @RequestBody GoniometriaBean goniometriaBean) {

        return new ResponseEntity<>(goniometriaBuilder.montarJsonListGoniometriaBean(goniometriaService.buscarGoniometriaPorString(goniometriaBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(goniometriaBuilder.montarJsonListGoniometriaBean(goniometriaService.listarGoniometria()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarGoniometria(@Valid @RequestBody GoniometriaBean bean) {

        goniometriaService.deletarGoniometria(bean);

        return ResponseEntity.ok().build();
    }    
}

