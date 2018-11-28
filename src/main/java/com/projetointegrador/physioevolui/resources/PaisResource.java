
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.PaisBean;
import com.projetointegrador.physioevolui.builder.PaisBuilder;
import com.projetointegrador.physioevolui.service.PaisService;
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
@RequestMapping(value = "/pais")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PaisResource {
    
    
    @Autowired
    private PaisService paisService;

    @Autowired
    private PaisBuilder paisBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirPais(@Valid @RequestBody PaisBean bean) {

        bean = paisService.criarPais(bean);
        
        return ResponseEntity.created(utils.retornarURL(bean.getPais_id().toString())).build();

       // return ResponseEntity.created(utils.retornarURL(bean.getInt_id_pais().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarPais(@Valid @RequestBody PaisBean bean) {

        bean = paisService.alterarPais(bean);

        return new ResponseEntity<>(paisBuilder.montarJsonPaisBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarPaisID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(paisBuilder.montarJsonPaisBean(paisService.buscarPaisPorId(new PaisBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param PaisBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarPaisString(@Valid @RequestBody PaisBean PaisBean) {

        return new ResponseEntity<>(paisBuilder.montarJsonListPaisBean(paisService.buscarPaisPorString(PaisBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(paisBuilder.montarJsonListPaisBean(paisService.listarPais()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarPais(@Valid @RequestBody PaisBean bean) {

        paisService.deletarPais(bean);

        return ResponseEntity.ok().build();
    }    
    
}
