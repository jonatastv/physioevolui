
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.PerimetriaBean;
import com.projetointegrador.physioevolui.builder.PerimetriaBuilder;
import com.projetointegrador.physioevolui.service.PerimetriaService;
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
@RequestMapping(value = "/perimetria")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PerimetriaResource {
    
    
    @Autowired
    private PerimetriaService perimetriaService;

    @Autowired
    private PerimetriaBuilder perimetriaBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirPerimetria(@Valid @RequestBody PerimetriaBean bean) {

        bean = perimetriaService.criarPerimetria(bean);
        
        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_perimetria().toString())).build();

       // return ResponseEntity.created(utils.retornarURL(bean.getInt_id_perimetria().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarPerimetria(@Valid @RequestBody PerimetriaBean bean) {

        bean = perimetriaService.alterarPerimetria(bean);

        return new ResponseEntity<>(perimetriaBuilder.montarJsonPerimetriaBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarPerimetriaID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(perimetriaBuilder.montarJsonPerimetriaBean(perimetriaService.buscarPerimetriaPorId(new PerimetriaBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param PerimetriaBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarPerimetriaString(@Valid @RequestBody PerimetriaBean PerimetriaBean) {

        return new ResponseEntity<>(perimetriaBuilder.montarJsonListPerimetriaBean(perimetriaService.buscarPerimetriaPorString(PerimetriaBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(perimetriaBuilder.montarJsonListPerimetriaBean(perimetriaService.listarPerimetria()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarPerimetria(@Valid @RequestBody PerimetriaBean bean) {

        perimetriaService.deletarPerimetria(bean);

        return ResponseEntity.ok().build();
    }    
    
}
