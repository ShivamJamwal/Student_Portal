package com.jdbc.Constant;
import com.jdbc.AdminOperation.AdminLogin;
import com.jdbc.UserOperation.Login;
import com.jdbc.UserOperation.Registration;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
public class UserMenu {
    public static void userMenu() throws SQLException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------User-Portal---------------------------------");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("#######################################");
            System.out.println("********Welcome to user portal********");
            System.out.println("#######################################");
            System.out.println("$$$$$$Enter 1 for user login$$$$$$");
            System.out.println("$$$$$$enter 2 for user registration$$$$$");
            System.out.println("$$$$$$Enter o for exit$$$$$$$$");
            int reg = sc.nextInt();
            if (reg == 1) {
                Login.login();
            } else if (reg == 2) {
                Registration.registration();

            } else if (reg == 0) {
                break;

            }else{
                System.out.println("Invalid number you enter");
            }
        }
    }
}