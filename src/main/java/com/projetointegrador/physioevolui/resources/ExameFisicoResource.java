
package com.projetointegrador.physioevolui.resources;

import com.projetointegrador.physioevolui.bean.ExameFisicoBean;
import com.projetointegrador.physioevolui.builder.ExameFisicoBuilder;
import com.projetointegrador.physioevolui.service.ExameFisicoService;
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
@RequestMapping(value = "/examefisico")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ExameFisicoResource {
    
    @Autowired
    private ExameFisicoService exameFisicoService;

    @Autowired
    private ExameFisicoBuilder exameFisicoBuilder;

    @Autowired
    private Utils utils;

    /**
     * método responsavel pelo inserir
     * @param bean
     * @return
     */
    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public ResponseEntity<Void> inserirExameFisico(@Valid @RequestBody ExameFisicoBean bean) {

        bean = exameFisicoService.criarExameFisico(bean);

        return ResponseEntity.created(utils.retornarURL(bean.getInt_id_exame_fisico().toString())).build();
    }

    /**
     * método responsavel pelo alterar
     * @param bean
     * @return
     */
    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public ResponseEntity<?> alterarExameFisico(@Valid @RequestBody ExameFisicoBean bean) {

        bean = exameFisicoService.alterarExameFisico(bean);

        return new ResponseEntity<>(exameFisicoBuilder.montarJsonExameFisicoBean(bean), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por id
     * @param id
     * @return
     */
    @RequestMapping(value = "/buscarId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JSONObject> buscarExameFisicoID(@Valid @PathVariable("id") Integer id) {

        return new ResponseEntity<>(exameFisicoBuilder.montarJsonExameFisicoBean(exameFisicoService.buscarExameFisicoPorId(new ExameFisicoBean(id))), HttpStatus.OK);
    }

    /**
     * método responsavel pela busca por string
     * @param exameFisicoBean
     * @return
     */
    @RequestMapping(value = "/buscarString", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> buscarExameFisicoString(@Valid @RequestBody ExameFisicoBean exameFisicoBean) {

        return new ResponseEntity<>(exameFisicoBuilder.montarJsonListExameFisicoBean(exameFisicoService.buscarExameFisicoPorString(exameFisicoBean)), HttpStatus.OK);
    }

    /**
     * método responsavel por listar os usuários
     * @return
     */
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JSONObject>> listarTodos(){

        return new ResponseEntity<>(exameFisicoBuilder.montarJsonListExameFisicoBean(exameFisicoService.listarExameFisico()), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/deletar", method = RequestMethod.POST) 
    public ResponseEntity<Void> deletarExameFisico(@Valid @RequestBody ExameFisicoBean bean) {

        exameFisicoService.deletarExameFisico(bean);

        return ResponseEntity.ok().build();
    }    
}

