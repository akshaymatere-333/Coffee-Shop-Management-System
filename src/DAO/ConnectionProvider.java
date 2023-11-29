
package DAO;

import java.sql.*;

/**
 *
 * @author AK
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms2?useSSl=false", "root",
                    "root");
            return con;

        } catch (Exception e) {
            return null;
        }
    }

}
