
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.AvaliacaoBean;
import com.projetointegrador.physioevolui.builder.AvaliacaoBuilder;
import com.projetointegrador.physioevolui.service.AvaliacaoService;
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
@RequestMapping(value = "/avaliacao")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AvaliacaoResource {
    
    @Autowired
    private AvaliacaoService avaliacaoService;

    @Autowired
    private AvaliacaoBuilder avaliacaoBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirAvaliacao(@Valid @RequestBody AvaliacaoBean bean) {

        bean = avaliacaoService.criarAvaliacao(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_avaliacao_id().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarAvaliacao(@Valid @RequestBody AvaliacaoBean bean) {

        bean = avaliacaoService.alterarAvaliacao(bean);

        return new ResponseEntity<>(avaliacaoBuilder.montarJsonAvaliacaoBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarAvaliacaoID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(avaliacaoBuilder.montarJsonAvaliacaoBean(avaliacaoService.buscarAvaliacaoPorId(new AvaliacaoBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param avaliacaoBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarAvaliacaoString(@Valid @RequestBody AvaliacaoBean avaliacaoBean) {

        return new ResponseEntity<>(avaliacaoBuilder.montarJsonListAvaliacaoBean(avaliacaoService.buscarAvaliacaoPorString(avaliacaoBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(avaliacaoBuilder.montarJsonListAvaliacaoBean(avaliacaoService.listarAvaliacao()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarAvaliacao(@Valid @RequestBody AvaliacaoBean bean) {

        avaliacaoService.deletarAvaliacao(bean);

        return ResponseEntity.ok().build();
    }    
}

