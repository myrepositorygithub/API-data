package br.com.bigapi.basic;

import br.com.bigapi.core.AbstractEntity;
import java.util.List;

/**
 *
 * @author Thiago
 * @param <T>
 */
public interface HibernateGenericDAO<T extends AbstractEntity> {

    public T getById(Long id);

    public void create(T entity);

    public void destroy(T entity);

    public List<T> findAll();

    public List<T> findEntity(int maxResults, int firstResult);

    public List<T> findEntities(boolean all, int maxResults, int firstResult);

    public int findEntityCount();

}
