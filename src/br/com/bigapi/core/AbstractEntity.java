package br.com.bigapi.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thiago
 */
/**
 * <p>
 * Provides for the specification of generation strategies for the values of
 * primary keys, strategy = GenerationType.IDENTITY
 * <p>
 * @author Thiago
 */
public abstract class AbstractEntity {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
