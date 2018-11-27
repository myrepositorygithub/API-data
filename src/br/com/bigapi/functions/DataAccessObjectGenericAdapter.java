package br.com.bigapi.functions;

import br.com.bigapi.basic.DataAccessObjectGeneric;
import br.com.bigapi.core.AbstractBean;
import java.util.List;

/**
 *
 * @author Thiago
 * @param <T>
 */
public class DataAccessObjectGenericAdapter<T extends AbstractBean> implements DataAccessObjectGeneric<T>{

    @Override
    public T getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> findEntity(int maxResults) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findEntityCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
