/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.DAO;

import com.projetointegrador.physioevolui.utils.ExceptionTratada;

import java.io.Serializable;
import java.util.List;

public interface GenericoDAO<T, ID extends Serializable> {

    /**
     * Retorna a classe a ser persistida
     *
     * @return
     */
    public Class<T> getObjectClass();

    /**
     * Inclui um objeto T na base de dados
     *
     * @param object
     * @return
     * @throws ExceptionTratada
     */
    public T incluir(T object) throws ExceptionTratada;

    /**
     * Altera um objeto T na base de dados
     *
     * @param object
     * @return
     * @throws ExceptionTratada
     */
    public T alterar(T object) throws ExceptionTratada;

    /**
     * Consulta um objeto T por uma string na base de dados
     *
     * @param id
     * @return
     * @throws ExceptionTratada
     */
    public T consultarPorId(Integer id) throws ExceptionTratada;

    /**
     * @param nomeAtributo
     * @param string
     * @return
     */
    public List consultarPorString(String nomeAtributo, String string) throws ExceptionTratada;

    /**
     * Exclui um objeto T  da base de dados
     *
     * @param id
     * @throws ExceptionTratada
     */
    public void excluir(Integer id) throws ExceptionTratada;

    /**
     * Lista os objetos T da base de dados
     *
     * @return
     * @throws ExceptionTratada
     */
    public List<T> listar() throws ExceptionTratada;
}