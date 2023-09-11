package com.jdbc.Constant;

import com.jdbc.AdminOperation.AdminLogin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminMenu {
    public static void adminmenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------Admin-Portal--------------------------------");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("#######################################");
            System.out.println("********Welcome to admin portal********");
            System.out.println("#######################################");
            System.out.println("$$$$$$Enter 1 for admin login$$$$$$");
            System.out.println("$$$$$$Enter o for exit$$$$$$$$");
            int reg = sc.nextInt();
            if (reg == 1) {

                try {
                    AdminLogin.adminLogin();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (reg==0) {
                break;
            } else {
                System.out.println("Inavlid nuber");
            }
        }
    }
}

