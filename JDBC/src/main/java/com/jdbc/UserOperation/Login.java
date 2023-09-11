package com.jdbc.UserOperation;

import com.jdbc.Constant.UserMenu;
import com.jdbc.Utility.Utility;

import java.sql.*;
import java.util.Scanner;

public class Login {
    public static void login() throws SQLException {
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the userid");
            String vid = sc.nextLine();
            Connection connection = Utility.myConnection();
            Statement statement = connection.createStatement();
            String sql = "Select *from user where Username='" + vid + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next() == false) {
                System.out.println("no user found");

            } else {
                System.out.println("enter the password");
                String pwd = sc.nextLine();
                Connection connection1 = Utility.myConnection();
                Statement statement1 = connection1.createStatement();
                String sql2 = "select * from user where Username='" + vid + "' and " + "password='" + pwd + "'";
                ResultSet resultSet1 = statement1.executeQuery(sql2);
                if (resultSet1.next() == false) {

                    System.out.println("Invalid Credentials you add");
                    System.out.println("Try again");

                } else {
                    System.out.println("Login Succesfull");
                    System.out.println("---------------------------------Welcome User----------------------------");
                    System.out.println("---------------------------------press 1 for user details----------------");
                    System.out.println("---------------------------------press o for back to userMenu------------------------");
                    int reg = sc.nextInt();
                    if (reg == 1) {
                        UserDetails.userDetails();
                    } else if (reg==0) {
                        UserMenu.userMenu();
                    }else
                    {
                        System.out.println("Invalid choice you enter");
                    }
                }
            }


        }
    }
}