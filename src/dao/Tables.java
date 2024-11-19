/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st=con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobilenumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
            //st.executeUpdate("insert into appuser(userRole,name,mobilenumber,email,password,address,status)values('Admin','Admin','12345','Admin@gmail.com','Admin','Kenya','Active')");
            //st.executeUpdate("CREATE TABLE livestock (livestock_pk int AUTO_INCREMENT primary key,name varchar(200),quantity varchar(50))");
            //st.executeUpdate("CREATE TABLE product (product_pk int AUTO_INCREMENT primary key,name varchar(200),quantity varchar(50),price int,description varchar(500),livestock_fk int)");
            st.executeUpdate("CREATE TABLE customer (customer_pk int AUTO_INCREMENT primary key,worker varchar(200),livestock varchar(200),time varchar(50),location varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}
