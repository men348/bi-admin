package com.chinadaas.platform.bi.server.entrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/8/9.
 */
@Repository
public class CommonRepository {

    @Autowired
    @Qualifier("secondaryEntityManagerFactory")
    private EntityManager em;

    private Query createNativeQuery(String jpql, Map<String, Object> param) {
        Query query = em.createNativeQuery(jpql);
        for (String key : param.keySet()) {
            query.setParameter(key, param.get(key));
        }
        return query;
    }

    public List queryList(String queryJpql, Map<String, Object> params) {
        Query query = this.createNativeQuery(queryJpql, params);
        query.setFirstResult(0);
        query.setMaxResults(100);
        return query.getResultList();
    }

    private <T> TypedQuery<T> createQuery(Class<T> clazz, String jpql, Map<String, Object> params) {
        TypedQuery<T> query = em.createQuery(jpql, clazz);
        for (String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        return query;
    }

    public <T> List<T> queryResult(Class<T> clazz, String queryJpql, Map<String, Object> params) {
        TypedQuery query = this.createQuery(clazz, queryJpql, params);
        return query.getResultList();
    }
}
