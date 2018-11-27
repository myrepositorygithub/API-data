package br.com.bigapi.basic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * <p>
 * Parameters required to obtain a database connection: [1]databasename
 * [2]driver [3]user [4]password [5]port [6]host [7]Url
 * <p>
 * @author Thiago
 */
public interface JavaDatabaseConnectivity {

    public abstract Connection openConnection(Properties properties) throws SQLException;
}
