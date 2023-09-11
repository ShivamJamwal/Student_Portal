package com.jdbc.UserOperation;

import com.jdbc.Constant.UserMenu;
import com.jdbc.Utility.Utility;

import java.sql.*;
import java.util.Scanner;

public class UserDetails {
    public static void userDetails() throws SQLException {
        Scanner sc= new Scanner(System.in);
            Connection connection= Utility.myConnection();
            Statement statement=connection.createStatement();
            String sql="Select * from student Right JOIN user on gmail=Username";
            System.out.println("ID\tName\tGmail");
            System.out.println("--------------------");
            ResultSet rs=statement.executeQuery(sql);
            boolean flag=false;
            while(rs.next()){
                flag=true;
                System.out.println(
                rs.getString(1)+"\t"+
                rs.getString(2)+"\t"+
                rs.getString(3));
                System.out.println("--------------------");
                System.out.println("Press 1 for continue");
                System.out.println("Press 0 for exit");
                int reg=sc.nextInt();
                if(reg==1){
                    UserMenu.userMenu();
                } else if (reg==0) {
                    System.exit(0);
                }
            }
            if(flag==false){
                System.out.println("No record found");
            }

        }
    }

