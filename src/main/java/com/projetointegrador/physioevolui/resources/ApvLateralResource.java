
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.ApvLateralBean;
import com.projetointegrador.physioevolui.builder.ApvLateralBuilder;
import com.projetointegrador.physioevolui.service.ApvLateralService;
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
@RequestMapping(value = "/apvlateral")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ApvLateralResource {
    
    @Autowired
    private ApvLateralService apvLateralService;

    @Autowired
    private ApvLateralBuilder apvLateralBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirApvLateral(@Valid @RequestBody ApvLateralBean bean) {

        bean = apvLateralService.criarApvLateral(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_apv_lateral().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarApvLateral(@Valid @RequestBody ApvLateralBean bean) {

        bean = apvLateralService.alterarApvLateral(bean);

        return new ResponseEntity<>(apvLateralBuilder.montarJsonApvLateralBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarApvLateralID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(apvLateralBuilder.montarJsonApvLateralBean(apvLateralService.buscarApvLateralPorId(new ApvLateralBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param apvLateralBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarApvLateralString(@Valid @RequestBody ApvLateralBean apvLateralBean) {

        return new ResponseEntity<>(apvLateralBuilder.montarJsonListApvLateralBean(apvLateralService.buscarApvLateralPorString(apvLateralBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(apvLateralBuilder.montarJsonListApvLateralBean(apvLateralService.listarApvLateral()), HttpStatus.OK);
    }
    
    
     @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarApvLateral(@Valid @RequestBody ApvLateralBean bean) {

        apvLateralService.deletarApvLateral(bean);

        return ResponseEntity.ok().build();
    }   
}

