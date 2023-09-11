package com.jdbc.AdminOperation;

import com.jdbc.Utility.Utility;

import java.sql.*;

public class Show {
    public static void showStudent() throws SQLException {
        Connection connection= Utility.myConnection();
        Statement statement=connection.createStatement();
        String sql="Select * from student  ";
        System.out.println("ID\tName\tGmail");
        System.out.println("--------------------");
        ResultSet rs=statement.executeQuery(sql);
        boolean flag=false;
        while(rs.next()){
             flag=true;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        if(flag==false){
            System.out.println("No record found");
        }

    }
}
