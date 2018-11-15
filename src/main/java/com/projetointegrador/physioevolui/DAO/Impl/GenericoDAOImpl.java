/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.DAO.Impl;

import com.projetointegrador.physioevolui.DAO.GenericoDAO;
import com.projetointegrador.physioevolui.utils.ExceptionTratada;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * classe generica para realizar a persistencia no banco
 * @param <T>
 * @param <ID>
 */
public class GenericoDAOImpl<T, ID extends Serializable> implements GenericoDAO<T, ID> {

    private final Class<T> oClass;
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public GenericoDAOImpl() {
        this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getObjectClass() {
        return this.oClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * método para incluir dados no banco
     * @param object
     * @return
     * @throws ExceptionTratada
     */
    public T incluir(T object) throws ExceptionTratada {
        try {
            object = getEntityManager().merge(object);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionTratada(e, "Não foi possível realizar a inclusão.");
        }
        return object;
    }

    /**
     * método para alterar dados no banco
     * @param object
     * @return
     * @throws ExceptionTratada
     */
    public T alterar(T object) throws ExceptionTratada {
        try {
            getEntityManager().merge(object);
        } catch (Exception e) {
            throw new ExceptionTratada(e, "Não foi possível realizar a alteração.");
        }
        return object;
    }

    /**
     * método para consultar dados no banco utilizando o id
     * @param id
     * @return
     * @throws ExceptionTratada
     */
    public T consultarPorId(Integer id) throws ExceptionTratada {
        T object = null;
        try {
            object = getEntityManager().find(getObjectClass(), id);
        } catch (EntityNotFoundException e) {
            throw new ExceptionTratada(e, "Registro não encontrado.");
        } catch (Exception e) {
            throw new ExceptionTratada(e, "Não foi possível realizar a consulta.");
        }
        return object;
    }

    /**
     * método para consultar dados no banco utilizando uma string
     * @param nomeAtributo
     * @param string
     * @return
     * @throws ExceptionTratada
     */
    public List consultarPorString(String nomeAtributo, String string) throws ExceptionTratada {

        String hql = "SELECT object(o) FROM " + getObjectClass().getSimpleName() + " AS o where o." + nomeAtributo + " like :string";
        Query query = getEntityManager().createQuery(hql);

        List<T> lista = null;

        query.setParameter("string", "%" + string + "%");

        try {

            lista = query.getResultList();

        } catch (EntityNotFoundException e) {
            throw new ExceptionTratada(e, "Registro não encontrado.");
        } catch (PersistenceException e) {
            throw new ExceptionTratada(e, "Não foi possível conectar ao banco de dados");
        } catch (Exception e) {
            throw new ExceptionTratada(e, "Não foi possível realizar a consulta.");
        }

        return lista;
    }

    /**
     * método para excluir dados no banco
     * @param id
     * @throws ExceptionTratada
     */
    public void excluir(Integer id) throws ExceptionTratada {
        try {
            getEntityManager().remove(getEntityManager().getReference(getObjectClass(), id));
        } catch (EntityNotFoundException e) {
            throw new ExceptionTratada(e, "Registro não encontrado para exclusão.");
        } catch (Exception e) {
            throw new ExceptionTratada(e, "Não foi possível realizar a exclusão.");
        }

    }

    /**
     * método para listar dados do banco
     * @return
     * @throws ExceptionTratada
     */
    @SuppressWarnings("unchecked")
    public List<T> listar() throws ExceptionTratada {
        List<T> lista = null;
        try {
            Query query = getEntityManager().createQuery("SELECT object(o) FROM " + getObjectClass().getSimpleName() + " AS o");
            lista = query.getResultList();
        } catch (PersistenceException e) {
            throw new ExceptionTratada(e, "Não foi possível conectar ao banco de dados");
        } catch (Exception e) {
            throw new ExceptionTratada(e, "Problemas na localização dos objetos");
        }
        return lista;
    }

    public Class<T> getoClass() {
        return oClass;
    }
}
