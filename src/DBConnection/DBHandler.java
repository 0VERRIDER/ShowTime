
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHandler extends Configs {
    Connection dbconnection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String ConnectionString = "jdbc:mysql://" + dbhost + ":" + dbport + "/" + dbname + "?autoReconnect=true&useSSL=false";
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbconnection = DriverManager.getConnection(ConnectionString, dbuser, dbpass);

        return dbconnection;
    }
}
