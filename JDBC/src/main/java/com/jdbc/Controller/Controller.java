package com.jdbc.Controller;

import com.jdbc.Constant.AdminMenu;
import com.jdbc.Constant.UserMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void controller() throws IOException, SQLException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------Press-1-For-Admin-Portal--------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------Press-2-For-User-Portal--------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------Press-0-For-Exit---------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            int reg = scanner.nextInt();
            if (reg == 1) {
                AdminMenu.adminmenu();
            } else if (reg == 2) {
                UserMenu.userMenu();
            } else if (reg==0) {
                break;

            } else {
                System.out.println("invalid number you enter");
            }
        }
    }
}