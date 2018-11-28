
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.UfBean;
import com.projetointegrador.physioevolui.builder.UfBuilder;
import com.projetointegrador.physioevolui.service.UfService;
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
@RequestMapping(value = "/uf")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UfResource {
    
    
    @Autowired
    private UfService ufService;

    @Autowired
    private UfBuilder ufBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirUf(@Valid @RequestBody UfBean bean) {

        bean = ufService.criarUf(bean);
        
        return ResponseEntity.created(utils.retornarURL(bean.getUf_id().toString())).build();

       // return ResponseEntity.created(utils.retornarURL(bean.getInt_id_uf().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarUf(@Valid @RequestBody UfBean bean) {

        bean = ufService.alterarUf(bean);

        return new ResponseEntity<>(ufBuilder.montarJsonUfBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarUfID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(ufBuilder.montarJsonUfBean(ufService.buscarUfPorId(new UfBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param UfBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarUfString(@Valid @RequestBody UfBean UfBean) {

        return new ResponseEntity<>(ufBuilder.montarJsonListUfBean(ufService.buscarUfPorString(UfBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(ufBuilder.montarJsonListUfBean(ufService.listarUf()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarUf(@Valid @RequestBody UfBean bean) {

        ufService.deletarUf(bean);

        return ResponseEntity.ok().build();
    }    
    
}
