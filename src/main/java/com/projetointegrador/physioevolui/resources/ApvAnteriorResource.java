
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.ApvAnteriorBean;
import com.projetointegrador.physioevolui.builder.ApvAnteriorBuilder;
import com.projetointegrador.physioevolui.service.ApvAnteriorService;
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
@RequestMapping(value = "/apvanterior")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ApvAnteriorResource {
    
    @Autowired
    private ApvAnteriorService apvAnteriorService;

    @Autowired
    private ApvAnteriorBuilder apvAnteriorBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirApvAnterior(@Valid @RequestBody ApvAnteriorBean bean) {

        bean = apvAnteriorService.criarApvAnterior(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_apv_anterior().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarApvAnterior(@Valid @RequestBody ApvAnteriorBean bean) {

        bean = apvAnteriorService.alterarApvAnterior(bean);

        return new ResponseEntity<>(apvAnteriorBuilder.montarJsonApvAnteriorBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarApvAnteriorID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(apvAnteriorBuilder.montarJsonApvAnteriorBean(apvAnteriorService.buscarApvAnteriorPorId(new ApvAnteriorBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param apvAnteriorBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarApvAnteriorString(@Valid @RequestBody ApvAnteriorBean apvAnteriorBean) {

        return new ResponseEntity<>(apvAnteriorBuilder.montarJsonListApvAnteriorBean(apvAnteriorService.buscarApvAnteriorPorString(apvAnteriorBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(apvAnteriorBuilder.montarJsonListApvAnteriorBean(apvAnteriorService.listarApvAnterior()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarApvAnterior(@Valid @RequestBody ApvAnteriorBean bean) {

        apvAnteriorService.deletarApvAnterior(bean);

        return ResponseEntity.ok().build();
    }    
}

