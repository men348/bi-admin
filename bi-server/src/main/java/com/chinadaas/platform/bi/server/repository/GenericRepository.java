package com.chinadaas.platform.bi.server.repository;

import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/7/25.
 */

@Repository
public class GenericRepository {

    @Autowired
    @Qualifier("entityManagerFactory")
    public EntityManager em;

    public <T> T save(T t) {
        em.persist(t);
        return t;
    }

    public <T> void delete(Class<T> clazz, Serializable id) {
        T result = em.find(clazz, id);
        em.remove(result);
    }

    public <T> void delete(T t) {
        em.remove(t);
    }

    public <T> List<T> listAll(Class<T> clazz) {
        TypedQuery<T> query = em.createQuery("select t from " + clazz.getSimpleName() + " t", clazz);
        return query.getResultList();
    }

    public <T> List<T> listByIds(Class<T> clazz, List<? extends Serializable> ids){
        if(ids.size() > 0) {
            StringBuilder jpql = new StringBuilder("select t from " + clazz.getSimpleName() + " t where t.id in (?1");
            jpql.append("?1");
            for (int i = 1; i < ids.size(); i++) {
                jpql.append(", ?" + (i + 1));
            }
            jpql.append(")");

            TypedQuery<T> query = em.createQuery(jpql.toString(), clazz);

            int index = 1;
            for (Serializable id : ids) {
                query.setParameter(index++, id);
            }
            return query.getResultList();
        }
        return null;
    }

    public <T> T get(Class<T> clazz, Serializable key) {
        return em.find(clazz, key);
    }

    public <T> T load(Class<T> clazz, Serializable key) throws NotFoundException {
        T result = em.find(clazz, key);
        if(result == null) {
            throw new NotFoundException("not found!!!");
        }

        return result;
    }

    public <T> T merge(T t) {
        return em.merge(t);
    }

    public void flush() {
        em.flush();
    }

    public <T> T refresh(T t){
        em.refresh(t);
        return t;
    }

    public <T> int batchUpdate(Class<T> clazz, String jpql, List<?> params) {
        TypedQuery query = em.createQuery(jpql, clazz);
        int index = 1;
        for(Object param : params) {
            query.setParameter(index++, param);
        }
        return query.executeUpdate();
    }

    public <T> int batchUpdate(Class<T> clazz, String jpql,Map<String, Object> params) {
        TypedQuery query = em.createQuery(jpql, clazz);
        int index = 1;
        for(String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        return query.executeUpdate();
    }

    public <T> int batchDelete(Class<T> clazz, List<? extends Serializable> ids) {
        if(ids.size() > 0) {
            StringBuilder jpql = new StringBuilder("delete from " + clazz.getSimpleName() + " t where t.id in (?1");
            for(int i = 1; i < ids.size(); i++) {
                jpql.append(", ?" + (i + 1));
            }
            jpql.append(")");
            return this.batchUpdate(clazz, jpql.toString(), ids);
        }

        return 0;
    }

    public TypedQuery<Long> createCountQuery(String countJpql, Map<String, Object> params) {
        TypedQuery<Long> query = em.createQuery(countJpql, Long.class);
        for (String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        return query;
    }

    public long count(String jpql, Map<String, Object> params) {
        TypedQuery<Long> query = this.createCountQuery(jpql, params);
        return query.getSingleResult();
    }

    public <T> TypedQuery<T> createQuery(Class<T> clazz, String jpql, Map<String, Object> params) {
        TypedQuery<T> query = em.createQuery(jpql, clazz);
        for (String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        return query;
    }

    public <T> PaginateHolder<T> paginate(Class<T> clazz, String queryJpql, String countJpql, int startIndex, int size, Map<String, Object> params) {
        PaginateHolder<T> result = new PaginateHolder<>();
        TypedQuery<T> query = this.createQuery(clazz, queryJpql, params);
        query.setFirstResult(startIndex);
        query.setMaxResults(size);

        result.setResults(query.getResultList());
        result.setTotalCount(this.count(countJpql, params));
        result.setPageSize(size);

        return result;
    }

    public <T> List<T> queryJobs(Class<T> clazz, String queryJpql, Map<String, Object> params) {
            TypedQuery<T> query = this.createQuery(clazz, queryJpql, params);
        return query.getResultList();
    }
}
