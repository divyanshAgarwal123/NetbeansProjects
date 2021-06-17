/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author divya
 */
public class UserDao {
    public static Connection getConnection() 
            {
                Connection con = null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                con =DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
                return con;
            }
    public static int save(user u)
    {
        int status = 0;
        try{
            Connection con = getConnection();
             PreparedStatement ac = con.prepareStatement("insert into crude(username,userpassword,country) values(?,?,?)");
                ac.setString(1,u.getUsername());
                ac.setString(2,u.getUserpassword());
                ac.setString(3,u.getCountry());
                status= ac.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return status;
    }
    public static List<user> getAllRecords() throws SQLException
    {
        List<user>list = new ArrayList<user>(); 
        try
        {
            Connection con = getConnection();
             PreparedStatement ac = con.prepareStatement("select * from crude");
             ResultSet rs = ac.executeQuery();
             while(rs.next())
             {
             user u = new user();
             u.setId(rs.getInt("id"));
             u.setUsername(rs.getString("username"));
             u.setUserpassword(rs.getString("userpassword"));
             u.setCountry(rs.getString("country"));
             list.add(u);
             }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return list;
    }
}