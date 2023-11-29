/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Atul
 */
public class tables {

    public static void main(String[] args) {
        try {
           /* String userTable = "create table user(id int AUTO_INCREMENT primary key,Name varchar(200),Email varchar(200),MobileNumber varchar(10),Address varchar(200),Password varchar(200),SecurityQuestion varchar(300),Answer varchar(200),Status varchar(200),UNIQUE (Email))";
            DbOperation.setDataorDelete(userTable, "user table created Successfully");*/
            String adminDetails = "insert into user(Name,Email,MobileNumber,Address,Password,SecurityQuestion,Answer,Status) values('admin','admin@gmail.com','8149497204','LASALGAON','Admin@123','your nick name?','GANU','true')";
            DbOperation.setDataorDelete(adminDetails, "admin Details added Successfully");
            /*String CategoryTable = "create table Category(id int AUTO_INCREMENT primary key,name varchar(200))";
            DbOperation.setDataorDelete(CategoryTable, "Category Table Created Successfully");
            String ProductTable = "create table Product(id int AUTO_INCREMENT primary key,name varchar(200),category Varchar(200),price varchar(200))";
            DbOperation.setDataorDelete(ProductTable, "Product Table Created Successfully");
            String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber Varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            DbOperation.setDataorDelete(billTable, "bill table created Successfully");*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
