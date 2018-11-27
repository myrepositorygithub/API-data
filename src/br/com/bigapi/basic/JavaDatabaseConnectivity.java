package br.com.bigapi.basic;

import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author Thiago
 */
public interface JavaDatabaseConnectivity {

    public abstract Connection openConnection(Properties properties);
}
