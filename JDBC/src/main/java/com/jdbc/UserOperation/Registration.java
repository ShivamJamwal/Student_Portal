package com.jdbc.UserOperation;

import com.jdbc.Constant.UserMenu;
import com.jdbc.Utility.Utility;

import java.sql.*;
import java.util.Scanner;

public class Registration {
    public static void registration() throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user id");
        String uid=sc.nextLine();
        System.out.println("enter the password");
        String pwd=sc.nextLine();
      System.out.println("Confirm the password");
        String uwd=sc.nextLine();
        if(!uwd.equals(pwd)){
            System.out.println("You enter the wrong password ");
            System.out.println("Re-enter the credentials");
            }else{
            Connection connection= Utility.myConnection();
            String sql1="Insert into user values(?,?)";
            PreparedStatement pst=connection.prepareStatement(sql1);
            pst.setString(1,uid);
            pst.setString(2,uwd);
            pst.execute();
            System.out.println("user registered succesfully");

        }


    }

}
