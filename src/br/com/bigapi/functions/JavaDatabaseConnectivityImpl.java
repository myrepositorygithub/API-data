package br.com.bigapi.functions;

import br.com.bigapi.basic.JavaDatabaseConnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Thiago
 */
public class JavaDatabaseConnectivityImpl implements JavaDatabaseConnectivity {

    @Override
    public Connection openConnection(Properties properties) throws SQLException {
        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
        return connection;
    }

}
