
package com.projetointegrador.physioevolui.service.impl;

import com.projetointegrador.physioevolui.DAO.PacienteDAO;
import com.projetointegrador.physioevolui.bean.PacienteBean;
import com.projetointegrador.physioevolui.bean.ErroBean;
import com.projetointegrador.physioevolui.bean.UsuarioBean;
import com.projetointegrador.physioevolui.builder.PacienteBuilder;
import com.projetointegrador.physioevolui.service.PacienteService;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonatas
 */

@Service
@Transactional
public class PacienteServiceImpl implements PacienteService {
    
    
        
    @Autowired
    private PacienteDAO pacienteDAO;

    @Autowired
    private PacienteBuilder pacienteBuilder;

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a criar usuário
     * @param pacienteBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PacienteBean criarPaciente(PacienteBean pacienteBean) {
        try {
            return pacienteBuilder.montarPacienteBean(pacienteDAO.incluir(pacienteBuilder.montarPacienteEntity(pacienteBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }
    
    
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deletarPaciente(PacienteBean pacienteBean){
        
        try {
            pacienteDAO.excluir(pacienteBean.getInt_id_paciente());
        } catch (ExceptionTratada ex) {
            Logger.getLogger(PacienteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a alterar usuário
     * @param pacienteBean
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public PacienteBean alterarPaciente(PacienteBean pacienteBean) {
        try {
            return pacienteBuilder.montarPacienteBean(pacienteDAO.alterar(pacienteBuilder.montarPacienteEntity(pacienteBean)));
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por id
     * @param pacienteBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public PacienteBean buscarPacientePorId(PacienteBean pacienteBean) {
        try {
            pacienteBean = pacienteBuilder.montarPacienteBean(pacienteDAO.consultarPorId(pacienteBean.getInt_id_paciente()));
            if (pacienteBean.getInt_id_paciente()== null) {
              //  pacienteBean.setStr_login("Não encontrado");
            }
            return pacienteBean;
        } catch (Exception e) {
            return montarErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a buscar usuário por string
     * @param pacienteBean
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<PacienteBean> buscarPacientePorString(PacienteBean pacienteBean) {
        try {

            List<PacienteBean> pacienteBeanList = pacienteBuilder.montarListPacienteBean(pacienteDAO.consultarPorString("str_nome_paciente", pacienteBean.getStr_nome_paciente() ));

            if (pacienteBeanList.size() == 0) {
                throw new ExceptionTratada("Paciente não encontrado");
            }
            return pacienteBeanList;
        } catch (ExceptionTratada e) {
            return montarListaErro(e);
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    /**
     * método responsável pelas regras de implementação da regra de negócio pertencente a listar todos os usuários
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<PacienteBean> listarPaciente() {
        try {
            return pacienteBuilder.montarListPacienteBean(pacienteDAO.listar());
        } catch (ExceptionTratada e) {
            return montarListaErro(e);
        } catch (Exception e) {
            return montarListaErro(e);
        }
    }

    /**
     * método responsável por montar lista de objetos de retorno com erros tratados
     * @param e
     * @return
     */
    private List<PacienteBean> montarListaErro(ExceptionTratada e) {
        List<PacienteBean> beans = new ArrayList<>();
        beans.add(new PacienteBean(new ErroBean(true, e.getMsg())));
        return beans;
    }

    /**
     * método responsável por montar lista de objetos de retorno com o erros não tratados
     * @param e
     * @return
     */
    private List<PacienteBean> montarListaErro(Exception e) {
        List<PacienteBean> beans = new ArrayList<>();
        beans.add(new PacienteBean(new ErroBean(true, e.getStackTrace())));
        return beans;
    }

    /**
     * método responsável por montar objeto de retorno com o erro não
     * tratado
     * @param e
     * @return
     */
    private PacienteBean montarErro(Exception e) {
        return new PacienteBean(new ErroBean(true, e.getStackTrace()));
    }

    /**
     * método responsável por montar objeto de retorno com o erro tratado
     * @param e
     * @return
     */
    private PacienteBean montarErro(ExceptionTratada e) {
        return new PacienteBean(new ErroBean(true, e.getStackTrace()));
        
    }
}
