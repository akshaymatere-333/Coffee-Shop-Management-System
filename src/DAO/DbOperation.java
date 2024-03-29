
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AK
 */
public class DbOperation {
    public static void setDataorDelete(String Query, String msg) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "message", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static ResultSet getData(String query) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
