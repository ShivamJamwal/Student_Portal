package com.jdbc.AdminOperation;

import com.jdbc.Utility.Utility;

import java.io.IOException;
import java.sql.*;

import static com.jdbc.Controller.Controller.bf;

public class CreateStudent {
    public static void create() throws IOException, SQLException {
        System.out.println("enter the id fo the student");
        int id= Integer.parseInt(bf.readLine());
        System.out.println("enter the name of the student");
        String name= bf.readLine();
        System.out.println("Enter the email");
        String email= bf.readLine();
        Connection connection=Utility.myConnection();
       String sql1="Insert into student values(?,?,?)";
        PreparedStatement pst= connection.prepareStatement(sql1);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,email);

        pst.executeUpdate();
        System.out.println("user added succesfully");
}}
