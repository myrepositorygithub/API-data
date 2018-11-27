package br.com.bigapi.basic;

import br.com.bigapi.core.AbstractBean;
import java.util.List;

/**
 *
 * @author Thiago
 * @param <T>
 */
public interface DataAccessObjectGeneric<T extends AbstractBean> {

    public T getById(Long id);

    public void create(T entity);

    public void destroy(T entity);

    public List<T> findAll();

    public List<T> findEntity(int maxResults);

    public int findEntityCount();
}
