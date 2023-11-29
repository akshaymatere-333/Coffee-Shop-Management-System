
package DAO;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author AK
 */
public class UserDao {

    public static void save(User user) {
        String query = " insert into user(Name,Email,MobileNumber,Address,Password,SecurityQuestion,Answer,Status) values('"
                + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress()
                + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer()
                + "','false')";
        DbOperation.setDataorDelete(query, "Registered Successfully!Wait for Admin Approval...");

    }

    public static User Login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperation
                    .getData("select * from user where email='" + email + "'and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperation.getData("select * from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "' where email='" + email + "'";
        DbOperation.setDataorDelete(query, "Password changed Successfully...");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("Select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        DbOperation.setDataorDelete(query, "Status changed Successfully...");

    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperation
                    .getData("select * from user where email ='" + email + "' and password='" + oldPassword + "'");
            if (rs.next()) {
                update(email, newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Old Password Entered");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void changeSecurityQuestion(String email, String Password, String securityQuestion, String answer) {
        try {
            ResultSet rs = DbOperation
                    .getData("select * from user where email ='" + email + "' and password='" + Password + "'");
            if (rs.next()) {
                update(email, securityQuestion, answer);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Old Password Entered");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(String email, String securityQuestion, String answer) {
        String query = "update user set securityQuestion='" + securityQuestion + "',answer='" + answer
                + "' where email='" + email + "'";
        DbOperation.setDataorDelete(query, "SecurityQuestion changed Successfully...");
    }

}
