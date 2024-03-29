
package DAO;

import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author AK
 */
public class CategoryDao {
    public static void save(Category category) {
        String query = "insert into category (name) values('" + category.getName() + "')";
        DbOperation.setDataorDelete(query, "Category Added Successfully");
    }

    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select * from Category");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from Category where id='" + id + "'";
        DbOperation.setDataorDelete(query, "Category deleted Successfully");
    }

}
