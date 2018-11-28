
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.AvaliacaoPosturalVistaPosteriorBean;
import com.projetointegrador.physioevolui.bean.FisioterapeutaBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.AvaliacaoPosturalVistaPosteriorBuilder;
import com.projetointegrador.physioevolui.service.AvaliacaoPosturalVistaPosteriorService;
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
@RequestMapping(value = "/avposturalposterior")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AvaliacaoPosturalVistaPosteriorResource {
    
    @Autowired
    private AvaliacaoPosturalVistaPosteriorBuilder avaliacaoPosturalVistaPosteriorBuilder;
    
    @Autowired
    private AvaliacaoPosturalVistaPosteriorService avaliacaoPosturalVistaPosteriorService;
    
    @Autowired
    private Utils utils;
    
    
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirUsuario(@Valid @RequestBody AvaliacaoPosturalVistaPosteriorBean bean) {

        bean = avaliacaoPosturalVistaPosteriorService.criarAvaliacaoPosturalVistaPosterior(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getAvaliacaoposturalvistaposterior_id().toString())).build();
    }
        @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
        public ResponseEntity<?> alterarUsuario(@Valid @RequestBody AvaliacaoPosturalVistaPosteriorBean bean) {

        bean = avaliacaoPosturalVistaPosteriorService.alterarAvaliacaoPosturalVistaPosterior(bean);

        return new ResponseEntity<>(avaliacaoPosturalVistaPosteriorBuilder.montarJsonListAvaliacaoPosturalVistaPosteriorBean(bean), HttpStatus.OK);
    }
 
        @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<JSONObject> buscarUsuarioID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(avaliacaoPosturalVistaPosteriorBuilder.montarJsonListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorService.buscarAvaliacaoPosturalVistaPosteriorPorId(new AvaliacaoPosturalVistaPosteriorBean(id))), HttpStatus.OK);
    }
         
        @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<List<JSONObject>> buscarUsuarioString(@Valid @RequestBody AvaliacaoPosturalVistaPosteriorBean avaliacaoPosturalVistaPosteriorBean) {

        return new ResponseEntity<>(avaliacaoPosturalVistaPosteriorBuilder.montarJsonListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorService.buscarAvaliacaoPosturalVistaPosteriorPorString(avaliacaoPosturalVistaPosteriorBean)), HttpStatus.OK);
    }
        
        @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(avaliacaoPosturalVistaPosteriorBuilder.montarJsonListAvaliacaoPosturalVistaPosteriorBean(avaliacaoPosturalVistaPosteriorService.listarAvaliacaoPosturalVistaPosterior()), HttpStatus.OK);
    }
        
        
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarAvaliacaoPosturalVistaPosterior(@Valid @RequestBody AvaliacaoPosturalVistaPosteriorBean bean) {

        avaliacaoPosturalVistaPosteriorService.deletarAvaliacaoPosturalVistaPosterior(bean);

        return ResponseEntity.ok().build();
    }        
    
}
